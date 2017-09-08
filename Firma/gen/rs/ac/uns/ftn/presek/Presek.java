
package rs.ac.uns.ftn.presek;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="zaglavlje">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="broj_racuna" type="{http://www.ftn.uns.ac.rs/presek}TBrojRacuna"/>
 *                   &lt;element name="datum_naloga" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="broj_preseka" form="qualified">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
 *                         &lt;totalDigits value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="prethodno_stanje" type="{http://www.ftn.uns.ac.rs/presek}TIznos"/>
 *                   &lt;element name="broj_promena_u_korist">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
 *                         &lt;totalDigits value="6"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="broj_promena_na_teret" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *                   &lt;element name="ukupno_u_korist" type="{http://www.ftn.uns.ac.rs/presek}TIznos"/>
 *                   &lt;element name="ukupno_na_teret" type="{http://www.ftn.uns.ac.rs/presek}TIznos"/>
 *                   &lt;element name="novo_stanje" type="{http://www.ftn.uns.ac.rs/presek}TIznos"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="stavka" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="duznik">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="3"/>
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="svrha_placanja">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="3"/>
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="poverilac">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="3"/>
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="datum_naloga" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="datum_valute" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="racun_duznika" type="{http://www.ftn.uns.ac.rs/presek}TRacun"/>
 *                   &lt;element name="racun_poverioca" type="{http://www.ftn.uns.ac.rs/presek}TRacun"/>
 *                   &lt;element name="iznos" type="{http://www.ftn.uns.ac.rs/presek}TIznos"/>
 *                   &lt;element name="smer">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;length value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
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
    "zaglavlje",
    "stavka"
})
@XmlRootElement(name = "presek")
public class Presek {

    @XmlElement(required = true)
    protected Presek.Zaglavlje zaglavlje;
    protected List<Presek.Stavka> stavka;

    /**
     * Gets the value of the zaglavlje property.
     * 
     * @return
     *     possible object is
     *     {@link Presek.Zaglavlje }
     *     
     */
    public Presek.Zaglavlje getZaglavlje() {
        return zaglavlje;
    }

    /**
     * Sets the value of the zaglavlje property.
     * 
     * @param value
     *     allowed object is
     *     {@link Presek.Zaglavlje }
     *     
     */
    public void setZaglavlje(Presek.Zaglavlje value) {
        this.zaglavlje = value;
    }

    /**
     * Gets the value of the stavka property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stavka property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStavka().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Presek.Stavka }
     * 
     * 
     */
    public List<Presek.Stavka> getStavka() {
        if (stavka == null) {
            stavka = new ArrayList<Presek.Stavka>();
        }
        return this.stavka;
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
     *         &lt;element name="duznik">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="3"/>
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="svrha_placanja">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="3"/>
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="poverilac">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="3"/>
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="datum_naloga" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="datum_valute" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="racun_duznika" type="{http://www.ftn.uns.ac.rs/presek}TRacun"/>
     *         &lt;element name="racun_poverioca" type="{http://www.ftn.uns.ac.rs/presek}TRacun"/>
     *         &lt;element name="iznos" type="{http://www.ftn.uns.ac.rs/presek}TIznos"/>
     *         &lt;element name="smer">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;length value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
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
        "duznik",
        "svrhaPlacanja",
        "poverilac",
        "datumNaloga",
        "datumValute",
        "racunDuznika",
        "racunPoverioca",
        "iznos",
        "smer"
    })
    public static class Stavka {

        @XmlElement(required = true)
        protected String duznik;
        @XmlElement(name = "svrha_placanja", required = true)
        protected String svrhaPlacanja;
        @XmlElement(required = true)
        protected String poverilac;
        @XmlElement(name = "datum_naloga", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar datumNaloga;
        @XmlElement(name = "datum_valute", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar datumValute;
        @XmlElement(name = "racun_duznika", required = true)
        protected TRacun racunDuznika;
        @XmlElement(name = "racun_poverioca", required = true)
        protected TRacun racunPoverioca;
        @XmlElement(required = true)
        protected BigDecimal iznos;
        @XmlElement(required = true)
        protected String smer;

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
         * Gets the value of the poverilac property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPoverilac() {
            return poverilac;
        }

        /**
         * Sets the value of the poverilac property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPoverilac(String value) {
            this.poverilac = value;
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
         * Gets the value of the smer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSmer() {
            return smer;
        }

        /**
         * Sets the value of the smer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSmer(String value) {
            this.smer = value;
        }

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
     *         &lt;element name="broj_racuna" type="{http://www.ftn.uns.ac.rs/presek}TBrojRacuna"/>
     *         &lt;element name="datum_naloga" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="broj_preseka" form="qualified">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
     *               &lt;totalDigits value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="prethodno_stanje" type="{http://www.ftn.uns.ac.rs/presek}TIznos"/>
     *         &lt;element name="broj_promena_u_korist">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
     *               &lt;totalDigits value="6"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="broj_promena_na_teret" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
     *         &lt;element name="ukupno_u_korist" type="{http://www.ftn.uns.ac.rs/presek}TIznos"/>
     *         &lt;element name="ukupno_na_teret" type="{http://www.ftn.uns.ac.rs/presek}TIznos"/>
     *         &lt;element name="novo_stanje" type="{http://www.ftn.uns.ac.rs/presek}TIznos"/>
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
        "brojRacuna",
        "datumNaloga",
        "brojPreseka",
        "prethodnoStanje",
        "brojPromenaUKorist",
        "brojPromenaNaTeret",
        "ukupnoUKorist",
        "ukupnoNaTeret",
        "novoStanje"
    })
    public static class Zaglavlje {

        @XmlElement(name = "broj_racuna", required = true)
        protected String brojRacuna;
        @XmlElement(name = "datum_naloga", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar datumNaloga;
        @XmlElement(name = "broj_preseka", required = true)
        protected BigInteger brojPreseka;
        @XmlElement(name = "prethodno_stanje", required = true)
        protected BigDecimal prethodnoStanje;
        @XmlElement(name = "broj_promena_u_korist", required = true)
        protected BigInteger brojPromenaUKorist;
        @XmlElement(name = "broj_promena_na_teret", required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger brojPromenaNaTeret;
        @XmlElement(name = "ukupno_u_korist", required = true)
        protected BigDecimal ukupnoUKorist;
        @XmlElement(name = "ukupno_na_teret", required = true)
        protected BigDecimal ukupnoNaTeret;
        @XmlElement(name = "novo_stanje", required = true)
        protected BigDecimal novoStanje;

        /**
         * Gets the value of the brojRacuna property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBrojRacuna() {
            return brojRacuna;
        }

        /**
         * Sets the value of the brojRacuna property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBrojRacuna(String value) {
            this.brojRacuna = value;
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

        /**
         * Gets the value of the brojPreseka property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getBrojPreseka() {
            return brojPreseka;
        }

        /**
         * Sets the value of the brojPreseka property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setBrojPreseka(BigInteger value) {
            this.brojPreseka = value;
        }

        /**
         * Gets the value of the prethodnoStanje property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPrethodnoStanje() {
            return prethodnoStanje;
        }

        /**
         * Sets the value of the prethodnoStanje property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPrethodnoStanje(BigDecimal value) {
            this.prethodnoStanje = value;
        }

        /**
         * Gets the value of the brojPromenaUKorist property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getBrojPromenaUKorist() {
            return brojPromenaUKorist;
        }

        /**
         * Sets the value of the brojPromenaUKorist property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setBrojPromenaUKorist(BigInteger value) {
            this.brojPromenaUKorist = value;
        }

        /**
         * Gets the value of the brojPromenaNaTeret property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getBrojPromenaNaTeret() {
            return brojPromenaNaTeret;
        }

        /**
         * Sets the value of the brojPromenaNaTeret property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setBrojPromenaNaTeret(BigInteger value) {
            this.brojPromenaNaTeret = value;
        }

        /**
         * Gets the value of the ukupnoUKorist property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getUkupnoUKorist() {
            return ukupnoUKorist;
        }

        /**
         * Sets the value of the ukupnoUKorist property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setUkupnoUKorist(BigDecimal value) {
            this.ukupnoUKorist = value;
        }

        /**
         * Gets the value of the ukupnoNaTeret property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getUkupnoNaTeret() {
            return ukupnoNaTeret;
        }

        /**
         * Sets the value of the ukupnoNaTeret property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setUkupnoNaTeret(BigDecimal value) {
            this.ukupnoNaTeret = value;
        }

        /**
         * Gets the value of the novoStanje property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getNovoStanje() {
            return novoStanje;
        }

        /**
         * Sets the value of the novoStanje property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setNovoStanje(BigDecimal value) {
            this.novoStanje = value;
        }

    }

}
