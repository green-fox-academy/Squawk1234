package sqlcom.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CatController {

    private CatRepository repository;

    @Autowired
    public CatController(CatRepository repository){
        this.repository = repository;
    }

    @GetMapping("/create")
    public String create(@RequestParam String name){
        repository.save(new Cat(name));
        return "index";
    }

    @GetMapping("/list")
    @ResponseBody
    public Iterable <Cat> list() {
        return repository.findAll();
    }

}
