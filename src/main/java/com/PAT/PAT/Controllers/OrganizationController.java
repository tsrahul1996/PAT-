package com.PAT.PAT.Controllers;

import com.PAT.PAT.Model.Organization;
import com.PAT.PAT.Service.OrganizationService;
import com.PAT.PAT.Service.UserService;
import com.PAT.PAT.dao.EmployeeRepository;
import com.PAT.PAT.dao.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by expert on 1/2/19.
 */
@Controller
public class OrganizationController {


    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    OrganizationService organizationService;


    @GetMapping(value = "/organization")
    public String OrganiztionPage(ModelMap model) {


        return "organization";
    }


    @RequestMapping(value = "/registerOrganization",method = RequestMethod.POST)
    public String addNewOrganization(@RequestParam String name,@RequestParam String email) {
        Organization organization=new Organization();
        organization.setName(name);
        organization.setEmail(email);

        organizationService.saveOrganization(organization);
        return "main";
    }

    @RequestMapping(value = "/searchOrganization",method = RequestMethod.POST)
    public String searchOrganization(@RequestParam String name){
        Organization organizationExists = organizationService.findOrganizationByName(name);
        if(organizationExists == null) {
            return "organization";
        }else{
            return "main";
        }
    }

}
