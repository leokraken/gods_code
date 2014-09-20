package middleware.componentes;

import org.springframework.messaging.support.ErrorMessage;

import middleware.clases.datatypes.Result;
import middleware.clases.datatypes.TransactionStatus;

/***
 * Clase de ejemplo para recibir y loguear mensajes invalidos.
 * El invalid message channel es publish suscribe, por lo que se podrian recibir los mensajes de muchas formas.
 * @author Cristiano
 *
 */

public class MessageHandler {
	
		
	public void LogInvalid(TransactionStatus t){
		System.out.println("Mensaje invalido recibido por middleware: " + t.getMessage());		
	}
	
	public void LogError(ErrorMessage e){
		if (e.getPayload().getCause() != null){
			System.out.println("Excepcion: " + e.getPayload().getCause());
		}
		else{
			System.out.println("Excepcion: " + e.getPayload().getMessage());
		}
				
	}
		
	public void LogInvalidMessageWS(Result res){
		if(!res.isOk()){
			System.out.println(res.getMessage());
		}
	}

}
