package com.company.samaramusor.web.screens.organization;

import com.haulmont.cuba.gui.screen.*;
import com.company.samaramusor.entity.Organization;

@UiController("samaramusor_Organization.edit")
@UiDescriptor("organization-edit.xml")
@EditedEntityContainer("organizationDc")
@LoadDataBeforeShow
public class OrganizationEdit extends StandardEditor<Organization> {
}