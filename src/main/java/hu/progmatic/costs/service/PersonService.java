package hu.progmatic.costs.service;

import hu.progmatic.costs.model.Person;
import hu.progmatic.costs.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
    public void addPerson(Person person){
        personRepository.save(person);
    }

    public Optional<Person> findById(Long id) {
        return personRepository.findById(id);
    }

    public List<Person> getAllPeople() {
        return personRepository.findAll();
    }
}
