package com.unairobles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static double calcularCambio(double introducido) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader());
        String moneda = br.readLine();
        switch (moneda) {
            case "USD":
                moneda = introducido * 1.16115;
            break;
            case "GBP":
                moneda = introducido * 0.881121;
            break;
            case "CNY":
                moneda = introducido * 7.70211;
            break;
            case "JPY":
                moneda = introducido * 132.0323;
            break;}
        return introducido;}
    public static void  (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader());
        System.out.println(" Introduzca la cantidad en euros:  ");
        int introducido = (br.readLine());
        System.out.println(" Moneda a la que convertir (USD,GBP,CNY,JPY):  ");
        String moneda = calcularCambio(introducido);

    }
}
