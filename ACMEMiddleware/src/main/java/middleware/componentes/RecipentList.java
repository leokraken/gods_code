package middleware.componentes;

import java.util.ArrayList;
import java.util.List;

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
	@Router(inputChannel="jmsChannel")
	public List<String> resolveTransaction(String transaction) {
		//TODO: hacer logica...
		System.out.println(transaction);
		List<String> res = new ArrayList<String>();
		res.add("errorChannel");	//Mando a error channel por ahora, spring tiene uno por defecto que imprime en log.
		return res;
	}

}
