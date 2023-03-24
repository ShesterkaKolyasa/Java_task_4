/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.homework_4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author 467
 */
public class HomeWork_4 {

    public static void main(String[] args) {
        System.out.println("Домашнее задание №4, РИБО-02-21, Панкратов Максим");
        HashMap<String,ArrayList<String>> dictionaryMap = new HashMap<String,ArrayList<String>>();
        Dictionary dict = new Dictionary();
        dictionaryMap.put("Value", dict.getMeaningsOfValue());
        dictionaryMap.put("Abdictation", dict.getMeaningsOfAbdictation());
        dictionaryMap.put("Engine", dict.getMeaningsOfEngine());
        dictionaryMap.put("Bee", dict.getMeaningsOfBee());
        dictionaryMap.put("Bus", dict.getMeaningsOfBus());
        
        Scanner scan = new Scanner(System.in);
        System.out.println("You want to add new words(Yes/No)? ");
        String state = scan.next();
        
        while( "Yes".equals(state) | "yes".equals(state)){
            System.out.println("Input English word");
            String newWord = scan.next();
            ArrayList<String> ListOfNewMeanings = new ArrayList<String>();
            ListOfNewMeanings.clear();
            System.out.println("Input the translation of this word (to stop input tipe 'stop' or press key 'space'): ");
            String newMeaning = scan.next();
            boolean goOn = true;
            while(goOn == true){
                ListOfNewMeanings.add(newMeaning);
                System.out.println(ListOfNewMeanings);
                newMeaning = scan.next();
                if(("stop".equals(newMeaning))){
                    goOn = false;
                }
            }
            System.out.println("текущий список" + ListOfNewMeanings);
            if (dictionaryMap.containsKey(newWord)){
                ListOfNewMeanings.addAll(dictionaryMap.get(newWord));
                dictionaryMap.put(newWord, ListOfNewMeanings);
            }else{
                dictionaryMap.put(newWord, ListOfNewMeanings);
            }
            //dictionaryMap.put(newWord, ListOfNewMeanings);
            System.out.println(dictionaryMap);
            System.out.println("You want to add new words(Yes/No)? ");
            state = scan.next();
        }
        
        System.out.println("You want to remove translations (Yes/No)? ");
        state = scan.next();
        while( "Yes".equals(state) | "yes".equals(state)){
            System.out.println("Input English word, which translation should be removed: ");
            String EnglishWord = scan.next();
            if (dictionaryMap.containsKey(EnglishWord)){
                ArrayList<String> ListOfRuMeanings = new ArrayList<String>();
                ListOfRuMeanings.addAll(dictionaryMap.get(EnglishWord));
                System.out.println("Input Russian word, that should be removed: ");
                ListOfRuMeanings.remove(scan.next());
                dictionaryMap.put(EnglishWord,ListOfRuMeanings);
            }
            System.out.println("You want to remove translations (Yes/No)? ");
            state = scan.next();
        }
        
        
        TreeMap<String,ArrayList<String>> sortedDictionaryMap = new TreeMap<>(dictionaryMap);
        
        for(Entry<String, ArrayList<String>> entr : sortedDictionaryMap.entrySet()){
            String enWord = entr.getKey();
            ArrayList<String> ruWord = entr.getValue();
            System.out.println(enWord + " - " + ruWord);
        }
    }
}
