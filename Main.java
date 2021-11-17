package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        String[] massiv = new String[] {"Kiwi", "Apple", "Banana", "Orange", "Mandarin", "Pineapple", "Kiwi", "Banana", "Banana", "Mango", "Melon", "Watermelon"};
        ArrayList<String> arrayMassiv = new ArrayList<>(Arrays.asList(massiv));
//        System.out.println(arrayMassiv);
//        System.out.println("");

//        exp_1(massiv);

        //exp_1_1(massiv);
        exp_2();

       

    }

    public static void exp_1(String[] m){
        /*
        Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
        Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
        Посчитать сколько раз встречается каждое слово.

        Мое решение первого задания.
        */

        Set<String> noDupesSet = new HashSet<>(Arrays.asList(m));

        Iterator<String> i = noDupesSet.iterator();
        while (i.hasNext()) {
            String str_noDupesSet = new String(i.next());
            int x=0;
            for (int j=0; j < m.length; j++) {
                String str_massiv = m[j];
                if (str_noDupesSet.equals(str_massiv)) {
                    x++;
                }
            }
            System.out.print(str_noDupesSet + " " + x + " ");
        }

        System.out.println();
        System.out.println(noDupesSet);
    }

    public static void exp_1_1(String[] m){
        /**
        Это решение нашел в инете, не понимаю как оно работает, по-этому решил по своему,
        а это оставил как образец. Объясните как это работает?
         **/
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        for (int i = 0; i< m.length; i++){
            if (treeMap.containsKey(m[i])){
                treeMap.put(m[i], treeMap.get(m[i])+1);
            }else{
                treeMap.put(m[i], 1);
            }
        }

        System.out.println(treeMap);
    }

/**
 Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
 В этот телефонный справочник с помощью метода add() можно добавлять записи. 
 С помощью метода get() искать номер телефона по фамилии. 
 Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), 
 тогда при запросе такой фамилии должны выводиться все телефоны.
 **/
    
    public static void exp_2(){

        PhoneList phoneList = new PhoneList();

        phoneList.add("Вася", "79181992345");
        phoneList.add("Вася", "79181992345");
        phoneList.add("Вася", "79181991245");
        phoneList.add("Вася", "79181292345");
        phoneList.add("Паша", "79181992345");
        phoneList.add("Вова", "79181592314");
        phoneList.add("Паша", "79181992317");
        phoneList.add("Маша", "79181163084");

        phoneList.get("Вася");
        phoneList.get("Vasya");
        phoneList.get("Маша");
        phoneList.get("Паша");
    }


}
