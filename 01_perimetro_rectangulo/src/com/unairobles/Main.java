package com.unairobles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int perimetroRectangulo(int a, int b) {
	int r = a * b;
    return r;} //funcion2:Funcion que hace la operacipn a*b
public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Escribe la altura");
    int a = Integer.parseInt(br.readLine());
    System.out.println("Escribe la base");
    int b = Integer.parseInt(br.readLine());
    int r = perimetroRectangulo(a, b);
    System.out.println("El perimetro es " + r);
}//funcion1:Funcion que llama a la otra funcion1 despues de preguntar los valores de a y b sustituyendolos en la funcion1//
 }
