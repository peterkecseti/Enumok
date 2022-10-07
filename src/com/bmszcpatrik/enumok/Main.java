package com.bmszcpatrik.enumok;

import com.bmszcpatrik.enumok.bolygo.Bolygo;

public class Main {

    public static void main(String[] args) {
        int suly = 100;
        double tomeg = (suly / Bolygo.FOLD.getG());
        for (Bolygo bolygo : Bolygo.values()) {
            System.out.println(bolygo + ": " + bolygo.getSuly(tomeg));
        }
    }}
