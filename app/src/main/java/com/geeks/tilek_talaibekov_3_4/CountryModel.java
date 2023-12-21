package com.geeks.tilek_talaibekov_3_4;

import java.io.Serializable;

public class CountryModel implements Serializable {
    private String map;
    private String name;

    public CountryModel(String map, String name) {
        this.map = map;
        this.name = name;
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
