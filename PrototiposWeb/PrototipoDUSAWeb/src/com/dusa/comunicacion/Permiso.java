/**
 * Permiso.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dusa.comunicacion;

public class Permiso  implements java.io.Serializable {
    private java.lang.String descripcion;

    private org.apache.axis.types.UnsignedShort eliminado;

    private java.lang.String idPermiso;

    public Permiso() {
    }

    public Permiso(
           java.lang.String descripcion,
           org.apache.axis.types.UnsignedShort eliminado,
           java.lang.String idPermiso) {
           this.descripcion = descripcion;
           this.eliminado = eliminado;
           this.idPermiso = idPermiso;
    }


    /**
     * Gets the descripcion value for this Permiso.
     * 
     * @return descripcion
     */
    public java.lang.String getDescripcion() {
        return descripcion;
    }


    /**
     * Sets the descripcion value for this Permiso.
     * 
     * @param descripcion
     */
    public void setDescripcion(java.lang.String descripcion) {
        this.descripcion = descripcion;
    }


    /**
     * Gets the eliminado value for this Permiso.
     * 
     * @return eliminado
     */
    public org.apache.axis.types.UnsignedShort getEliminado() {
        return eliminado;
    }


    /**
     * Sets the eliminado value for this Permiso.
     * 
     * @param eliminado
     */
    public void setEliminado(org.apache.axis.types.UnsignedShort eliminado) {
        this.eliminado = eliminado;
    }


    /**
     * Gets the idPermiso value for this Permiso.
     * 
     * @return idPermiso
     */
    public java.lang.String getIdPermiso() {
        return idPermiso;
    }


    /**
     * Sets the idPermiso value for this Permiso.
     * 
     * @param idPermiso
     */
    public void setIdPermiso(java.lang.String idPermiso) {
        this.idPermiso = idPermiso;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Permiso)) return false;
        Permiso other = (Permiso) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.descripcion==null && other.getDescripcion()==null) || 
             (this.descripcion!=null &&
              this.descripcion.equals(other.getDescripcion()))) &&
            ((this.eliminado==null && other.getEliminado()==null) || 
             (this.eliminado!=null &&
              this.eliminado.equals(other.getEliminado()))) &&
            ((this.idPermiso==null && other.getIdPermiso()==null) || 
             (this.idPermiso!=null &&
              this.idPermiso.equals(other.getIdPermiso())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDescripcion() != null) {
            _hashCode += getDescripcion().hashCode();
        }
        if (getEliminado() != null) {
            _hashCode += getEliminado().hashCode();
        }
        if (getIdPermiso() != null) {
            _hashCode += getIdPermiso().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Permiso.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comunicacion.dusa.com/", "permiso"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descripcion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eliminado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eliminado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedShort"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idPermiso");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idPermiso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
