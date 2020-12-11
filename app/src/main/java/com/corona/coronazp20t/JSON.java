package com.corona.coronazp20t;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class JSON {

    private static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }

    public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
        InputStream is = new URL(url).openStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            String jsonText = readAll(rd);
            JSONObject json = new JSONObject(jsonText);
            return json;
        } finally {
            is.close();
        }
    }

    public static JSONArray getJSONArray(JSONObject json) throws JSONException {

        //JSONObject to JSONArray
        JSONArray jsonArray = json.getJSONArray("drinks");

        return jsonArray;
    }

    public static ArrayList<MargaritaCocktails> getList(JSONArray jsonArray) throws JSONException {
        ArrayList<MargaritaCocktails> margaritaList = new ArrayList<MargaritaCocktails>();
        // Extract data from json and store into ArrayList as class objects
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject json_data = jsonArray.getJSONObject(i);
            // public MargaritaCocktails(String id, String name, String tags, String category, String glass)
            MargaritaCocktails margaritaCocktails = new MargaritaCocktails(
                    json_data.getString("idDrink"),
                    json_data.getString("strDrink"),
                    json_data.getString("strTags"),
                    json_data.getString("strCategory"),
                    json_data.getString("strGlass")
            );
            margaritaList.add(margaritaCocktails);
        }
        return margaritaList;
    }

    public static ArrayList<MargaritaCocktails> getMargaritaListByName(ArrayList<MargaritaCocktails> margaritaArrayList, String cocktailName) {
        ArrayList<MargaritaCocktails> margaritaListByName = new ArrayList<MargaritaCocktails>();
        for (MargaritaCocktails margaritaCocktails : margaritaArrayList) {
            if (margaritaCocktails.getName().contains(cocktailName)) {
                margaritaListByName.add(margaritaCocktails);
            }
        }
        return margaritaListByName;
    }

}
