/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.fechas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author FP Multip
 */
public class Fechas {

    public static void main(String[] args) {
/**
        //Ejercicio 1
        LocalDate fecha = LocalDate.of(LocalDate.now().getYear(), 1, 1);
        System.out.println("Fecha 1: " + fecha);
        
        //Parte A
        LocalDate fecha2 = LocalDate.of(LocalDate.now().getYear(), 3, 15);
        System.out.println("Fecha 2: " + fecha2);

         //ParteB 
        LocalDate fechaHOY = LocalDate.now();
        System.out.println("Fecha de hoy: " + fechaHOY);

        //Ejercicio2
        LocalDate fechaActual = LocalDate.now();
        if (fechaActual.isLeapYear()) {
            System.out.println("Es un año bisiesto");
        } else {
            System.out.println("No es un año bisiesto");
        }

        //Ejercicio 3
        Scanner teclado = new Scanner(System.in);

        //Parte A
        System.out.println("introduce el día");
        int dia = Integer.parseInt(teclado.nextLine());
        System.out.println("introduce el mes");
        int mes = Integer.parseInt(teclado.nextLine());
        System.out.println("Introduce el año");
        int año = Integer.parseInt(teclado.nextLine());
        LocalDate fechaNoParse = LocalDate.of(año, mes, dia);
        System.out.println("Has fijado fecha sin formato: " + fechaNoParse);

        //Parte B
        System.out.println("Introduce fecha con el siguiente formato: AAAA-MM-DD");
        String stFecha = teclado.nextLine();
        LocalDate fechaParse = LocalDate.parse(stFecha);
        System.out.println("Has fijado la fecha con formato: " + fechaParse);
        

        //Ejercicio 4
        if (fechaNoParse.isEqual(fechaParse)) {
            System.out.println("Las fechas son iguales");
        } else {
            System.out.println("Las fechas son diferentes");
        }
        
        if(fechaNoParse.isBefore(fechaParse)) {
            System.out.println("La fecha anterior es: " + fechaNoParse);
        } else {
            System.out.println("La fecha " + fechaNoParse + "no es anterior");
        }
        
        if(fechaNoParse.isAfter(fechaParse)) {
            System.out.println("La fecha posterior es: " + fechaNoParse);
        } else {
            System.out.println("La fecha " + fechaNoParse + "no es posterior");
        }
   
        
        //Ejercicio 5
        Scanner teclado = new Scanner(System.in);

        //Parte A
        //tomamos la fecha
        System.out.println("introduce el día");
        int dia = Integer.parseInt(teclado.nextLine());
        System.out.println("introduce el mes");
        int mes = Integer.parseInt(teclado.nextLine());
        System.out.println("Introduce el año");
        int año = Integer.parseInt(teclado.nextLine());
        LocalDate fechaNoParse = LocalDate.of(año, mes, dia);
        System.out.println("Has fijado fecha sin formato: " + fechaNoParse);
        //sumamos 30 dias (para lanzar debemos importar el paquete chronoUnit
        fechaNoParse = fechaNoParse.plus(30,ChronoUnit.DAYS);
        System.out.println("Sumando 30 días: " + fechaNoParse);
        
        //Parte B
        fechaNoParse.plus(57,ChronoUnit.DAYS);
        System.out.println("Sumando 57 días, estamos a: " + fechaNoParse.getDayOfWeek() + " día: " + fechaNoParse.getDayOfMonth());
             
        //Ejercicio 6
        //Scanner teclado = new Scanner(System.in);
        LocalDate fechaHoy = LocalDate.now();
        System.out.println("fecha 1: " + fechaHoy);
        //Parte A
        System.out.println("Calculo de años\nIntroduce tu fecha de nacimiento en formato AAAA-MM--DD");
        String Cumple = teclado.nextLine();
        LocalDate fechaCumple = LocalDate.parse(Cumple);
        
        long anos = fechaCumple.until(fechaHoy, ChronoUnit.YEARS);
        System.out.println("Tienes " + anos + " años.");
    */    
        //Parte B (para que funcione debemos pasar de LocalDate a LocalDateTime que toma tambien horas, minutos y segundos;
        LocalDateTime fechaHoyS = LocalDateTime.now();
        System.out.println("Calculo de los segundos que han pasado desde principios de año.");
        LocalDateTime ano1 = LocalDateTime.of(2025,01 , 01, 0, 0, 0);
        long segundos = ano1.until(fechaHoyS,ChronoUnit.SECONDS);
        System.out.println("Han pasado: " + segundos + " segundos\n");
        
        //Parte C
         System.out.println("Calculo de días que faltan para las vaciones de verano");
         LocalDate fechaHoy = LocalDate.now();
         LocalDate vacas = LocalDate.of(2025, 06, 15);
         long dias = ChronoUnit.DAYS.between(fechaHoy, vacas);
         System.out.println("Fecha de hoy: " + fechaHoy + "\nComienzo vacas: " + vacas + "\nFaltan " + dias + " dias para las vacaciones de verano");
    }
}
