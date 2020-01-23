package com.company.samaramusor.web.screens;

import com.company.samaramusor.service.JSONCoordinatesGetService;
import com.haulmont.cuba.core.app.importexport.EntityImportExportService;
import com.haulmont.cuba.core.app.importexport.EntityImportView;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.gui.screen.Screen;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;
import org.json.JSONObject;

import javax.inject.Inject;
import java.io.IOException;
import java.net.URL;
import java.net.URLEncoder;

@UiController("samaramusor_TestScreen")
@UiDescriptor("test-screen.xml")
public class TestScreen extends Screen {
    @Inject
    private JSONCoordinatesGetService jSONCoordinatesGetService;
    @Inject
    private TextField<String> text2;
    @Inject
    private EntityImportExportService entityImportExportService;
    @Inject
    private TextField<String> text1;
    @Inject
    private TextField<String> textInsert;

    @Subscribe("buttonTest")
    public void onButtonTestClick(Button.ClickEvent event) {
        try {
            String par = textInsert.getValue();
            par = URLEncoder.encode(par,"utf-8");
            String str = jSONCoordinatesGetService.readJsonFromUrl("http://search.maps.sputnik.ru/search/addr?q="+par);
            String[] arrayString = str.split("\\s+");
            text1.setValue(arrayString[0]);
            text2.setValue(arrayString[1]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}