package com.unairobles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int factorial(int numero1) throws IOException {
        int resultado = 0;
        int i;
        for (i = 0; i <= numero1; i++) {
            resultado = numero1 * (numero1 - 1);
            return numero1;
        }
        return i;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Escribe numero del que calcular factorial: ");
        int numero1 = Integer.parseInt(br.readLine());
        int resultado = 0;
        if (numero1 > 0) {
            resultado = factorial(numero1);
        } else {
        }
        System.out.println("El resultado es " + resultado);
    }
}