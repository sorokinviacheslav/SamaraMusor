package com.company.samaramusor.service;

import org.json.JSONException;

import java.io.IOException;

public interface JSONCoordinatesGetService {
    String NAME = "samaramusor_JSONCoordinatesGetService";

    String readJsonFromUrl(String url) throws IOException, JSONException;
}