package middleware.componentes;

import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.Transformer;

import middleware.clases.datatypes.Transaction;
import middleware.clases.datatypes.TransactionStatus;

public class Transformador {
	
	public Transaction transform(TransactionStatus t){
		return t.getTransaction();
	}
}
