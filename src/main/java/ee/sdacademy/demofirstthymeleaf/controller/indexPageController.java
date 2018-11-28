package ee.sdacademy.demofirstthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Ryan Alexander on 28/11/2018.
 */

@Controller
public class indexPageController {


    @RequestMapping("/")
    public String mainPage() {
        return "index";
    }
}
