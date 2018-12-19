package foxcom.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    private List<Fox> foxlist;

    private MainController() {
        foxlist = new ArrayList<>();
        foxlist.add(new Fox("Vukk", "salad", "water"));
        foxlist.add(new Fox("Karak", "Chix", "orange"));
    }

    @GetMapping("/route")
    public String home(Model model, @RequestParam("name") String name) {
        model.addAttribute("name", name);

        return "index";
    }

    @GetMapping("/create")
    public String showLogin() {
        return "create";
    }

    @PostMapping("/create")
    public String redirectToIndex(@RequestParam("name") String name) {
        return "redirect:/route?name=" + name;
    }

    public List<Fox> getFoxlist() {
        return foxlist;
    }
}
