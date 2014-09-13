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
import org.springframework.integration.annotation.Transformer;

@MessageEndpoint
public class MessageTransformer {

	@Transformer(inputChannel="jmsChannel",outputChannel="recipentListChannel")
	public TransactionStatus transformAndValidate(String xml){
		
		Transaction t = null;
		String error = null;
		TransactionStatus res = new TransactionStatus();
			
		
		try{
			t = this.getTransaction(xml);
			res.setTransaction(t);
		}
		catch(Throwable err){
			error = "Error en xml, formato invalido: " + err.getMessage();
			res.setTransaction(null);
		}
		
		//Hacer otras validaciones, por ej de tipo de datos etc...
		
		if(error != null){
			res.setMessage(error);
			res.setValid(false);
		}
		else{
			
			res.setMessage("Ok");
			res.setValid(true);
			
		}	
		
		
		return res;
	}
	
	/***
	 * Convierte una transaccion en formato xml a un objeto.
	 * @param xml
	 * @return
	 * @throws JAXBException 
	 */
	private Transaction getTransaction(String xml) throws JAXBException{
		JAXBContext context= JAXBContext.newInstance(Transaction.class);
		Unmarshaller un = context.createUnmarshaller();
		StringReader sr = new StringReader(xml);
		Transaction transaction = (Transaction) un.unmarshal(sr);
		return transaction;
	}
	
}
