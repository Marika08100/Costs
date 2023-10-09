package hu.progmatic.costs.repository;

import hu.progmatic.costs.model.Expense;
import hu.progmatic.costs.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense,Long> {
    public List<Expense> findBySpender(Person spender);
}
