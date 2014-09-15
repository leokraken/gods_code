package middleware.componentes;

import java.util.List;

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
		return new Transactions(listTransactions);
	}
	
	//@ReleaseStrategy
	public boolean releaseChecker(List<TransactionStatus> listTransactions){
		System.out.println("LPM!"+listTransactions.size());
		return listTransactions.size()==10;		
	}
	
    public int correlate(TransactionStatus t) {
    	return 1; //drink.getOrderNumber();
    }
}
