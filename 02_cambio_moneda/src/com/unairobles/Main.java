package com.unairobles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void calcularCambio(double valor1, double cambio2) {
        switch (cambio2) {
            case 1:
                double r = valor1 * 1.15934;
                System.out.println("El cambio en dolares es " + r);
                break;
            case 2:
                double r = valor1 * 0.884410;
                System.out.println("El cambio en libras es " + r);
                break;
            case 3:
                double r =  valor1 * 7.68289;
                System.out.println("El cambio en yuanes es " + r);
                break;
            case 4:
                double r = valor1 * 131.844;
                System.out.println("El cambio en yenes es " + r);
                break;
            default:
        }
        } public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduzca una cantidad en euros: 12.5");
        double valor1 = Double.parseDouble(br.readLine());
        System.out.println("Moneda a la que convertir (USD, GBP, CNY, JPY):");
        String conversion = br.readLine();
        switch (conversion) {
            case "USD":
                calcularCambio(valor1, 1);
                break;
            case "GBP":
                calcularCambio(valor1, 2);
                break;
            case "CNY":
                calcularCambio(valor1, 3);
                break;
            case "JPY":
                calcularCambio(valor1, 4);
                break;
            default:
                System.out.println("Esta moneda no existe: ERROR:");
        }
    }
}
