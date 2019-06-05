/**
 * Exame.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soc.exames.webservice;

public class Exame  implements java.io.Serializable {
    private boolean active;

    private java.util.Calendar createdAt;

    private java.lang.Long id;

    private java.lang.String medico;

    private java.lang.String nomePessoa;

    private java.lang.String tipoExame;

    private java.util.Calendar updatedAt;

    public Exame() {
    }

    public Exame(
           boolean active,
           java.util.Calendar createdAt,
           java.lang.Long id,
           java.lang.String medico,
           java.lang.String nomePessoa,
           java.lang.String tipoExame,
           java.util.Calendar updatedAt) {
           this.active = active;
           this.createdAt = createdAt;
           this.id = id;
           this.medico = medico;
           this.nomePessoa = nomePessoa;
           this.tipoExame = tipoExame;
           this.updatedAt = updatedAt;
    }


    /**
     * Gets the active value for this Exame.
     * 
     * @return active
     */
    public boolean isActive() {
        return active;
    }


    /**
     * Sets the active value for this Exame.
     * 
     * @param active
     */
    public void setActive(boolean active) {
        this.active = active;
    }


    /**
     * Gets the createdAt value for this Exame.
     * 
     * @return createdAt
     */
    public java.util.Calendar getCreatedAt() {
        return createdAt;
    }


    /**
     * Sets the createdAt value for this Exame.
     * 
     * @param createdAt
     */
    public void setCreatedAt(java.util.Calendar createdAt) {
        this.createdAt = createdAt;
    }


    /**
     * Gets the id value for this Exame.
     * 
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this Exame.
     * 
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the medico value for this Exame.
     * 
     * @return medico
     */
    public java.lang.String getMedico() {
        return medico;
    }


    /**
     * Sets the medico value for this Exame.
     * 
     * @param medico
     */
    public void setMedico(java.lang.String medico) {
        this.medico = medico;
    }


    /**
     * Gets the nomePessoa value for this Exame.
     * 
     * @return nomePessoa
     */
    public java.lang.String getNomePessoa() {
        return nomePessoa;
    }


    /**
     * Sets the nomePessoa value for this Exame.
     * 
     * @param nomePessoa
     */
    public void setNomePessoa(java.lang.String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }


    /**
     * Gets the tipoExame value for this Exame.
     * 
     * @return tipoExame
     */
    public java.lang.String getTipoExame() {
        return tipoExame;
    }


    /**
     * Sets the tipoExame value for this Exame.
     * 
     * @param tipoExame
     */
    public void setTipoExame(java.lang.String tipoExame) {
        this.tipoExame = tipoExame;
    }


    /**
     * Gets the updatedAt value for this Exame.
     * 
     * @return updatedAt
     */
    public java.util.Calendar getUpdatedAt() {
        return updatedAt;
    }


    /**
     * Sets the updatedAt value for this Exame.
     * 
     * @param updatedAt
     */
    public void setUpdatedAt(java.util.Calendar updatedAt) {
        this.updatedAt = updatedAt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Exame)) return false;
        Exame other = (Exame) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.active == other.isActive() &&
            ((this.createdAt==null && other.getCreatedAt()==null) || 
             (this.createdAt!=null &&
              this.createdAt.equals(other.getCreatedAt()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.medico==null && other.getMedico()==null) || 
             (this.medico!=null &&
              this.medico.equals(other.getMedico()))) &&
            ((this.nomePessoa==null && other.getNomePessoa()==null) || 
             (this.nomePessoa!=null &&
              this.nomePessoa.equals(other.getNomePessoa()))) &&
            ((this.tipoExame==null && other.getTipoExame()==null) || 
             (this.tipoExame!=null &&
              this.tipoExame.equals(other.getTipoExame()))) &&
            ((this.updatedAt==null && other.getUpdatedAt()==null) || 
             (this.updatedAt!=null &&
              this.updatedAt.equals(other.getUpdatedAt())));
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
        _hashCode += (isActive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCreatedAt() != null) {
            _hashCode += getCreatedAt().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getMedico() != null) {
            _hashCode += getMedico().hashCode();
        }
        if (getNomePessoa() != null) {
            _hashCode += getNomePessoa().hashCode();
        }
        if (getTipoExame() != null) {
            _hashCode += getTipoExame().hashCode();
        }
        if (getUpdatedAt() != null) {
            _hashCode += getUpdatedAt().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Exame.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.exames.soc.com/", "exame"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("", "active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdAt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createdAt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medico");
        elemField.setXmlName(new javax.xml.namespace.QName("", "medico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomePessoa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomePessoa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoExame");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoExame"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updatedAt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "updatedAt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
