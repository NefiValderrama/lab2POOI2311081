/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reso.ejercicioscalificados.nefi_valderrama.ejercicio1d;

import java.util.Scanner;

public class ResoEjerciciosCalificadosNefi_ValderramaEjercicio1D {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese un número a evaluar: ");
        int x=sc.nextInt();
        int y=x%12;
        String ZodiacSign=""; 
        switch(y){
            case 0:
                System.out.println(x+" es el año del monkey.");
                break;
            case 1:
                System.out.println(x+" es el año del gallo.");
                break;
            case 2:
                System.out.println(x+" es el año del perro.");
                break;
            case 3:
                System.out.println(x+" es el año del cerdo.");
                break;
            case 4:
                System.out.println(x+" es el año de la rata.");
                break;
            case 5:
                System.out.println(x+" es el año del buey.");
                break;
            case 6:
                System.out.println(x+" es el año del tigre.");
                break;
            case 7:
                System.out.println(x+" es el año del conejo.");
                break;
            case 8:
                System.out.println(x+" es el año del dragón.");
                break;
            case 9:
                System.out.println(x+" es el año de la serpiente.");
                break;
            case 10:
                System.out.println(x+" es el año del cabello.");
                break;
        }
    }
}
