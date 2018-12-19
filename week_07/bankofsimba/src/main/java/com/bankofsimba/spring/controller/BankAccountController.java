package com.bankofsimba.spring.controller;

import com.bankofsimba.spring.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class BankAccountController {

    private List<BankAccount> accounts;

    public BankAccountController() {
        accounts = new ArrayList<>();
        accounts.add(new BankAccount("Simba", 2000.45677, "Lion King", "zebra", true));
        accounts.add(new BankAccount("Sarabi", 1985, "Lion", "zebra", false));
        accounts.add(new BankAccount("Ed", 234, "Hyena", "cancer", false));
        accounts.add(new BankAccount("Zazu", 345, "Bird", "nuts", false));
        accounts.add(new BankAccount("Pumbaa", 123, "Warthog", "bug", false));
    }

    @PostMapping("/bankaccounts")
    public String addToBalance(Model model) {

        return "bankaccounts";
    }

    @GetMapping("/show")
    public String showBankAccount(Model model) {
        model.addAttribute("accounts", accounts);
        return "index";
    }

    @GetMapping("/enjoy")
    public String displayText(Model model) {
        model.addAttribute("myString", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "enjoy";
    }

    @GetMapping("/bankaccounts")
    public String showBankAccountTable(Model model) {
        model.addAttribute("accounts", accounts);
        return "bankaccounts";
    }

    @GetMapping("/containsking")
    public String getContainsString(Model model) {
            model.addAttribute("account", accounts.stream()
                    //            .filter(item -> item.getName().contains("Nike") || item.getDescription().contains("Nike"))
                    .filter(item -> item.toString().contains("King"))
                    .collect(Collectors.toList()));
            return "bankaccounts";
    }


}

