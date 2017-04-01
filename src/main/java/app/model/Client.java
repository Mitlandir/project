package app.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
public class Client implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne(mappedBy = "client")
    private Transactionrequest transactionrequest;

    @OneToMany(mappedBy = "client")
    private List<Completedtransaction> completedtransactions;

    @OneToMany(mappedBy = "client")
    private List<Transactionoffer> transactionoffers;


    public Client() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Transactionrequest getTransactionrequest() {
        return transactionrequest;
    }

    public void setTransactionrequest(Transactionrequest transactionrequest) {
        this.transactionrequest = transactionrequest;
    }

    public List<Completedtransaction> getCompletedtransactions() {
        return completedtransactions;
    }

    public void setCompletedtransactions(List<Completedtransaction> completedtransactions) {
        this.completedtransactions = completedtransactions;
    }

    public List<Transactionoffer> getTransactionoffers() {
        return transactionoffers;
    }

    public void setTransactionoffers(List<Transactionoffer> transactionoffers) {
        this.transactionoffers = transactionoffers;
    }


    public void purge() {
        this.setCompletedtransactions(null);
        this.setTransactionoffers(null);
        this.setTransactionrequest(null);
    }

    public void prune() {
        for (Completedtransaction compl : this.getCompletedtransactions()) {
            compl.purge();
        }
        for (Transactionoffer offer : this.getTransactionoffers()) {
            offer.purge();
        }
        this.getTransactionrequest().prune();
    }

}
