package com.PAT.PAT.dao;

import com.PAT.PAT.Model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by expert on 29/1/19.
 */
public interface RoleRepository extends JpaRepository<Role,Integer> {
    Role findByRole(String role);
}
