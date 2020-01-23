package com.company.samaramusor.web.screens.contract;

import com.haulmont.cuba.gui.screen.*;
import com.company.samaramusor.entity.Contract;

@UiController("samaramusor_Contract.browse")
@UiDescriptor("contract-browse.xml")
@LookupComponent("contractsTable")
@LoadDataBeforeShow
public class ContractBrowse extends StandardLookup<Contract> {
}