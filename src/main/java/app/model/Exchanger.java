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

@Entity
public class Exchanger implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany(mappedBy = "exchanger")
    private List<Completedtransaction> completedtransactions;

    @OneToMany(mappedBy = "exchanger")
    private List<Transactionoffer> transactionoffers;

    @OneToMany(mappedBy = "exchanger")
    private List<Clerk> clerks;


    public Exchanger() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public List<Clerk> getClerks() {
        return clerks;
    }

    public void setClerks(List<Clerk> clerks) {
        this.clerks = clerks;
    }


    public void purge() {
        this.setCompletedtransactions(null);
        this.setTransactionoffers(null);
        this.setClerks(null);
    }

    public void prune() {
        for (Completedtransaction compl : this.getCompletedtransactions()) {
            compl.purge();
        }
        for (Transactionoffer offer : this.getTransactionoffers()) {
            offer.purge();
        }
        for (Clerk clerk : this.getClerks()) {
            clerk.purge();
        }

    }


}
