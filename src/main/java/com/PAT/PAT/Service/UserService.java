package com.PAT.PAT.Service;

import com.PAT.PAT.Model.Employee;

/**
 * Created by expert on 29/1/19.
 */
public interface UserService {

    public Employee findUserByEmail(String email);



    public void saveUser(Employee employee);

    Employee findUserByPassword(String password);
}
