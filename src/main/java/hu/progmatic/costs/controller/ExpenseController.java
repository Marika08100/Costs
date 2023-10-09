package hu.progmatic.costs.controller;

import hu.progmatic.costs.model.Expense;
import hu.progmatic.costs.model.Person;
import hu.progmatic.costs.service.ExpenseService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ExpenseController {
    private final ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @GetMapping("/expenses")
    public String getAllExpense(Model model){
        List<Expense> expenses = expenseService.getAllExpense();
        model.addAttribute("allExpenses", expenses);
        return "expenses";
    }

    @PostMapping("/add-Expense")
    public String addExpense(@ModelAttribute Expense expense){
        expenseService.addExpense(expense);
        return "redirect:/expenses";
    }
}
