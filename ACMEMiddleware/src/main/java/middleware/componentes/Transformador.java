package middleware.componentes;

import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.Transformer;

import middleware.clases.datatypes.Transaction;
import middleware.clases.datatypes.TransactionBD;
import middleware.clases.datatypes.TransactionStatus;

public class Transformador {
	
	public TransactionBD transform(TransactionStatus t){
		return new TransactionBD(t.getTransaction());
	}
}
