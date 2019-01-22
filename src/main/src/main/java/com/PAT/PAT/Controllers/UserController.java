package com.PAT.PAT.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by expert on 16/1/19.
 */
@Controller
public class UserController {

    @RequestMapping(value = "/", method = RequestMethod.GET)

    public String homePage(Model model) {

        return "home";

    }
    @RequestMapping(value = "/login", method = RequestMethod.GET)

    public String loginPage(Model model) {

        return "login";

    }


}
