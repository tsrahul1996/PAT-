package com.PAT.PAT;

import com.PAT.PAT.dao.EmployeeRepository;
import com.PAT.PAT.dao.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatApplication {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	OrganizationRepository organizationRepository;




	public static void main(String[] args) {
		SpringApplication.run(PatApplication.class, args);
	}

}

