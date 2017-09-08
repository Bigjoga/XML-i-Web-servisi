
package rs.ac.uns.ftn.nalogzaprenos;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_poruke" type="{http://www.ftn.uns.ac.rs/nalogZaPrenos}TIDPoruke"/>
 *         &lt;element name="duznik">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="svrha_placanja">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="primalac">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="podaci_o_uplati">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="oznaka_valute" type="{http://www.ftn.uns.ac.rs/nalogZaPrenos}TOznaka_valute"/>
 *                   &lt;element name="iznos" type="{http://www.ftn.uns.ac.rs/nalogZaPrenos}TIznos"/>
 *                   &lt;element name="racun_duznika" type="{http://www.ftn.uns.ac.rs/nalogZaPrenos}TRacun"/>
 *                   &lt;element name="racun_poverioca" type="{http://www.ftn.uns.ac.rs/nalogZaPrenos}TRacun"/>
 *                   &lt;element name="datum_valute" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="hitno" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="datum_naloga" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "idPoruke",
    "duznik",
    "svrhaPlacanja",
    "primalac",
    "podaciOUplati"
})
@XmlRootElement(name = "nalog_za_prenos")
public class NalogZaPrenos {

    @XmlElement(name = "id_poruke", required = true)
    protected String idPoruke;
    @XmlElement(required = true)
    protected String duznik;
    @XmlElement(name = "svrha_placanja", required = true)
    protected String svrhaPlacanja;
    @XmlElement(required = true)
    protected String primalac;
    @XmlElement(name = "podaci_o_uplati", required = true)
    protected NalogZaPrenos.PodaciOUplati podaciOUplati;

    /**
     * Gets the value of the idPoruke property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPoruke() {
        return idPoruke;
    }

    /**
     * Sets the value of the idPoruke property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPoruke(String value) {
        this.idPoruke = value;
    }

    /**
     * Gets the value of the duznik property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuznik() {
        return duznik;
    }

    /**
     * Sets the value of the duznik property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuznik(String value) {
        this.duznik = value;
    }

    /**
     * Gets the value of the svrhaPlacanja property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvrhaPlacanja() {
        return svrhaPlacanja;
    }

    /**
     * Sets the value of the svrhaPlacanja property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvrhaPlacanja(String value) {
        this.svrhaPlacanja = value;
    }

    /**
     * Gets the value of the primalac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimalac() {
        return primalac;
    }

    /**
     * Sets the value of the primalac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimalac(String value) {
        this.primalac = value;
    }

    /**
     * Gets the value of the podaciOUplati property.
     * 
     * @return
     *     possible object is
     *     {@link NalogZaPrenos.PodaciOUplati }
     *     
     */
    public NalogZaPrenos.PodaciOUplati getPodaciOUplati() {
        return podaciOUplati;
    }

    /**
     * Sets the value of the podaciOUplati property.
     * 
     * @param value
     *     allowed object is
     *     {@link NalogZaPrenos.PodaciOUplati }
     *     
     */
    public void setPodaciOUplati(NalogZaPrenos.PodaciOUplati value) {
        this.podaciOUplati = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="oznaka_valute" type="{http://www.ftn.uns.ac.rs/nalogZaPrenos}TOznaka_valute"/>
     *         &lt;element name="iznos" type="{http://www.ftn.uns.ac.rs/nalogZaPrenos}TIznos"/>
     *         &lt;element name="racun_duznika" type="{http://www.ftn.uns.ac.rs/nalogZaPrenos}TRacun"/>
     *         &lt;element name="racun_poverioca" type="{http://www.ftn.uns.ac.rs/nalogZaPrenos}TRacun"/>
     *         &lt;element name="datum_valute" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="hitno" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="datum_naloga" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "oznakaValute",
        "iznos",
        "racunDuznika",
        "racunPoverioca",
        "datumValute",
        "hitno",
        "datumNaloga"
    })
    public static class PodaciOUplati {

        @XmlElement(name = "oznaka_valute", required = true)
        protected String oznakaValute;
        @XmlElement(required = true)
        protected BigDecimal iznos;
        @XmlElement(name = "racun_duznika", required = true)
        protected TRacun racunDuznika;
        @XmlElement(name = "racun_poverioca", required = true)
        protected TRacun racunPoverioca;
        @XmlElement(name = "datum_valute", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar datumValute;
        @XmlElement(defaultValue = "true")
        protected boolean hitno;
        @XmlElement(name = "datum_naloga", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar datumNaloga;

        /**
         * Gets the value of the oznakaValute property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOznakaValute() {
            return oznakaValute;
        }

        /**
         * Sets the value of the oznakaValute property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOznakaValute(String value) {
            this.oznakaValute = value;
        }

        /**
         * Gets the value of the iznos property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getIznos() {
            return iznos;
        }

        /**
         * Sets the value of the iznos property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setIznos(BigDecimal value) {
            this.iznos = value;
        }

        /**
         * Gets the value of the racunDuznika property.
         * 
         * @return
         *     possible object is
         *     {@link TRacun }
         *     
         */
        public TRacun getRacunDuznika() {
            return racunDuznika;
        }

        /**
         * Sets the value of the racunDuznika property.
         * 
         * @param value
         *     allowed object is
         *     {@link TRacun }
         *     
         */
        public void setRacunDuznika(TRacun value) {
            this.racunDuznika = value;
        }

        /**
         * Gets the value of the racunPoverioca property.
         * 
         * @return
         *     possible object is
         *     {@link TRacun }
         *     
         */
        public TRacun getRacunPoverioca() {
            return racunPoverioca;
        }

        /**
         * Sets the value of the racunPoverioca property.
         * 
         * @param value
         *     allowed object is
         *     {@link TRacun }
         *     
         */
        public void setRacunPoverioca(TRacun value) {
            this.racunPoverioca = value;
        }

        /**
         * Gets the value of the datumValute property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDatumValute() {
            return datumValute;
        }

        /**
         * Sets the value of the datumValute property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDatumValute(XMLGregorianCalendar value) {
            this.datumValute = value;
        }

        /**
         * Gets the value of the hitno property.
         * 
         */
        public boolean isHitno() {
            return hitno;
        }

        /**
         * Sets the value of the hitno property.
         * 
         */
        public void setHitno(boolean value) {
            this.hitno = value;
        }

        /**
         * Gets the value of the datumNaloga property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDatumNaloga() {
            return datumNaloga;
        }

        /**
         * Sets the value of the datumNaloga property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDatumNaloga(XMLGregorianCalendar value) {
            this.datumNaloga = value;
        }

    }

}
