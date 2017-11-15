package com.unairobles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

//EN VEZ DE CHAR ESTA HECHO CON STRINGS
//TIENE QUE DEVOLVERTE RESULTADO PARA MOSTRARLO EN Main Y DESPUES LOS MENSAJES EN LA MISMA, EN VEZ DE VOID TIENES QUE CREAR UN DOUBLE Y QUE TE DEVUELVA EL VALOR.
public class Main {
    public static void longitud(int radio) throws IOException {
        System.out.println("La longitud de la circunferencia es " + radio * 2);
    }

    public static void area(int radio) throws IOException {
        System.out.println("El area de la circunferencia es " + radio * radio * Math.PI);//Para calcular numeros elevados Math.pow(r,2(3,4,5,n...)).
    }

    public static void volumen(int radio) throws IOException {
        System.out.println("El volumen de la circunferencia es "//%f ,funcion() muestra el resultado de la funcion directamente
                + radio * radio * radio * Math.PI * 4 / 3);
    }//return = inventas variable y mostrar en funcion Main

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String opcion;
        do {
            System.out.println("=== Calculadora ===\n" +
                    "a) Longitud de la circunferencia\n" +
                    "b) Área del círculo\n" +
                    "c) Volumen de la esfera\n" +
                    "d) Salir\n" +
                    "Opción:");

            opcion = br.readLine();//.toLowerCase().charArt(0);
            switch (opcion) {
                case "a"://si fueran char serian con comillas simples.
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
                case "d":
                    break;
                default://Mensaje de error.
            }
        } while (!Objects.equals(opcion, "d")
                );
    }
}



