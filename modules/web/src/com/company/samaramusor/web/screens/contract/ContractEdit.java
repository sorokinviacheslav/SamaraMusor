package com.company.samaramusor.web.screens.contract;

import com.haulmont.cuba.gui.screen.*;
import com.company.samaramusor.entity.Contract;

@UiController("samaramusor_Contract.edit")
@UiDescriptor("contract-edit.xml")
@EditedEntityContainer("contractDc")
@LoadDataBeforeShow
public class ContractEdit extends StandardEditor<Contract> {
}