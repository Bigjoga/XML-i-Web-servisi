
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package rs.ac.uns.ftn.firma;

import java.io.File;
import java.net.URL;
import java.util.logging.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import rs.ac.uns.ftn.banka.Banka;
import rs.ac.uns.ftn.presek.Presek;
import rs.ac.uns.ftn.xmlws.Status;

/**
 * This class was generated by Apache CXF 2.6.5 2017-06-20T01:53:21.102+02:00
 * Generated source version: 2.6.5
 * 
 */

@javax.jws.WebService(serviceName = "FirmaService", portName = "FirmaPort", targetNamespace = "http://www.ftn.uns.ac.rs/firma", wsdlLocation = "file:/C:/Users/skilj/Documents/GitHub/XMLWS/Firma/WEB-INF/wsdl/Firma.wsdl", endpointInterface = "rs.ac.uns.ftn.firma.Firma")

public class FirmaImpl implements Firma {

	private static final Logger LOG = Logger.getLogger(FirmaImpl.class.getName());
	public static int increment=0;
	/*
	 * (non-Javadoc)
	 * 
	 * @see rs.ac.uns.ftn.firma.Firma#posaljiZahtevZaIzvod(rs.ac.uns.ftn.
	 * zahtevzaizvod.ZahtevZaIzvod zahtevZaIzvod )*
	 */
	public rs.ac.uns.ftn.presek.Presek posaljiZahtevZaIzvod(rs.ac.uns.ftn.zahtevzaizvod.ZahtevZaIzvod zahtevZaIzvod) {
		LOG.info("Executing operation posaljiZahtevZaIzvod");
		System.out.println(zahtevZaIzvod.getBrojRacuna());
		/*
		 * DONE 1: Dobijeni objekat Presek, prebaciti u XML i sacuvati ga
		 * */
		
		try {
		URL wsdl = new URL("http://localhost:8080/banka/services/Banka?wsdl");
		QName serviceName = new QName("http://www.ftn.uns.ac.rs/banka", "BankaService");
		QName portName = new QName("http://www.ftn.uns.ac.rs/banka", "BankaPort");

		Service service = Service.create(wsdl, serviceName);

		Banka banka = service.getPort(portName, Banka.class);

		Presek presek = (Presek) banka.primiZahtevZaIzvod(zahtevZaIzvod);
		if(presek==null)
			return null;
		
		System.out.println("\nPristigao je presek od banke. Prebacivanje u xml..");
		JAXBContext context = JAXBContext.newInstance("rs.ac.uns.ftn.presek");
		Marshaller marshaller = context.createMarshaller();
		File file = new File("/home/igor/Documents/gitRepos/XMLWS/Firma/xmlovi/dobijeniXmlPresek "+increment+".xml");
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		marshaller.marshal(presek, file);
		increment++;
		

	} catch (java.lang.Exception ex) {
		ex.printStackTrace();
		throw new RuntimeException(ex);
	}
		LOG.info("Operation posaljiZahtevZaIzvod completed");
		try {
			rs.ac.uns.ftn.presek.Presek _return = null;
			return _return;
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see rs.ac.uns.ftn.firma.Firma#posaljiNalogZaPrenos(rs.ac.uns.ftn.
	 * nalogzaprenos.NalogZaPrenos nalogZaPrenos )*
	 */
	public void posaljiNalogZaPrenos(rs.ac.uns.ftn.nalogzaprenos.NalogZaPrenos nalogZaPrenos) {
		LOG.info("Executing operation posaljiNalogZaPrenos");
		System.out.println(nalogZaPrenos.getDuznik());
		/*
		 * DONE: Treba napraviti konekciju ka mandicevom servisu i poslati mu objekat
		 */
		
		try {
			URL wsdl = new URL("http://localhost:8080/banka/services/Banka?wsdl");
			QName serviceName = new QName("http://www.ftn.uns.ac.rs/banka", "BankaService");
			QName portName = new QName("http://www.ftn.uns.ac.rs/banka", "BankaPort");

			Service service = Service.create(wsdl, serviceName);

			Banka banka = service.getPort(portName, Banka.class);

			Status status = (Status) banka.primiNalogZaPlacanje(nalogZaPrenos);
			if(status!=null)
				System.out.println("\nStatusna poruka od web servisa banke je: " + status.getStatusText());
			else 
				System.out.println("\nStatusna poruka od web servisa banke je prazna. ");

		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
		LOG.info("Operation posaljiNalogZaPrenos completed");
	}

}