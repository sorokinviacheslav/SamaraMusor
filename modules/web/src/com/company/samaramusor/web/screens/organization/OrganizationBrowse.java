package com.company.samaramusor.web.screens.organization;

import com.haulmont.cuba.gui.screen.*;
import com.company.samaramusor.entity.Organization;

@UiController("samaramusor_Organization.browse")
@UiDescriptor("organization-browse.xml")
@LookupComponent("organizationsTable")
@LoadDataBeforeShow
public class OrganizationBrowse extends StandardLookup<Organization> {
}