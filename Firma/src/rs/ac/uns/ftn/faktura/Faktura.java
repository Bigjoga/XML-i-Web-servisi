
package rs.ac.uns.ftn.faktura;

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
 *         &lt;element name="zaglavlje_fakture">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id_poruke" type="{http://www.ftn.uns.ac.rs/faktura}TIDPoruke"/>
 *                   &lt;element name="broj_racuna">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
 *                         &lt;totalDigits value="6"/>
 *                         &lt;pattern value=""/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="datum_racuna" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="vrednost_robe" type="{http://www.ftn.uns.ac.rs/faktura}TIznos"/>
 *                   &lt;element name="vrednost_usluga" type="{http://www.ftn.uns.ac.rs/faktura}TIznos"/>
 *                   &lt;element name="ukupno_roba_i_usluge" type="{http://www.ftn.uns.ac.rs/faktura}TIznos"/>
 *                   &lt;element name="ukupan_rabat" type="{http://www.ftn.uns.ac.rs/faktura}TIznos"/>
 *                   &lt;element name="ukupan_porez" type="{http://www.ftn.uns.ac.rs/faktura}TIznos"/>
 *                   &lt;element name="oznaka_valute">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.ftn.uns.ac.rs/faktura}TOznaka_valute">
 *                         &lt;pattern value="[a-z]{3}|[A-Z]{3}"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="iznos_za_uplatu" type="{http://www.ftn.uns.ac.rs/faktura}TIznos"/>
 *                   &lt;element name="uplata_na_racun">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.ftn.uns.ac.rs/faktura}TBrojRacuna">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="datum_valute" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="kupac" type="{http://www.ftn.uns.ac.rs/faktura}TPreduzece"/>
 *                   &lt;element name="dobavljac" type="{http://www.ftn.uns.ac.rs/faktura}TPreduzece"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="stavka_fakture" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="redni_broj">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
 *                         &lt;totalDigits value="3"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="naziv_robe_ili_usluge">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="120"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="kolicina">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;totalDigits value="10"/>
 *                         &lt;fractionDigits value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="jedinica_mere">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="6"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="jedinicna_cena">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;totalDigits value="10"/>
 *                         &lt;fractionDigits value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="vrednost">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;totalDigits value="12"/>
 *                         &lt;fractionDigits value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="procenat_rabata">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;totalDigits value="5"/>
 *                         &lt;fractionDigits value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="iznos_rabata">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;totalDigits value="12"/>
 *                         &lt;fractionDigits value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="umanjeno_za_rabat">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;totalDigits value="12"/>
 *                         &lt;fractionDigits value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ukupan_porez">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;totalDigits value="12"/>
 *                         &lt;fractionDigits value="2"/>
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
    "zaglavljeFakture",
    "stavkaFakture"
})
@XmlRootElement(name = "faktura")
public class Faktura {

    @XmlElement(name = "zaglavlje_fakture", required = true)
    protected Faktura.ZaglavljeFakture zaglavljeFakture;
    @XmlElement(name = "stavka_fakture", required = true)
    protected List<Faktura.StavkaFakture> stavkaFakture;

    /**
     * Gets the value of the zaglavljeFakture property.
     * 
     * @return
     *     possible object is
     *     {@link Faktura.ZaglavljeFakture }
     *     
     */
    public Faktura.ZaglavljeFakture getZaglavljeFakture() {
        return zaglavljeFakture;
    }

    /**
     * Sets the value of the zaglavljeFakture property.
     * 
     * @param value
     *     allowed object is
     *     {@link Faktura.ZaglavljeFakture }
     *     
     */
    public void setZaglavljeFakture(Faktura.ZaglavljeFakture value) {
        this.zaglavljeFakture = value;
    }

    /**
     * Gets the value of the stavkaFakture property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stavkaFakture property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStavkaFakture().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Faktura.StavkaFakture }
     * 
     * 
     */
    public List<Faktura.StavkaFakture> getStavkaFakture() {
        if (stavkaFakture == null) {
            stavkaFakture = new ArrayList<Faktura.StavkaFakture>();
        }
        return this.stavkaFakture;
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
     *         &lt;element name="redni_broj">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
     *               &lt;totalDigits value="3"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="naziv_robe_ili_usluge">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="120"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="kolicina">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;totalDigits value="10"/>
     *               &lt;fractionDigits value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="jedinica_mere">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="6"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="jedinicna_cena">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;totalDigits value="10"/>
     *               &lt;fractionDigits value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="vrednost">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;totalDigits value="12"/>
     *               &lt;fractionDigits value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="procenat_rabata">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;totalDigits value="5"/>
     *               &lt;fractionDigits value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="iznos_rabata">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;totalDigits value="12"/>
     *               &lt;fractionDigits value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="umanjeno_za_rabat">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;totalDigits value="12"/>
     *               &lt;fractionDigits value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ukupan_porez">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;totalDigits value="12"/>
     *               &lt;fractionDigits value="2"/>
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
        "redniBroj",
        "nazivRobeIliUsluge",
        "kolicina",
        "jedinicaMere",
        "jedinicnaCena",
        "vrednost",
        "procenatRabata",
        "iznosRabata",
        "umanjenoZaRabat",
        "ukupanPorez"
    })
    public static class StavkaFakture {

        @XmlElement(name = "redni_broj", required = true)
        protected BigInteger redniBroj;
        @XmlElement(name = "naziv_robe_ili_usluge", required = true)
        protected String nazivRobeIliUsluge;
        @XmlElement(required = true)
        protected BigDecimal kolicina;
        @XmlElement(name = "jedinica_mere", required = true)
        protected String jedinicaMere;
        @XmlElement(name = "jedinicna_cena", required = true)
        protected BigDecimal jedinicnaCena;
        @XmlElement(required = true)
        protected BigDecimal vrednost;
        @XmlElement(name = "procenat_rabata", required = true)
        protected BigDecimal procenatRabata;
        @XmlElement(name = "iznos_rabata", required = true)
        protected BigDecimal iznosRabata;
        @XmlElement(name = "umanjeno_za_rabat", required = true)
        protected BigDecimal umanjenoZaRabat;
        @XmlElement(name = "ukupan_porez", required = true)
        protected BigDecimal ukupanPorez;

        /**
         * Gets the value of the redniBroj property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRedniBroj() {
            return redniBroj;
        }

        /**
         * Sets the value of the redniBroj property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRedniBroj(BigInteger value) {
            this.redniBroj = value;
        }

        /**
         * Gets the value of the nazivRobeIliUsluge property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNazivRobeIliUsluge() {
            return nazivRobeIliUsluge;
        }

        /**
         * Sets the value of the nazivRobeIliUsluge property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNazivRobeIliUsluge(String value) {
            this.nazivRobeIliUsluge = value;
        }

        /**
         * Gets the value of the kolicina property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getKolicina() {
            return kolicina;
        }

        /**
         * Sets the value of the kolicina property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setKolicina(BigDecimal value) {
            this.kolicina = value;
        }

        /**
         * Gets the value of the jedinicaMere property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJedinicaMere() {
            return jedinicaMere;
        }

        /**
         * Sets the value of the jedinicaMere property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJedinicaMere(String value) {
            this.jedinicaMere = value;
        }

        /**
         * Gets the value of the jedinicnaCena property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getJedinicnaCena() {
            return jedinicnaCena;
        }

        /**
         * Sets the value of the jedinicnaCena property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setJedinicnaCena(BigDecimal value) {
            this.jedinicnaCena = value;
        }

        /**
         * Gets the value of the vrednost property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getVrednost() {
            return vrednost;
        }

        /**
         * Sets the value of the vrednost property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setVrednost(BigDecimal value) {
            this.vrednost = value;
        }

        /**
         * Gets the value of the procenatRabata property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getProcenatRabata() {
            return procenatRabata;
        }

        /**
         * Sets the value of the procenatRabata property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setProcenatRabata(BigDecimal value) {
            this.procenatRabata = value;
        }

        /**
         * Gets the value of the iznosRabata property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getIznosRabata() {
            return iznosRabata;
        }

        /**
         * Sets the value of the iznosRabata property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setIznosRabata(BigDecimal value) {
            this.iznosRabata = value;
        }

        /**
         * Gets the value of the umanjenoZaRabat property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getUmanjenoZaRabat() {
            return umanjenoZaRabat;
        }

        /**
         * Sets the value of the umanjenoZaRabat property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setUmanjenoZaRabat(BigDecimal value) {
            this.umanjenoZaRabat = value;
        }

        /**
         * Gets the value of the ukupanPorez property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getUkupanPorez() {
            return ukupanPorez;
        }

        /**
         * Sets the value of the ukupanPorez property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setUkupanPorez(BigDecimal value) {
            this.ukupanPorez = value;
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
     *         &lt;element name="id_poruke" type="{http://www.ftn.uns.ac.rs/faktura}TIDPoruke"/>
     *         &lt;element name="broj_racuna">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
     *               &lt;totalDigits value="6"/>
     *               &lt;pattern value=""/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="datum_racuna" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="vrednost_robe" type="{http://www.ftn.uns.ac.rs/faktura}TIznos"/>
     *         &lt;element name="vrednost_usluga" type="{http://www.ftn.uns.ac.rs/faktura}TIznos"/>
     *         &lt;element name="ukupno_roba_i_usluge" type="{http://www.ftn.uns.ac.rs/faktura}TIznos"/>
     *         &lt;element name="ukupan_rabat" type="{http://www.ftn.uns.ac.rs/faktura}TIznos"/>
     *         &lt;element name="ukupan_porez" type="{http://www.ftn.uns.ac.rs/faktura}TIznos"/>
     *         &lt;element name="oznaka_valute">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.ftn.uns.ac.rs/faktura}TOznaka_valute">
     *               &lt;pattern value="[a-z]{3}|[A-Z]{3}"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="iznos_za_uplatu" type="{http://www.ftn.uns.ac.rs/faktura}TIznos"/>
     *         &lt;element name="uplata_na_racun">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.ftn.uns.ac.rs/faktura}TBrojRacuna">
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="datum_valute" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="kupac" type="{http://www.ftn.uns.ac.rs/faktura}TPreduzece"/>
     *         &lt;element name="dobavljac" type="{http://www.ftn.uns.ac.rs/faktura}TPreduzece"/>
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
        "brojRacuna",
        "datumRacuna",
        "vrednostRobe",
        "vrednostUsluga",
        "ukupnoRobaIUsluge",
        "ukupanRabat",
        "ukupanPorez",
        "oznakaValute",
        "iznosZaUplatu",
        "uplataNaRacun",
        "datumValute",
        "kupac",
        "dobavljac"
    })
    public static class ZaglavljeFakture {

        @XmlElement(name = "id_poruke", required = true)
        protected String idPoruke;
        @XmlElement(name = "broj_racuna", required = true)
        protected BigInteger brojRacuna;
        @XmlElement(name = "datum_racuna", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar datumRacuna;
        @XmlElement(name = "vrednost_robe", required = true)
        protected BigDecimal vrednostRobe;
        @XmlElement(name = "vrednost_usluga", required = true)
        protected BigDecimal vrednostUsluga;
        @XmlElement(name = "ukupno_roba_i_usluge", required = true)
        protected BigDecimal ukupnoRobaIUsluge;
        @XmlElement(name = "ukupan_rabat", required = true)
        protected BigDecimal ukupanRabat;
        @XmlElement(name = "ukupan_porez", required = true)
        protected BigDecimal ukupanPorez;
        @XmlElement(name = "oznaka_valute", required = true)
        protected String oznakaValute;
        @XmlElement(name = "iznos_za_uplatu", required = true)
        protected BigDecimal iznosZaUplatu;
        @XmlElement(name = "uplata_na_racun", required = true)
        protected String uplataNaRacun;
        @XmlElement(name = "datum_valute", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar datumValute;
        @XmlElement(required = true)
        protected TPreduzece kupac;
        @XmlElement(required = true)
        protected TPreduzece dobavljac;

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
         * Gets the value of the brojRacuna property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getBrojRacuna() {
            return brojRacuna;
        }

        /**
         * Sets the value of the brojRacuna property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setBrojRacuna(BigInteger value) {
            this.brojRacuna = value;
        }

        /**
         * Gets the value of the datumRacuna property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDatumRacuna() {
            return datumRacuna;
        }

        /**
         * Sets the value of the datumRacuna property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDatumRacuna(XMLGregorianCalendar value) {
            this.datumRacuna = value;
        }

        /**
         * Gets the value of the vrednostRobe property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getVrednostRobe() {
            return vrednostRobe;
        }

        /**
         * Sets the value of the vrednostRobe property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setVrednostRobe(BigDecimal value) {
            this.vrednostRobe = value;
        }

        /**
         * Gets the value of the vrednostUsluga property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getVrednostUsluga() {
            return vrednostUsluga;
        }

        /**
         * Sets the value of the vrednostUsluga property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setVrednostUsluga(BigDecimal value) {
            this.vrednostUsluga = value;
        }

        /**
         * Gets the value of the ukupnoRobaIUsluge property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getUkupnoRobaIUsluge() {
            return ukupnoRobaIUsluge;
        }

        /**
         * Sets the value of the ukupnoRobaIUsluge property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setUkupnoRobaIUsluge(BigDecimal value) {
            this.ukupnoRobaIUsluge = value;
        }

        /**
         * Gets the value of the ukupanRabat property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getUkupanRabat() {
            return ukupanRabat;
        }

        /**
         * Sets the value of the ukupanRabat property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setUkupanRabat(BigDecimal value) {
            this.ukupanRabat = value;
        }

        /**
         * Gets the value of the ukupanPorez property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getUkupanPorez() {
            return ukupanPorez;
        }

        /**
         * Sets the value of the ukupanPorez property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setUkupanPorez(BigDecimal value) {
            this.ukupanPorez = value;
        }

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
         * Gets the value of the iznosZaUplatu property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getIznosZaUplatu() {
            return iznosZaUplatu;
        }

        /**
         * Sets the value of the iznosZaUplatu property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setIznosZaUplatu(BigDecimal value) {
            this.iznosZaUplatu = value;
        }

        /**
         * Gets the value of the uplataNaRacun property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUplataNaRacun() {
            return uplataNaRacun;
        }

        /**
         * Sets the value of the uplataNaRacun property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUplataNaRacun(String value) {
            this.uplataNaRacun = value;
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
         * Gets the value of the kupac property.
         * 
         * @return
         *     possible object is
         *     {@link TPreduzece }
         *     
         */
        public TPreduzece getKupac() {
            return kupac;
        }

        /**
         * Sets the value of the kupac property.
         * 
         * @param value
         *     allowed object is
         *     {@link TPreduzece }
         *     
         */
        public void setKupac(TPreduzece value) {
            this.kupac = value;
        }

        /**
         * Gets the value of the dobavljac property.
         * 
         * @return
         *     possible object is
         *     {@link TPreduzece }
         *     
         */
        public TPreduzece getDobavljac() {
            return dobavljac;
        }

        /**
         * Sets the value of the dobavljac property.
         * 
         * @param value
         *     allowed object is
         *     {@link TPreduzece }
         *     
         */
        public void setDobavljac(TPreduzece value) {
            this.dobavljac = value;
        }

    }

}
