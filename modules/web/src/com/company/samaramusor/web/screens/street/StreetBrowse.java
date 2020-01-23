package com.company.samaramusor.web.screens.street;

import com.haulmont.cuba.gui.screen.*;
import com.company.samaramusor.entity.Street;

@UiController("samaramusor_Street.browse")
@UiDescriptor("street-browse.xml")
@LookupComponent("streetsTable")
@LoadDataBeforeShow
public class StreetBrowse extends StandardLookup<Street> {
}