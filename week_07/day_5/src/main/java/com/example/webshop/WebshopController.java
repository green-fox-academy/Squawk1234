package com.example.webshop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebshopController {

    ProductList productList = new ProductList();

    @ResponseBody
    @RequestMapping("/")
    public String home() {

        return "Hello";
    }

    @RequestMapping("/webshop")
    public String webshop(Model model) {
        model.addAttribute("products", productList.getProducts());
        return "webshop";
    }

    @RequestMapping("/webshop/onlyavailable")
    public String onlyAvailble(Model model) {
        model.addAttribute("products", productList.availableStock());
        return "webshop";
    }

    @RequestMapping("/webshop/contains")
    public String contains (Model model) {
        model.addAttribute()
    }

}
