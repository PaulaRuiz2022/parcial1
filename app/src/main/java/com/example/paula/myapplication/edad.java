package com.example.paula.myapplication;

import java.io.Serializable;

public class edad implements Serializable {

    public static String factorial(int n,int base){
        if (n == 0 || n == 1) {

            return ""+base;

        } else {

            return factorial(n - 1, n*base);
        }
    }
}
