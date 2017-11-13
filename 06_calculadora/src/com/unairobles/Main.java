package com.unairobles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void longitud(int radio) throws IOException {
        System.out.println("La longitud de la circunferencia es " + radio * 2);
    }

    public static void area(int radio) throws IOException {
        System.out.println("El area de la circunferencia es " + radio * radio * 3.1416);
    }

    public static void volumen(int radio) throws IOException {
        System.out.println("El volumen de la circunferencia es " + radio * radio * radio * 3.1416 * 4 / 3);
    }

    public static void main(String[] args) throws IOException {
        System.out.println("=== Calculadora ===\n" +
                "a) Longitud de la circunferencia\n" +
                "b) Área del círculo\n" +
                "c) Volumen de la esfera\n" +
                "d) Salir\n" +
                "Opción:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String opcion = br.readLine();
        switch (opcion) {
            case "a":
                System.out.println("Escribe el radio: ");
                int radio = Integer.parseInt(br.readLine());
                longitud(radio);
                break;
            case "b":
                System.out.println("Escribe el radio: ");
                radio = Integer.parseInt(br.readLine());
                area(radio);
                break;
            case "c":
                System.out.println("Escribe el radio: ");
                radio = Integer.parseInt(br.readLine());
                volumen(radio);
                break;
            default:
        }
    }
}

