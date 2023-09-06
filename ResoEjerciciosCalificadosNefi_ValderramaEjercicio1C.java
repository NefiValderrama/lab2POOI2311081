/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reso.ejercicioscalificados.nefi_valderrama.ejercicio1c;

import java.util.Scanner;

public class ResoEjerciciosCalificadosNefi_ValderramaEjercicio1C {

    public static void main(String[] args) {
        double currentSalary, rating, raise;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Ingrese el salario actual: ");
        currentSalary=sc.nextDouble();
        System.out.println("Ingrese la calificación de desempeño: ");
        rating=sc.nextDouble();
        
        if(rating==1){
            raise=currentSalary+(0.06*currentSalary);
            System.out.println("Cantidad de tu aumento: " +(raise-currentSalary));
            System.out.println("Tu nuevo salario es: " +raise);
        }else if(rating==2){
            raise=currentSalary+(0.04*currentSalary);
            System.out.println("Cantidad de tu aumento: " +raise);
            System.out.println("Cantidad de tu aumento: " +(raise-currentSalary));
        }else if(rating==3){
            raise=currentSalary+(0.015*currentSalary);
            System.out.println("Cantidad de tu aumento: " +raise);
            System.out.println("Cantidad de tu aumento: " +(raise-currentSalary));
        }else{
            System.out.println("Ingrese un número del 1 al 3");
        }
    }
}