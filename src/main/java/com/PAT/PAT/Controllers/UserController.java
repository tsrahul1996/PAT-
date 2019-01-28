package com.PAT.PAT.Controllers;

import com.PAT.PAT.Model.Employee;
import com.PAT.PAT.dao.EmployeeRepository;
import com.PAT.PAT.java.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;


/**
 * Created by expert on 16/1/19.
 */
@Controller
@SessionAttributes("email")
public class UserController {
    @Autowired
    LoginService service;

    @Autowired
    private EmployeeRepository employeeRepository;


    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String homePage(Model model) {

        return "home";

    }

    @RequestMapping(value = "/login")
    public String loginPage(ModelMap model) {


        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String showWelcomePage(ModelMap model, @RequestParam String email, @RequestParam String password) {

        boolean isValidUser = service.validateUser(email, password);

        if (isValidUser == false) {

            return "login";
        } else {

            return "welcome";
        }
    }

    @RequestMapping(value = "/welcome")
    public String Page(ModelMap model) {


        return "welcome";
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String addNewUser(@RequestParam String name, @RequestParam String email, @RequestParam String password) {

        Employee n = new Employee();

        n.setName(name);
        n.setEmail(email);
        n.setPassword(password);

        employeeRepository.save(n);
        return "welcome";

    }


}
