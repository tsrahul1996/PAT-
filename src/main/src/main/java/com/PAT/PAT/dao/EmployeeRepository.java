package com.PAT.PAT.dao;

import com.PAT.PAT.Model.Employee;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by expert on 16/1/19.
 */
public interface EmployeeRepository extends CrudRepository<Employee, Long>{
}
