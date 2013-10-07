/**
 * Usuario.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dusa.comunicacion;

public abstract class Usuario  implements java.io.Serializable {
    private java.lang.String clave;

    private org.apache.axis.types.UnsignedShort eliminado;

    private java.lang.String email;

    private org.apache.axis.types.UnsignedShort habilitado;

    private org.apache.axis.types.UnsignedShort logueado;

    private java.lang.String nombre;

    private com.dusa.comunicacion.Rol[] roles;

    private java.lang.String usuario;

    public Usuario() {
    }

    public Usuario(
           java.lang.String clave,
           org.apache.axis.types.UnsignedShort eliminado,
           java.lang.String email,
           org.apache.axis.types.UnsignedShort habilitado,
           org.apache.axis.types.UnsignedShort logueado,
           java.lang.String nombre,
           com.dusa.comunicacion.Rol[] roles,
           java.lang.String usuario) {
           this.clave = clave;
           this.eliminado = eliminado;
           this.email = email;
           this.habilitado = habilitado;
           this.logueado = logueado;
           this.nombre = nombre;
           this.roles = roles;
           this.usuario = usuario;
    }


    /**
     * Gets the clave value for this Usuario.
     * 
     * @return clave
     */
    public java.lang.String getClave() {
        return clave;
    }


    /**
     * Sets the clave value for this Usuario.
     * 
     * @param clave
     */
    public void setClave(java.lang.String clave) {
        this.clave = clave;
    }


    /**
     * Gets the eliminado value for this Usuario.
     * 
     * @return eliminado
     */
    public org.apache.axis.types.UnsignedShort getEliminado() {
        return eliminado;
    }


    /**
     * Sets the eliminado value for this Usuario.
     * 
     * @param eliminado
     */
    public void setEliminado(org.apache.axis.types.UnsignedShort eliminado) {
        this.eliminado = eliminado;
    }


    /**
     * Gets the email value for this Usuario.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this Usuario.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the habilitado value for this Usuario.
     * 
     * @return habilitado
     */
    public org.apache.axis.types.UnsignedShort getHabilitado() {
        return habilitado;
    }


    /**
     * Sets the habilitado value for this Usuario.
     * 
     * @param habilitado
     */
    public void setHabilitado(org.apache.axis.types.UnsignedShort habilitado) {
        this.habilitado = habilitado;
    }


    /**
     * Gets the logueado value for this Usuario.
     * 
     * @return logueado
     */
    public org.apache.axis.types.UnsignedShort getLogueado() {
        return logueado;
    }


    /**
     * Sets the logueado value for this Usuario.
     * 
     * @param logueado
     */
    public void setLogueado(org.apache.axis.types.UnsignedShort logueado) {
        this.logueado = logueado;
    }


    /**
     * Gets the nombre value for this Usuario.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this Usuario.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the roles value for this Usuario.
     * 
     * @return roles
     */
    public com.dusa.comunicacion.Rol[] getRoles() {
        return roles;
    }


    /**
     * Sets the roles value for this Usuario.
     * 
     * @param roles
     */
    public void setRoles(com.dusa.comunicacion.Rol[] roles) {
        this.roles = roles;
    }

    public com.dusa.comunicacion.Rol getRoles(int i) {
        return this.roles[i];
    }

    public void setRoles(int i, com.dusa.comunicacion.Rol _value) {
        this.roles[i] = _value;
    }


    /**
     * Gets the usuario value for this Usuario.
     * 
     * @return usuario
     */
    public java.lang.String getUsuario() {
        return usuario;
    }


    /**
     * Sets the usuario value for this Usuario.
     * 
     * @param usuario
     */
    public void setUsuario(java.lang.String usuario) {
        this.usuario = usuario;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Usuario)) return false;
        Usuario other = (Usuario) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clave==null && other.getClave()==null) || 
             (this.clave!=null &&
              this.clave.equals(other.getClave()))) &&
            ((this.eliminado==null && other.getEliminado()==null) || 
             (this.eliminado!=null &&
              this.eliminado.equals(other.getEliminado()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.habilitado==null && other.getHabilitado()==null) || 
             (this.habilitado!=null &&
              this.habilitado.equals(other.getHabilitado()))) &&
            ((this.logueado==null && other.getLogueado()==null) || 
             (this.logueado!=null &&
              this.logueado.equals(other.getLogueado()))) &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            ((this.roles==null && other.getRoles()==null) || 
             (this.roles!=null &&
              java.util.Arrays.equals(this.roles, other.getRoles()))) &&
            ((this.usuario==null && other.getUsuario()==null) || 
             (this.usuario!=null &&
              this.usuario.equals(other.getUsuario())));
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
        if (getClave() != null) {
            _hashCode += getClave().hashCode();
        }
        if (getEliminado() != null) {
            _hashCode += getEliminado().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getHabilitado() != null) {
            _hashCode += getHabilitado().hashCode();
        }
        if (getLogueado() != null) {
            _hashCode += getLogueado().hashCode();
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        if (getRoles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRoles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRoles(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUsuario() != null) {
            _hashCode += getUsuario().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Usuario.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comunicacion.dusa.com/", "usuario"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clave");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clave"));
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
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("habilitado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "habilitado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedShort"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logueado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "logueado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedShort"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roles");
        elemField.setXmlName(new javax.xml.namespace.QName("", "roles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comunicacion.dusa.com/", "rol"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usuario"));
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
