package com.company;

import java.util.HashMap;
import java.util.HashSet;

public class PhoneList {

    private HashMap<String, HashSet<String>> phList;

    public PhoneList() {
        phList = new HashMap<>();
    }

    public void add(String name, String phone){
        if (phList.containsKey(name)){phList.get(name).add(phone);}
        else {phList.put(name, new HashSet<>());
        phList.get(name).add(phone);}

    }

    public void get(String name) {
        if (phList.containsKey(name)){
            System.out.println(phList.get(name) + " Это номера " + name);
        } else {
            System.out.println( "Номера нет в базе");
        }
    }

}
