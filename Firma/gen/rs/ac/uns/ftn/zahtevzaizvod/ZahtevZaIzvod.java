
package rs.ac.uns.ftn.zahtevzaizvod;

import java.math.BigInteger;
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
 *         &lt;element name="broj_racuna" type="{http://www.ftn.uns.ac.rs/ZahtevZaIzvod}TBrojRacuna"/>
 *         &lt;element name="datum" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="redni_broj_preseka">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
 *               &lt;totalDigits value="2"/>
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
    "brojRacuna",
    "datum",
    "redniBrojPreseka"
})
@XmlRootElement(name = "zahtev_za_izvod")
public class ZahtevZaIzvod {

    @XmlElement(name = "broj_racuna", required = true)
    protected String brojRacuna;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datum;
    @XmlElement(name = "redni_broj_preseka", required = true)
    protected BigInteger redniBrojPreseka;

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
     * Gets the value of the datum property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatum() {
        return datum;
    }

    /**
     * Sets the value of the datum property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatum(XMLGregorianCalendar value) {
        this.datum = value;
    }

    /**
     * Gets the value of the redniBrojPreseka property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRedniBrojPreseka() {
        return redniBrojPreseka;
    }

    /**
     * Sets the value of the redniBrojPreseka property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRedniBrojPreseka(BigInteger value) {
        this.redniBrojPreseka = value;
    }

}
