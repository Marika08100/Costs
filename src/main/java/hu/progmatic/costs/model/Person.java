package hu.progmatic.costs.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "person_id")
    private Long Id;
    @Column(name = "name")
    private String name;
    @Column(name = "birthplace")
    private String birthPlace;
    @Column(name = "birthdate")
    private Date birthDate;
    @Column(name = "email")
    private String email;
    @JsonIgnore
    @OneToMany(mappedBy = "spender", fetch = FetchType.EAGER)
    private List<Expense> expenses;
    public Person() {
    }


    public Person(Long id, String name, String birthPlace, Date birthDate, String email, List<Expense> expenses) {
        Id = id;
        this.name = name;
        this.birthPlace = birthPlace;
        this.birthDate = birthDate;
        this.email = email;
        this.expenses = expenses;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Expense> getExpenses() {
        return expenses;
    }

    public void setExpenses(List<Expense> expenses) {
        this.expenses = expenses;
    }
}
