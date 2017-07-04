package com.example.prasannakumara.materialdesign.realmdatabase;

import io.realm.RealmObject;

/**
 * Created by PrasannakumarA on 6/7/2017.
 */

public class RealnModel extends RealmObject {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "RealnModel{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
