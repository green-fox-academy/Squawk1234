package com.example.demo;

import javassist.compiler.ast.StringL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class TodoController {


    private ToDoRepository repository;

    @Autowired
    public TodoController(ToDoRepository repository) {
        this.repository = repository;
    }

    @GetMapping(value = {"", "/", "/list"})
    public String list(Model model, @RequestParam(name = "isActive", required = false) Boolean isActive,
                       @RequestParam(name = "searchText", required = false) String search) {
        if (search != null) {
            model.addAttribute("todos", repository.findAllByTitle(search));
        }  else if (isActive == null) {
            model.addAttribute("todos", repository.findAll());
        } else if (isActive) {
            model.addAttribute("todos", repository.findByDone(!isActive));
        }
        return "todo";
    }

 /*   @GetMapping("/create")
    public String create(@RequestParam String title) {
        repository.save(new ToDo(title));
        return "index";
    } */

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("todos", repository.findAll());
        return "todo";
    }

    @GetMapping("/add")
    public String getInput(Model model, @ModelAttribute(name = "todos") ToDo todo) {
        model.addAttribute("todo", todo);
        return "todoadd";
    }

    @PostMapping("/add")
    public String addInpunt(@ModelAttribute(name = "todo") ToDo todo) {
        repository.save(todo);
        return "redirect:/todo";
    }

    @PostMapping("/{id}/delete")
    public String removeItem(@PathVariable Long id) {
        repository.deleteById(id);
        return "redirect:/todo";
    }

    @GetMapping("/{id}/edittodo")
    public String editInput(@PathVariable Long id, Model model) {
        model.addAttribute("todo", repository.findById(id));
        return "edittodo";
    }

    @PostMapping("/{id}/editSave")
    public String editInput(@ModelAttribute(name = "todo") ToDo todo) {
        repository.save(todo);
        return "redirect:/todo";
    }

    @GetMapping("/addAssignee")
    public String getAssignee(Model model, @ModelAttribute(name = "todos") ToDo todo) {
        model.addAttribute("todo", todo);
        return "addAssignee";
    }

/*    @GetMapping("/{title}/search")
    public String searchInput(@RequestParam String title, Model model) {
        if (title != null) {
            model.addAttribute("todo", repository.findAllByTitle(title));
        }
        return "redirect:";
    } */


}