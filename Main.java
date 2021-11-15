package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        String[] massiv = new String[] {"Kiwi", "Apple", "Banana", "Orange", "Mandarin", "Pineapple", "Kiwi", "Banana", "Banana", "Mango", "Melon", "Watermelon"};
        ArrayList<String> arrayMassiv = new ArrayList<>(Arrays.asList(massiv));
        System.out.println(arrayMassiv);
        System.out.println("");

        exp_1(massiv);

        //exp_2(massiv);


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
            String str = new String(i.next());
            int x=0;
            for (int j=0; j < m.length; j++) {
                String str_ = m[j];
                if (str.equals(str_)) {
                    x++;
                }
            }
            System.out.print(str + " " + x + " ");
        }

        System.out.println();
        System.out.println(noDupesSet);
    }

    public static void exp_2(String[] m){
        /*
        Это решение нашел в инете, на понимаю как оно работает, по-этому решил по своему,
        а это оставил как образец. Объясните как это работает?
         */
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


}
