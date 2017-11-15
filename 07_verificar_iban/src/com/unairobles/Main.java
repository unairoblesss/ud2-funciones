package com.unairobles;//Ni empezado lo tengo...

public class Main {
    public static boolean esValido(String iban) {
        iban = iban.replaceAll("\\s+", "");//Quitar espacios
        String cuatroPrimeros = iban.substring(0, 4);//Devolver numero concreto de caracteres
        String restoCadena = iban.substring(4);
        int numero1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(cuatroPrimeros.charAt(0))+10;
        int numero2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(cuatroPrimeros.charAt(1))+10;
        String nuevoIban = restoCadena+numero1+numero2+cuatroPrimeros.substring(2,4);
        long numero = Long.parseLong(nuevoIban);
        return numero % 97 == 1;
    }

    public static void main(String[] args) {
        if (esValido("BE88 3200 3471 3441")) {
            System.out.println("OK");
        } else {
            System.out.println("ERROR");
        }
    }
}
