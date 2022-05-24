package org.example;

import com.sun.jdi.StringReference;

import java.util.Scanner;

public class Pruebas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 123;
        String numToString = String.valueOf(num);
        String texto = "perro";
        try {
            int resultado= numToString-3;
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}

