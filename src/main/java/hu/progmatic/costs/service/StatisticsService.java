package hu.progmatic.costs.service;

import hu.progmatic.costs.model.Expense;
import hu.progmatic.costs.model.Person;
import hu.progmatic.costs.repository.ExpenseRepository;
import hu.progmatic.costs.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StaticsService {
    private final ExpenseRepository expenseRepository;
    private final PersonRepository personRepository;

    public StaticsService(ExpenseRepository expenseRepository, PersonRepository personRepository) {
        this.expenseRepository = expenseRepository;
        this.personRepository = personRepository;
    }

    // TODO Lehessen továbbá statisztikákat lekérni: egy ember adatait (kiadásokkal együtt, az összes emberre működjön
    public Map<Person, List<Expense>> getAllPeopleWithExpenses() {
        Map<Person, List<Expense>> peopleWithExpenses = new HashMap<>();
        List<Person> allPeople = personRepository.findAll();
        for (Person person : allPeople) {
            List<Expense> expenses = expenseRepository.findBySender(person);
            peopleWithExpenses.put(person, expenses);
        }
        return peopleWithExpenses;
    }


}
