package com.example.prasannakumara.materialdesign.datatablesandexpansionpanel;

/**
 * Created by PrasannakumarA on 6/27/2017.
 */

public class employeesDetailPOJO {
    String name;
    int id;

    public employeesDetailPOJO(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
