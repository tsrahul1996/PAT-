package com.PAT.PAT.Service;

import com.PAT.PAT.Model.Employee;
import com.PAT.PAT.Model.Role;
import com.PAT.PAT.dao.EmployeeRepository;
import com.PAT.PAT.dao.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by expert on 29/1/19.
// */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private RoleRepository roleRepository;

//    @Autowired
//    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public Employee findUserByEmail(String email) {


        return employeeRepository.findByEmail(email);
    }

    @Override
    public Employee findUserByPassword(String email) {
        return employeeRepository.findByPassword(email);
    }

    @Override
    public void saveUser(Employee user) {
        user.setPassword(user.getPassword());
        user.setActive(1);
        Role userRole = roleRepository.findByRole("ADMIN");
       // user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
        employeeRepository.save(user);
    }

}
