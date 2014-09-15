package middleware.clases.datatypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;

//@XmlRootElement(name = "Transactions")
//@XmlAccessorType (XmlAccessType.FIELD)
public class Transactions {

	//@XmlElement(name = "Transaction")
	private List<Transaction> transactionList;

	
	public List<Transaction> getTransactionList() {
		return transactionList;
	}

	public void setTransactionList(List<Transaction> transactionList) {
		this.transactionList = transactionList;
	}

	
	public Transactions(List<TransactionStatus> transactionList) {
		super();
		this.transactionList = new ArrayList<Transaction>(); //<Transaction>();
		for(TransactionStatus t : transactionList){
			this.transactionList.add(t.getTransaction());
		}
	}
	
	@Override
	public String toString() {		
		String ret = "";
		for(Transaction t : transactionList){
			ret= ret + t.getCodigoComercio() + " ";
		}
		return ret;
	}
		
}
