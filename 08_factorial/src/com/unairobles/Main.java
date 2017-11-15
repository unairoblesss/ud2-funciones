package com.unairobles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int iterativo(int numero1) throws IOException {
        int resultado = 1;
        for (int i = 1; i <= numero1; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static int factorial(int numero1) throws IOException {
        if (numero1 < 0) {
            return factorial(numero1 - 1) * numero1;
        } else {
            return 1;
        }

    }

    public static void main(String[] args) throws IOException {//SIN CORREGIR
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//SIN CORREGIR
        System.out.println("Escribe numero del que calcular factorial: ");//SIN CORREGIR
        int numero1 = Integer.parseInt(br.readLine());//SIN CORREGIR
        int resultado = 0;//SIN CORREGIR
        if (numero1 > 0) {//SIN CORREGIR
            resultado = factorial(numero1);//SIN CORREGIR
            numero1 = numero1 - 1;//SIN CORREGIR
        } else {//SIN CORREGIR
        }//SIN CORREGIR
        ;//SIN CORREGIR
        System.out.println("El resultado es " + resultado);//SIN CORREGIR
    }//SIN CORREGIR
}//SIN CORREGIR