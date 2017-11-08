package com.unairobles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static boolean esImpar(int n) {
        return !esPar(n);}

    public static boolean esPar (int n){
        if (n%2==0){
        return true;}
        else{
        return false;}}

    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println(" Escribe un numero: ");
	int numero = Integer.parseInt(br.readLine());
	if (esPar(numero)) {
	    System.out.println(" Es PAR");}
	    else {System.out.println("Es IMPAR");}
    }
}
