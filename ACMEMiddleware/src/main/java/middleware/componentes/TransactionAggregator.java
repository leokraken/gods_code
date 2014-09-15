package middleware.componentes;

import java.util.ArrayList;
import java.util.List;

import middleware.clases.datatypes.Transaction;
import middleware.clases.datatypes.TransactionStatus;
import middleware.clases.datatypes.Transactions;

import org.springframework.integration.annotation.Aggregator;
import org.springframework.integration.annotation.ReleaseStrategy;
import org.springframework.stereotype.Component;

//@Component
public class TransactionAggregator {
	
	//@Aggregator(inputChannel="router-aggregator", outputChannel="aggregator-channel", applySequence="True")
	public Transactions addTransaction(List<TransactionStatus> listTransactions){
		//System.out.println("hjasdhjshjadhj");
		Transactions tr = new Transactions();
		List<Transaction> list= new ArrayList<Transaction>();
		for(TransactionStatus ts : listTransactions){
			list.add(ts.getTransaction());
		}
		tr.setTransactionList(list);
		return tr;
	}
	
	//@ReleaseStrategy
	public boolean releaseChecker(List<TransactionStatus> listTransactions){
		System.out.println("LPM!"+listTransactions.size());
		return listTransactions.size()==3;		
	}
	
    public int correlate(TransactionStatus t) {
    	return 1; //drink.getOrderNumber();
    }
}
