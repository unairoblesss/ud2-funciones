package com.unairobles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static String morse(char n) {

        switch (n) {
            case 'A':
                return "· —  ";
            case 'B':
                return "— · · ·  ";
            case 'C':
                return "— · — ·  ";
            case 'D':
                return "— · ·  ";
            case 'E':
                return "·  ";
            case 'F':
                return "· · — ·  ";
            case 'G':
                return "— — ·  ";
            case 'H':
                return "· · · ·  ";
            case 'I':
                return "· ·  ";
            case 'J':
                return "· — — —  ";
            case 'K':
                return "— · —  ";
            case 'L':
                return "· — · ·  ";

            case 'M':
                return "— —  ";

            case 'N':
                return "— ·  ";

            case 'Ñ':
                return "— — · — —  ";

            case 'O':
                return "— — —  ";

            case 'P':
                return "· — — ·  ";

            case 'Q':
                return "— — · —  ";

            case 'R':
                return "· — ·  ";

            case 'S':
                return "· · ·  ";

            case 'T':
                return "—  ";

            case 'U':
                return "· · —  ";

            case 'V':
                return "· · · —  ";

            case 'W':
                return "· — —  ";

            case 'X':
                return "— · · —  ";

            case 'Y':
                return "— · — —  ";

            case 'Z':
                return "— — · ·  ";

            default:
                return "@";
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Escribe texto para convertir a morse: ");
        String cadena = br.readLine();

        for (int i = 0; i < cadena.length(); i++) {
            String letra1 = morse(cadena.charAt(i));
            System.out.println(letra1);
        }

        /*
        int i = 0;
        while (i < cadena.length()) {
            String letra1 = morse(cadena.charAt(i));
            System.out.println("El codigo es " + letra1);

            i++;
        }
        */

    }
}

