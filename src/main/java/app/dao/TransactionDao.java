
package app.dao;

import app.model.Completedtransaction;
import app.model.Transactionoffer;
import app.model.Transactionrequest;
import java.util.List;
import org.springframework.stereotype.Repository;

public interface TransactionDao {
    
    public Transactionrequest sendTransactionrequest(Transactionrequest transactionrequest);
    public Transactionoffer sendTransactionoffer(Transactionoffer transactionoffer);
    public Completedtransaction sendCompletedtransaction(Completedtransaction trans);
    public Transactionrequest fetchTransactionrequest(int requestid);
    //public List<Transactionrequest> fetchTransactionrequests(int exchangerid);
    public Transactionoffer fetchTransactionoffer(int offerid);
    //public List<Transactionoffer> fetchTransactionoffers(int clientid);
    public boolean deleteTransactionrequest(Transactionrequest request);
    public boolean deleteTransactionoffer(Transactionoffer offer);
    public Completedtransaction fetchCompletedtransaction(int completedtransactionid);
    //public List<Completedtransaction> fetchCompletedtransactions();
}
