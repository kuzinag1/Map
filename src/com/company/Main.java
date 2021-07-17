package com.company;

import java.util.*;


public class Main {

   static HashMap<String, String>  humans = new HashMap<>();

    public static void main(String[] args) {
        humans.put("Алексей", "Иванов");
        humans.put("Иван", "Сидоров");
        humans.put("Сергей", "Козлов");
        humans.put("Александр", "Иванов");
        humans.put("Анатолий", "Иванов");
        humans.put("Мария", "Иванова");
        humans.put("Светлана", "Сидорова");
        humans.put("Ирина", "Козлова");
        humans.put("Марина", "Иванова");
        humans.put("Ольга", "Сидорова");
        System.out.println(CheckedSameName("Иванов"));

    }

    public static int CheckedSameName(String name) {
        int count = 0;

        for(Map.Entry<String,String> mapEntry: humans.entrySet()) {

            if(name.equalsIgnoreCase(mapEntry.getValue())) {
                ++count;
            }

        }
        return count;
    }
}
