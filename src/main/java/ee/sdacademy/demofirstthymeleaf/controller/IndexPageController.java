package ee.sdacademy.demofirstthymeleaf.controller;

import ee.sdacademy.demofirstthymeleaf.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ryan Alexander on 28/11/2018.
 */

@Controller
public class IndexPageController {

    private List<Person> persons = new ArrayList<>();

    public IndexPageController(){
        persons.add(new Person ("Ryan", "Alexander", 1, 200));
        persons.add(new Person ("Bob", "Geldof", 1, 78));
        persons.add(new Person ("Anna", "Kournikova",0, 34));
        persons.add(new Person ("Nessa", "DiAngella",0, 29));
        persons.add(new Person ("Mickey", "Mouse", 2,13));
    }

    @RequestMapping("/")
    // Model: used as argument to apply every attribute to 'index'
    public String mainPage(Model model) {
        model.addAttribute("greeting","Hi Ryan, how's it going?");

        // used the object I created, 'Person.java'
        model.addAttribute("person", new Person("Ryan", "Alexander",1, 70));
        model.addAttribute("students", persons);

        //??? newStudent
        model.addAttribute("newStudent", new Person());
        return "index";
    }

    // ???? why does this work / why is it used???
    @ModelAttribute
    public Person newStudent(){
        return new Person();
    }


    @PostMapping("/saveStudent")
    // @RequestMapping is an alternative version to above line, @PostMapping
//    @RequestMapping(value ="/saveStudent", method = RequestMethod.POST)

    // Model request mapped to our object
    public String saveStudent(@ModelAttribute Person person){
        persons.add(person);

        // when successful, redirects to homepage
        return "redirect:/";
    }
}
