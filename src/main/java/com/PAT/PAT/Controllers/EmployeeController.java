package com.PAT.PAT.Controllers;

/**
 * Created by expert on 24/1/19.
 */
        import com.PAT.PAT.java.EmployeeService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Controller;
        import org.springframework.ui.ModelMap;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestMethod;
        import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class EmployeeController {

    @Autowired
    EmployeeService service;

    @RequestMapping(value="/list-todos", method = RequestMethod.GET)
    public String showEmployee(ModelMap model){
        String emailID = (String) model.get("emailID");
        model.put("emp", service.retrieveTodos(emailID));
        return "list-todos";
    }

}
