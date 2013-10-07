/**
 * Rol.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dusa.comunicacion;

public class Rol  implements java.io.Serializable {
    private java.lang.String descripcion;

    private org.apache.axis.types.UnsignedShort eliminado;

    private java.lang.String idRol;

    private com.dusa.comunicacion.Permiso[] permisos;

    public Rol() {
    }

    public Rol(
           java.lang.String descripcion,
           org.apache.axis.types.UnsignedShort eliminado,
           java.lang.String idRol,
           com.dusa.comunicacion.Permiso[] permisos) {
           this.descripcion = descripcion;
           this.eliminado = eliminado;
           this.idRol = idRol;
           this.permisos = permisos;
    }


    /**
     * Gets the descripcion value for this Rol.
     * 
     * @return descripcion
     */
    public java.lang.String getDescripcion() {
        return descripcion;
    }


    /**
     * Sets the descripcion value for this Rol.
     * 
     * @param descripcion
     */
    public void setDescripcion(java.lang.String descripcion) {
        this.descripcion = descripcion;
    }


    /**
     * Gets the eliminado value for this Rol.
     * 
     * @return eliminado
     */
    public org.apache.axis.types.UnsignedShort getEliminado() {
        return eliminado;
    }


    /**
     * Sets the eliminado value for this Rol.
     * 
     * @param eliminado
     */
    public void setEliminado(org.apache.axis.types.UnsignedShort eliminado) {
        this.eliminado = eliminado;
    }


    /**
     * Gets the idRol value for this Rol.
     * 
     * @return idRol
     */
    public java.lang.String getIdRol() {
        return idRol;
    }


    /**
     * Sets the idRol value for this Rol.
     * 
     * @param idRol
     */
    public void setIdRol(java.lang.String idRol) {
        this.idRol = idRol;
    }


    /**
     * Gets the permisos value for this Rol.
     * 
     * @return permisos
     */
    public com.dusa.comunicacion.Permiso[] getPermisos() {
        return permisos;
    }


    /**
     * Sets the permisos value for this Rol.
     * 
     * @param permisos
     */
    public void setPermisos(com.dusa.comunicacion.Permiso[] permisos) {
        this.permisos = permisos;
    }

    public com.dusa.comunicacion.Permiso getPermisos(int i) {
        return this.permisos[i];
    }

    public void setPermisos(int i, com.dusa.comunicacion.Permiso _value) {
        this.permisos[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Rol)) return false;
        Rol other = (Rol) obj;
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
            ((this.idRol==null && other.getIdRol()==null) || 
             (this.idRol!=null &&
              this.idRol.equals(other.getIdRol()))) &&
            ((this.permisos==null && other.getPermisos()==null) || 
             (this.permisos!=null &&
              java.util.Arrays.equals(this.permisos, other.getPermisos())));
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
        if (getIdRol() != null) {
            _hashCode += getIdRol().hashCode();
        }
        if (getPermisos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPermisos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPermisos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Rol.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comunicacion.dusa.com/", "rol"));
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
        elemField.setFieldName("idRol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idRol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permisos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "permisos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comunicacion.dusa.com/", "permiso"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
