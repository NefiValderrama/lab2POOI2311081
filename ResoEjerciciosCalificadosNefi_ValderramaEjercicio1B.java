/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.resoejercicioscalificadosnefi_valderramaejercicio1b;

import java.util.Scanner;

public class ResoEjerciciosCalificadosNefi_ValderramaEjercicio1B {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int N=sc.nextInt();
        if((N%2)!=0){
            System.out.println("Luna");
        }else if(N>1 && N<6){
            System.out.println("Sol");
        }else if(N>5 && N<21){
            System.out.println("Tierra");
        }else if(N>20){
            System.out.println("Galaxia");
        }
    }
}