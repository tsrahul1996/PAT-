package com.PAT.PAT.java;

import com.PAT.PAT.Model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by expert on 24/1/19.
 */
@Service
public class EmployeeService {
    private static List<Employee> emp= new ArrayList<Employee>();
    private static int todoCount = 3;



    public List<Employee> retrieveTodos(String user) {
        List<Employee> filteredemp = new ArrayList<Employee>();
        for (Employee todo : emp) {
            if (todo.getEmail().equals(user)) {
                filteredemp.add(todo);
            }
        }
        return filteredemp;
    }
}
