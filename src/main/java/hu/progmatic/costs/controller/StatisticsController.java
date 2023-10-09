package hu.progmatic.costs.controller;

import hu.progmatic.costs.model.Expense;
import hu.progmatic.costs.model.Person;
import hu.progmatic.costs.service.StatisticsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class StatisticsController {
    private final StatisticsService staticsService;

    public StatisticsController(StatisticsService staticsService) {
        this.staticsService = staticsService;
    }


//    @GetMapping("/all-people-w-expenses")
//    public String allPeopleWithExpenses(Model model) {
//        Map<Person, List<Expense>> peopleWithExpenses = staticsService.getAllPeopleWithExpenses();
//        model.addAttribute("people", peopleWithExpenses.keySet());
//        model.addAttribute("expenses", peopleWithExpenses);
//        return "allpeoplewithexpenses";
//    }

    @GetMapping("/biggest-spender")
    public String biggestSpender(Model model) {
        Person biggestSpender = staticsService.findTheBiggestSpender();
        model.addAttribute("biggestSpender", biggestSpender);
        return "biggest-spender";
    }
}
