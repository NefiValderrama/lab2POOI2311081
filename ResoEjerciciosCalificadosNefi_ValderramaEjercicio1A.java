/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reso.ejercicioscalificados.nefi_valderrama.ejercicio1a;

import java.util.Scanner;

public class ResoEjerciciosCalificadosNefi_ValderramaEjercicio1A {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese un número a evaluar: ");
        long x=sc.nextLong();
        if(x>-129 && x<128){
            System.out.println(x+" puede ser almacenado en: byte, short, int y long");
        }else if(x>-32769 && x<32768){
            System.out.println(x+" puede ser almacenado en: short, int y long");
        }else if(x>(Math.pow(-2, 31)-1) && x<Math.pow(2, 31)){
            System.out.println(x+" puede ser almacenado en: int y long");
        }else if(x>(Math.pow(-2, 63)-1) && x<Math.pow(2, 63)){
            System.out.println(x+" puede ser almacenado en: long");
        }else{
            System.out.println(x+" no puede ser almacenado en ningún lado");
        }
    }
}