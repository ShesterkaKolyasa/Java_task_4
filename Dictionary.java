/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homework_4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 467
 */
public class Dictionary implements Comparable<Dictionary> {
    private String ruWord;
    private ArrayList<String> meaningsOfValue = new ArrayList<String>();
    private ArrayList<String> meaningsOfAbdictation = new ArrayList<String>();
    private ArrayList<String> meaningsOfEngine = new ArrayList<String>();
    private ArrayList<String> meaningsOfBee = new ArrayList<String>();
    private ArrayList<String> meaningsOfBus = new ArrayList<String>();
    private ArrayList<String> newMeanings = new ArrayList<String>();

    public Dictionary(String ruWord) {
        this.ruWord = ruWord;
    }

    public Dictionary() {
    }
    
    public String getRuWord() {
        return ruWord;
    }

    public void setRuWord(String ruWord) {
        this.ruWord = ruWord;
    }

    @Override
    public int compareTo(Dictionary o) {
        return ruWord.compareTo(o.getRuWord());
    }
    
    public ArrayList getMeaningsOfValue(){
        meaningsOfValue.add("Величина");
        meaningsOfValue.add("Значение");
        return meaningsOfValue;
    }
    
    public ArrayList getMeaningsOfAbdictation(){
        meaningsOfAbdictation.add("Отказ");
        meaningsOfAbdictation.add("Отречение");
        meaningsOfAbdictation.add("Сложение полномочий");
        return meaningsOfAbdictation;
    }
    
    public ArrayList getMeaningsOfEngine(){
        meaningsOfEngine.add("Двигатель");
        meaningsOfEngine.add("Генератор");
        return meaningsOfEngine;
    }
    
    public ArrayList getMeaningsOfBee(){
        meaningsOfBee.add("Пчела");
        return meaningsOfBee;
    }
    
    public ArrayList getMeaningsOfBus(){
        meaningsOfBus.add("Автобус");
        meaningsOfBus.add("Шина");
        return meaningsOfBus;
    }
    
//    public ArrayList addNewMeanings(){
//        Scanner scan = new Scanner(System.in);
//        System.out.println("input the translation of this word(to stop input tipe 'stop' or press key 'space'): ");
//        this.newMeanings.add(scan.next());
//        return this.newMeanings;
//    }
}
