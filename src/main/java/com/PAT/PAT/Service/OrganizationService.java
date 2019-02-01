package com.PAT.PAT.Service;

import com.PAT.PAT.Model.Organization;

/**
 * Created by expert on 1/2/19.
 */
public interface OrganizationService  {
    public void saveOrganization(Organization organization);
    public Organization findOrganizationByName(String name);
}
