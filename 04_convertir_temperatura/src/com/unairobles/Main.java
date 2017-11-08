package com.unairobles;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Temperatura en ºC: ");
	double temperatura = Double.parseDouble(br.readLine());
	System.out.println("Grados ºF: " +convertirTemperatura(temperatura));
    }

    private static double convertirTemperatura(double temperatura) {
        return temperatura*1.8+32;
    }
}
