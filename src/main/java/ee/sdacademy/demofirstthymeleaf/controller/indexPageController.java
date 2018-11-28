package ee.sdacademy.demofirstthymeleaf.controller;

import ee.sdacademy.demofirstthymeleaf.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ryan Alexander on 28/11/2018.
 */

@Controller
public class indexPageController {


    @RequestMapping("/")
    // Model: used as argument to apply every attribute to 'index'
    public String mainPage(Model model) {
        model.addAttribute("greeting","Hi Ryan, how's it going?");

        // used the object I created, 'Person.java'
        model.addAttribute("person", new Person("Ryan", "Alexander", 70));

        List<Person> persons = new ArrayList<>();
        persons.add(new Person ("Ryan", "Alexander", 70));
        persons.add(new Person ("Bob", "Geldof", 78));
        persons.add(new Person ("Anna", "Kournikova", 34));
        persons.add(new Person ("Nessa", "DiAngella", 34));
        model.addAttribute("students", persons);

        return "index";
    }
}
