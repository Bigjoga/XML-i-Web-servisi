package rs.ac.uns.ftn.firma;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.6.5
 * 2017-09-09T00:10:01.322+02:00
 * Generated source version: 2.6.5
 * 
 */
@WebService(targetNamespace = "http://www.ftn.uns.ac.rs/firma", name = "Firma")
@XmlSeeAlso({rs.ac.uns.ftn.zahtevzaizvod.ObjectFactory.class, rs.ac.uns.ftn.xmlws.ObjectFactory.class, rs.ac.uns.ftn.faktura.ObjectFactory.class, rs.ac.uns.ftn.presek.ObjectFactory.class, rs.ac.uns.ftn.nalogzaprenos.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface Firma {

    @WebMethod
    @WebResult(name = "presek", targetNamespace = "http://www.ftn.uns.ac.rs/presek", partName = "response")
    public rs.ac.uns.ftn.presek.Presek posaljiZahtevZaIzvod(
        @WebParam(partName = "zahtevZaIzvod", name = "zahtev_za_izvod", targetNamespace = "http://www.ftn.uns.ac.rs/ZahtevZaIzvod")
        rs.ac.uns.ftn.zahtevzaizvod.ZahtevZaIzvod zahtevZaIzvod
    );

    @WebMethod
    @WebResult(name = "status", targetNamespace = "http://www.ftn.uns.ac.rs/xmlws", partName = "response")
    public rs.ac.uns.ftn.xmlws.Status posaljiNalogZaPrenos(
        @WebParam(partName = "nalogZaPrenos", name = "nalog_za_prenos", targetNamespace = "http://www.ftn.uns.ac.rs/nalogZaPrenos")
        rs.ac.uns.ftn.nalogzaprenos.NalogZaPrenos nalogZaPrenos
    );
}
