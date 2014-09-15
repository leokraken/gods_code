package middleware.componentes;

import java.io.IOException;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;

import middleware.clases.datatypes.Transactions;

import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;
import org.springframework.oxm.XmlMappingException;

import javax.xml.transform.TransformerFactory;

import org.springframework.oxm.XmlMappingException;
import org.springframework.xml.transform.StringSource;

public class MarshallerWS implements Marshaller, Unmarshaller {
	
	
@SuppressWarnings("restriction")
public void marshal(Object obj, Result res) throws IOException,
		XmlMappingException {
	// TODO Auto-generated method stub
	System.out.println("MARSHALLER");
		Transactions t = (Transactions)obj;
		@SuppressWarnings("restriction")
		JAXBContext context;
		StringWriter sw = new StringWriter();
		try {
			context = JAXBContext.newInstance(Transactions.class);
			javax.xml.bind.Marshaller mar= context.createMarshaller();
			
			//mar.setProperty(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT,true);
			mar.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, true);
			//mar.marshal(t, res);
			mar.marshal(t, sw);
			String body = sw.toString();
			String xmlString = "<ns2:ReceiveTransactions xmlns:ns2=\"ACME\"> "+body
					 + "</ns2:ReceiveTransactions>";
			System.out.println(xmlString);
			//"</arg0>"+ "<arg0>"
			Transformer transform = TransformerFactory.newInstance().newTransformer();
            transform.transform(new StringSource(xmlString), res);
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		}

public boolean supports(Class<?> arg0) {
	// TODO Auto-generated method stub
	return false;
}

public Object unmarshal(Source arg0) throws IOException,
			XmlMappingException {
		// TODO Auto-generated method stub
		System.out.println("RESPUESTA!");
		return new String("HOLA");
	}

}
