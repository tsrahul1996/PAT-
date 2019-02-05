package com.PAT.PAT.Service;

import com.PAT.PAT.Model.Organization;
import com.PAT.PAT.dao.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by expert on 1/2/19.
 */
@Service
public class OrganizationServiceImpl implements OrganizationService{

    @Autowired
    OrganizationRepository organizationRepository;

    @Override
    public void saveOrganization(Organization organization) {
        organizationRepository.save(organization);
    }

    @Override
    public  Organization findOrganizationByName(String name){
        return organizationRepository.findByName(name);
    }


}
