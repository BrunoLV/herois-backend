/**
 * Heroi.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.valhala.heroi.domain.v1;

public class Heroi implements java.io.Serializable {
    private long id;

    private java.lang.String nome;

    private java.lang.String editora;

    private java.lang.String anoPrimeriaAparicao;

    public Heroi() {
    }

    public Heroi(
            long id,
            java.lang.String nome,
            java.lang.String editora,
            java.lang.String anoPrimeriaAparicao) {
        this.id = id;
        this.nome = nome;
        this.editora = editora;
        this.anoPrimeriaAparicao = anoPrimeriaAparicao;
    }


    /**
     * Gets the id value for this Heroi.
     *
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this Heroi.
     *
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the nome value for this Heroi.
     *
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this Heroi.
     *
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the editora value for this Heroi.
     *
     * @return editora
     */
    public java.lang.String getEditora() {
        return editora;
    }


    /**
     * Sets the editora value for this Heroi.
     *
     * @param editora
     */
    public void setEditora(java.lang.String editora) {
        this.editora = editora;
    }


    /**
     * Gets the anoPrimeriaAparicao value for this Heroi.
     *
     * @return anoPrimeriaAparicao
     */
    public java.lang.String getAnoPrimeriaAparicao() {
        return anoPrimeriaAparicao;
    }


    /**
     * Sets the anoPrimeriaAparicao value for this Heroi.
     *
     * @param anoPrimeriaAparicao
     */
    public void setAnoPrimeriaAparicao(java.lang.String anoPrimeriaAparicao) {
        this.anoPrimeriaAparicao = anoPrimeriaAparicao;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Heroi)) return false;
        Heroi other = (Heroi) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.id == other.getId() &&
                ((this.nome == null && other.getNome() == null) ||
                        (this.nome != null &&
                                this.nome.equals(other.getNome()))) &&
                ((this.editora == null && other.getEditora() == null) ||
                        (this.editora != null &&
                                this.editora.equals(other.getEditora()))) &&
                ((this.anoPrimeriaAparicao == null && other.getAnoPrimeriaAparicao() == null) ||
                        (this.anoPrimeriaAparicao != null &&
                                this.anoPrimeriaAparicao.equals(other.getAnoPrimeriaAparicao())));
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
        _hashCode += new Long(getId()).hashCode();
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getEditora() != null) {
            _hashCode += getEditora().hashCode();
        }
        if (getAnoPrimeriaAparicao() != null) {
            _hashCode += getAnoPrimeriaAparicao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(Heroi.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valhala.com/heroi/domain/v1", "heroi"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valhala.com/heroi/domain/v1", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valhala.com/heroi/domain/v1", "nome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("editora");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valhala.com/heroi/domain/v1", "editora"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anoPrimeriaAparicao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valhala.com/heroi/domain/v1", "anoPrimeriaAparicao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
                new org.apache.axis.encoding.ser.BeanSerializer(
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
                new org.apache.axis.encoding.ser.BeanDeserializer(
                        _javaType, _xmlType, typeDesc);
    }

}