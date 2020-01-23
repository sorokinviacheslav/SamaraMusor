package com.company.samaramusor.web.screens.street;

import com.haulmont.cuba.gui.screen.*;
import com.company.samaramusor.entity.Street;

@UiController("samaramusor_Street.edit")
@UiDescriptor("street-edit.xml")
@EditedEntityContainer("streetDc")
@LoadDataBeforeShow
public class StreetEdit extends StandardEditor<Street> {
}