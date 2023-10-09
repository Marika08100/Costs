package hu.progmatic.costs.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "expense_id")
    private Long expenseId;
    @Column (name = "location")
    private String location;
    @Column (name = "amount")
    private double amount;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "spender_id")
    private Person spender;

    public Expense() {
    }

    public Expense(Long expenseId, String location, double amount, Person spender) {
        this.expenseId = expenseId;
        this.location = location;
        this.amount = amount;
        this.spender = spender;
    }

    public Long getId() {
        return expenseId;
    }

    public void setId(Long expenseId) {
        this.expenseId = expenseId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Person getSpender() {
        return spender;
    }

    public void setSpender(Person spender) {
        this.spender = spender;
    }
}
