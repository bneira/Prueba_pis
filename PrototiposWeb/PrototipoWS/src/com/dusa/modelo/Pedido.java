package com.dusa.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.dusa.logica.ManejadorProducto;
import com.dusa.modelo.datatypes.DataBackOrder;
import com.dusa.modelo.datatypes.DataResultConfirmPedido;

/**
 * Entity implementation class for Entity: Pedido
 *
 */
@Entity
@Table(name="WEBPEDIDOS")
public class Pedido implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Pedido() {
		super();
		setLineas(new LinkedList<PedidoLinea>());
		setEliminado('N');
	}
	
	@Id
	@Column(name = "IDPEDIDO", nullable = false)
	@GeneratedValue(generator="GeneradorIdPedido")
	@SequenceGenerator(name="GeneradorIdPedido",sequenceName="SeqWebPedido",allocationSize=1)
	private int idPedido;
	
	@Column(name = "FECHA", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date fecha;
	
	@JoinColumn(name="IDESTADOPEDIDO",referencedColumnName = "IDESTADOPEDIDO")
	private EstadoPedido estado;
	
	@JoinColumn(name="USUARIO",referencedColumnName = "USUARIO")
	private UsuarioFarmacia usuario;
	
	
	@JoinColumns({
		@JoinColumn(name="REPARTO",referencedColumnName = "REPARTO"), 
	    @JoinColumn(name="NRO_CLIENTE",referencedColumnName = "NRO_CLIENTE")
	})	
	private Reparto reparto;
	
	@JoinColumn(name="IDFORMADEPAGO",referencedColumnName = "IDFORMADEPAGO")
	private FormaDePago formaDePago;	
	
	@OneToMany (cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH})
	@JoinColumn(name="IDPEDIDO")	
	private List<PedidoLinea> lineas;
	
	@OneToMany ()
	@JoinColumn(name="IDPEDIDO")	
	private List<BackOrderLinea> lineasBackOrder;
	
	@Column(name = "ELIMINADO", nullable = false)
	private char Eliminado;
	
	public List<BackOrderLinea> getLineasBackOrder() {
		return lineasBackOrder;
	}
	public void setLineasBackOrder(List<BackOrderLinea> lineasBackOrder) {
		this.lineasBackOrder = lineasBackOrder;
	}

	public int getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public EstadoPedido getEstado() {
		return estado;
	}
	public void setEstado(EstadoPedido estado) {
		this.estado = estado;
	}
	public UsuarioFarmacia getUsuario() {
		return usuario;
	}
	public void setUsuario(UsuarioFarmacia usuario) {
		this.usuario = usuario;
	}
	public Reparto getReparto() {
		return reparto;
	}
	public void setReparto(Reparto reparto) {
		this.reparto = reparto;
	}
	public FormaDePago getFormaDePago() {
		return formaDePago;
	}
	public void setFormaDePago(FormaDePago formaDePago) {
		this.formaDePago = formaDePago;
	}
	public List<PedidoLinea> getLineas() {
		return lineas;
	}
	public void setLineas(List<PedidoLinea> lineas) {
		this.lineas = lineas;
	}

	
	public char getEliminado() {
		return Eliminado;
	}
	public void setEliminado(char eliminado) {
		Eliminado = eliminado;
	}
	
	public void agregarProducto(int prodId, int cant, char conReceta) {
		
		ManejadorProducto manProd = ManejadorProducto.getInstance(); 
		Producto prod = manProd.find(prodId);
		PedidoLinea linea = new PedidoLinea();
		linea.setCantidad(cant);
		linea.setProducto(prod);
		linea.setEliminado('N');
		linea.getPedidoLineaPK().setConReceta(conReceta);
		linea.setPedido(this);
		lineas.add(linea);
		
	}
	
	public void eliminarProducto(int prodId, char conReceta) {
		
		for ( PedidoLinea linea : lineas)
		{
			if (linea.getPedidoLineaPK().getIdProducto() == prodId && linea.getPedidoLineaPK().getConReceta() == conReceta) {
				linea.setEliminado('S');
				break;
			}
		}
		
	}
	
	public void terminarPedido() {
		
		//********************* SACAR ESTO DE PERSISTENCIA
		ManejadorJPA manejador = new ManejadorJPA();
		manejador.contextInitialized();
		EntityManager em = manejador.crearEntityManager();
		
		//******************************** 
		
		EstadoPedido estadoPedConf = em.find(EstadoPedido.class,ConstantesDominio.ID_ESTADO_PEDIDO_CONFIRMADO);
		this.setEstado(estadoPedConf);
	}
	
	public DataResultConfirmPedido confirmarPedido() {
		this.terminarPedido();
		DataResultConfirmPedido data = new DataResultConfirmPedido();
		double monto = 0;
		List<DataBackOrder> listbk = new LinkedList<DataBackOrder>();
		for ( PedidoLinea linea : lineas)
		{
			if (linea.getEliminado() == 'N') {
				monto = monto + linea.getProducto().getPrecio();
				if (linea.getCantidad() > linea.getProducto().getStock()) {
					//Si la cantidad es mayor a lo que hay en stoc, agrego al backorder
					BackOrderLinea bk = new BackOrderLinea();
					bk.setCantidad(linea.getCantidad() -  linea.getProducto().getStock());
					bk.setEliminado('N');
					bk.setPedido(this);
					bk.setProducto(linea.getProducto());
					DataBackOrder dbk = new DataBackOrder();
					dbk.setCantidad(linea.getCantidad() -  linea.getProducto().getStock());
					dbk.setNro_producto(linea.getProducto().getNroArticulo());
					listbk.add(dbk);
					lineasBackOrder.add(bk);
				}
			}
		}
		data.setBk(listbk);
		data.setMonto(monto);
		return data;
	}
	
	public void setRepartoUsuario(int repartoId) {
		Reparto reparto = this.getUsuario().obtenerReparto(repartoId);
		this.setReparto(reparto);
	}
	
	public void setFormaPagoUsuario(String formaPagoId) {
		FormaDePago forma = this.getUsuario().obtenerFormaDePago(formaPagoId);
		this.setFormaDePago(forma);
	}
	
	public boolean existeLineaProd() {
		boolean existe = false;
		if (lineas != null) {
			for ( PedidoLinea linea : lineas)
			{
				if (linea.getEliminado() == 'N') {
					existe = true;
					break;
				}
			}
		}
		return existe;
	}
	
   
}
