//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.10.22 at 06:02:18 PM BRST 
//

package br.com.caelum.stella.nfe.modelo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import net.vidageek.fluid.annotations.FluidName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TVeiculo", propOrder = { "placa", "uf", "rntc" })
@FluidName("Veiculo")
public class TVeiculo {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @FluidName("placa")
    protected String placa;

    @XmlElement(name = "UF", required = true)
    @FluidName("UF")
    protected UF uf;

    @XmlElement(name = "RNTC")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @FluidName("registroNacionalDoTransportadorDeCarga")
    protected String rntc;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(final String value) {
        placa = value;
    }

    public UF getUF() {
        return uf;
    }

    public void setUF(final UF value) {
        uf = value;
    }

    public String getRNTC() {
        return rntc;
    }

    public void setRNTC(final String value) {
        rntc = value;
    }

}
