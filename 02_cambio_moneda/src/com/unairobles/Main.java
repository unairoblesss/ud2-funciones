package com.unairobles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void calcularCambio(double valor1, double cambio2) {
        switch (cambio2) {
            case 1:
                System.out.println("El cambio en dolares es " +(valor1 * 1.15934));
                break;
            case 2:

                System.out.println("El cambio en libras es " +(valor1 * 0.884410));
                break;
            case 3:
                System.out.println("El cambio en yuanes es " +(valor1 * 7.68289));
                break;
            case 4:

                System.out.println("El cambio en yenes es " +(valor1 * 131.844));
                break;
            default:
        }
        } public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduzca una cantidad en euros: ");
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
