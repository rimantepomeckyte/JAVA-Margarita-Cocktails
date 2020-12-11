package com.corona.coronazp20t;

public class MargaritaCocktails {
    private String id;
    private String name;
    private String tags;
    private String category;
    private String glass;

    public MargaritaCocktails(String id, String name, String tags, String category, String glass) {
        this.id = id;
        this.name = name;
        this.tags = tags;
        this.category = category;
        this.glass = glass;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getGlass() {
        return glass;
    }

    public void setGlass(String glass) {
        this.glass = glass;
    }
}
// generuoti geterius ir seterius
//istrint corona
//adapteris prades raudonuoti - kur yra corona pakeisti i margarita
//34eilutes adapteri keisti edittext.texName ir po to get textid is cia
//search activity pakeisti margaritaList
//conatainer_corona pakeisti i margarita container
// <Corona> pakeisti <Margarita>
//api ikelt nauja ir butinai pakeist covid_api i margarita
//ARrayListMargarita padaryti
//margartitaListByCountry
// ties 47 min kazka istrint apie if , exceptions palikt
//gal teisingiau coctails pavadint o ne margarita
//kazka istryne teis 52min
// galimi klausimai: kur json apdorojamas, kur recycleView isideda, kam tas adaptareis, prisiminti mane funkcionalumas
