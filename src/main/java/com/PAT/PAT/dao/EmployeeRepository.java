package com.PAT.PAT.dao;

import com.PAT.PAT.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by expert on 16/1/19.
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
Employee findByEmail(String email);
Employee findByPassword(String password);
}
