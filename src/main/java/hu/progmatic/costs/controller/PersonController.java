package hu.progmatic.costs.controller;

import hu.progmatic.costs.model.Person;
import hu.progmatic.costs.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/persons")
    public String getAllPeople(Model model){
        List<Person> allPeople = personService.getAllPeople();
        model.addAttribute("allPeople", allPeople);
        return "persons";
    }

    @PostMapping("/add-Person")
    public String addPerson(@ModelAttribute Person person) {
        personService.addPerson(person);
        return "redirect:/";
    }

    @PostMapping("/update-Person/{id}")
    public String updatePerson(@RequestBody Long id, @ModelAttribute Person updatedPerson) {
        Optional<Person> existingPersons = personService.findById(id);

        if (existingPersons.isPresent()) {
            Person existingPerson = existingPersons.get();

            existingPerson.setName(updatedPerson.getName());
            existingPerson.setBirthPlace(updatedPerson.getBirthPlace());
            existingPerson.setEmail(updatedPerson.getEmail());

            personService.addPerson(existingPerson);
        }
        return "redirect:/";


    }
}
