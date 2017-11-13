package com.unairobles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void convertirTemperatura(double escala) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Escribe grados ºc a convertir: ");
        double temperatura = Integer.parseInt(br.readLine());
        if (escala == 1) {
            System.out.println(1.8 * temperatura + 329);
        } else {
            System.out.println(temperatura + 273.15);
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println("=== Temperaturas ===");
        System.out.println("1. Convertir a Fahrenheit");
        System.out.println("2. Convertir a Kelvin");
        System.out.println("3. Salir");
        System.out.print("Opción:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double escala = Integer.parseInt(br.readLine());
        if (escala == 3) {
        } else {
            convertirTemperatura(escala);
        }

    }

}
