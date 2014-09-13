package middleware.componentes;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import middleware.clases.datatypes.Transaction;
import middleware.clases.datatypes.TransactionStatus;

import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.Router;


@MessageEndpoint
public class RecipentList {	
	
	/***
	 * Recibe un XML representando la transaccion proveniente de la cola JMS (a partir del channel adapter)
	 * Valida los datos, deserializando el XML en una clase java, y validando los datos internos.
	 * Segun el contenido decide a que canal enviar el mensaje.
	 * @param transaction
	 * @return
	 */
	@Router(inputChannel="recipentListChannel")
	public List<String> resolveTransaction(TransactionStatus t) {
		
		List<String> res = new ArrayList<String>();
		if(t.isValid()){
			//segun el tipo de datos que tiene decidir a que canal enviarlo.
			System.out.println("Recibida: " + t.getTransaction().getId());
		}
		else{
			res.add("invalidMessageChannel"); //mando a invalid.
		}
			
				
		res.add("invalidMessageChannel");	//Mando todo a invalid por ahora!
		
		
		
		return res;
	}
	
	

}
