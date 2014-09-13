package middleware.componentes;

import middleware.clases.datatypes.TransactionStatus;

import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;

/***
 * Clase de ejemplo para recibir y loguear mensajes invalidos.
 * El invalid message channel es publish suscribe, por lo que se podrian recibir los mensajes de muchas formas.
 * @author Cristiano
 *
 */

@MessageEndpoint
public class InvalidMessageHandler {
	
	/***
	 * Deberia recibir otro tipo de datos, que contenga el mensaje original en xml y la causa del error.
	 * Por ahora recibe el msg solo...
	 * @param msg
	 */
	@ServiceActivator(inputChannel="invalidMessageChannel")
	public void LogInvalid(TransactionStatus t){
		System.out.println("Mensaje invalido: " + t.getMessage());		
	}

}
