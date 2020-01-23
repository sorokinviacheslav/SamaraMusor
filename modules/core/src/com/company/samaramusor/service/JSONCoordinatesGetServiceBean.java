package com.company.samaramusor.service;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;

@Service(JSONCoordinatesGetService.NAME)
public class JSONCoordinatesGetServiceBean implements JSONCoordinatesGetService {

    @Override
    public String readJsonFromUrl(String url) throws IOException, JSONException {
        InputStream is = new URL(url).openStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            String jsonText = readAll(rd);
            JSONObject json = new JSONObject(jsonText);
            JSONArray array = (JSONArray)json.getJSONObject("result").get("address");
            json = (JSONObject)array.get(0);
            json = (JSONObject) ((JSONObject)json.getJSONArray("features").get(0)).get("geometry");
            array=((JSONObject)json.getJSONArray("geometries").get(0)).getJSONArray("coordinates");
            return array.get(0)+" "+ array.get(1);
        } finally {
            is.close();
        }
    }

    private String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }
}