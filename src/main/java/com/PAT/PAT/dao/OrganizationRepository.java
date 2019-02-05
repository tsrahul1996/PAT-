package com.PAT.PAT.dao;

import com.PAT.PAT.Model.Employee;
import com.PAT.PAT.Model.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by expert on 16/1/19.
 */
public interface OrganizationRepository extends JpaRepository<Organization, Long> {
    Organization findByName(String name);
}
