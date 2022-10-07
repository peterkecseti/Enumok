package com.bmszcpatrik.enumok;

import com.bmszcpatrik.enumok.bolygo.Bolygo;

public class Main {
    public static void main(String[] args) {
        for(Bolygo bolygo: Bolygo.values()){
            System.out.println(bolygo);
        }
    }
}
