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

        Scanner teclado = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {
            System.out.println("Escoge que ejercicio quieres ver:\n"
                    + " 1 - Construcción de fechas\n"
                    + " 2 - Comprobación de año bisiesto\n"
                    + " 3 - Formas de crear un objeto LocalDate\n"
                    + " 4 - Comparación de fechas\n"
                    + " 5 - Suma, resta de fechas\n"
                    + " 6 - Calculo de diferencias de tiempo entre fechas\n"
                    + " 7 - Salir");

            int eleccion = teclado.nextInt();

            switch (eleccion) {
                case 1:
                    System.out.println("Has seleccionado la opción 1.Construcción de fechas");

                    LocalDate fecha = LocalDate.of(LocalDate.now().getYear(), 1, 1);
                    System.out.println("Fecha 1: " + fecha);

                    System.out.println("Parte A: Construlle fecha del 15 de marzo de este año");
                    LocalDate fecha2 = LocalDate.of(LocalDate.now().getYear(), 3, 15);
                    System.out.println("Fecha 2: " + fecha2);

                    System.out.println("ParteB: Construlle la fecha de hoy");
                    LocalDate fechaHOY = LocalDate.now();
                    System.out.println("Fecha de hoy: " + fechaHOY);

                    break;
                case 2:
                    System.out.println("Has seleccionado la opción 2.Comprobación de año bisiesto");
                    System.out.println("Comprobamos si este año es bisiesto");

                    LocalDate fechaActual = LocalDate.now();
                    if (fechaActual.isLeapYear()) {
                        System.out.println("Es un año bisiesto");
                    } else {
                        System.out.println("No es un año bisiesto");
                    }

                    break;
                case 3:
                    System.out.println("Has seleccionado la opción 3.Formas de crear un objeto LocalDate");

                    System.out.println("Parte A: Pedimos los datos por separado(no es necesario parsear la fecha)");
                    System.out.println("introduce el día");
                    int dia = Integer.parseInt(teclado.nextLine());
                    System.out.println("introduce el mes");
                    int mes = Integer.parseInt(teclado.nextLine());
                    System.out.println("Introduce el año");
                    int año = Integer.parseInt(teclado.nextLine());
                    LocalDate fechaNoParse = LocalDate.of(año, mes, dia);
                    System.out.println("Has fijado fecha sin formato: " + fechaNoParse);

                    System.out.println("Parte B: Pedimos la fecha con un determinado formato");
                    System.out.println("Introduce fecha con el siguiente formato: AAAA-MM-DD");
                    String stFecha = teclado.nextLine();
                    LocalDate fechaParse = LocalDate.parse(stFecha);
                    System.out.println("Has fijado la fecha con formato: " + fechaParse);

                    break;
                case 4:
                    System.out.println("Has seleccionado la opción 4.- Comparación de fechas");
                    System.out.println("Introduce fecha4a en formato AAAA-MM-DD");
                    String setfecha4a = teclado.nextLine();
                    LocalDate fecha4a = LocalDate.parse(setfecha4a);
                    System.out.println("Introduce fecha4b en formato AAAA-MM-DD");
                    String setfecha4b = teclado.nextLine();
                    LocalDate fecha4b = LocalDate.parse(setfecha4b);

                    if (fecha4a.isEqual(fecha4b)) {
                        System.out.println("Las fechas son iguales");
                    } else {
                        System.out.println("Las fechas son diferentes");
                    }

                    if (fecha4a.isBefore(fecha4b)) {
                        System.out.println("La fecha anterior es: " + fecha4a);
                    } else {
                        System.out.println("La fecha " + fecha4a + "no es anterior");
                    }

                    if (fecha4a.isAfter(fecha4b)) {
                        System.out.println("La fecha posterior es: " + fecha4a);
                    } else {
                        System.out.println("La fecha " + fecha4a + "no es posterior");
                    }

                    break;
                case 5:

                    System.out.println("Has seleccionado la opción 5.Suma, resta de fechas");
                    System.out.println("Parte A: Introducir fecha por separado y se le suman 30 días ");

                    //tomamos la fecha
                    System.out.println("introduce el día");
                    int dia5 = Integer.parseInt(teclado.nextLine());
                    System.out.println("introduce el mes");
                    int mes5 = Integer.parseInt(teclado.nextLine());
                    System.out.println("Introduce el año");
                    int año5 = Integer.parseInt(teclado.nextLine());
                    LocalDate fecha5a = LocalDate.of(año5, mes5, dia5);
                    System.out.println("Has fijado fecha sin formato: " + fecha5a);
                    //sumamos 30 dias (para lanzar debemos importar el paquete chronoUnit
                    fecha5a = fecha5a.plus(30, ChronoUnit.DAYS);
                    System.out.println("Sumando 30 días: " + fecha5a);

                    //Parte B
                    fecha5a.plus(57, ChronoUnit.DAYS);
                    System.out.println("Parte B: A la fecha anterior le sumamos 57 dias\n"
                            + "Sumando 57 días, estamos a: " + fecha5a.getDayOfWeek() + " día: " + fecha5a.getDayOfMonth());

                    break;
                case 6:
                    System.out.println("Has seleccionado la opción 6.Calculo de diferencias de tiempo entre fechas");
                    
                    System.out.println("Parte A: Calcular los años de una persona pidiendo su fecha de nacimiento");
                    //Tomamos la fecha de hoy
                    LocalDate fechaHoy = LocalDate.now();
                    System.out.println("Introduce tu fecha de nacimiento en formato AAAA-MM--DD");
                    String Cumple = teclado.nextLine();
                    LocalDate fechaCumple = LocalDate.parse(Cumple);
                    
                    //calculamos la fiferencia y mostramos por pantalla
                    long anos = fechaCumple.until(fechaHoy, ChronoUnit.YEARS);
                    System.out.println("Tienes " + anos + " años.");
                    
                    //Parte B (para que funcione debemos pasar de LocalDate a LocalDateTime que toma tambien horas, minutos y segundos;
                    LocalDateTime fechaHoyS = LocalDateTime.now();
                    System.out.println("Parte B: Calcular los segundos que han pasado desde principios de año hasta la fecha de hoy");
                    LocalDateTime ano1 = LocalDateTime.of(2025, 01, 01, 0, 0, 0);
                    long segundos = ano1.until(fechaHoyS, ChronoUnit.SECONDS);
                    System.out.println("Han pasado: " + segundos + " segundos\n");

                    //Parte C
                    System.out.println("Parte C: Calcular los días que faltan para las vaciones de verano desde la fecha actual");
                    LocalDate fechaHoy6 = LocalDate.now();
                    LocalDate vacas = LocalDate.of(2025, 06, 15);
                    long dias = ChronoUnit.DAYS.between(fechaHoy6, vacas);
                    System.out.println("Fecha de hoy: " + fechaHoy6 + "\nComienzo vacas: " + vacas + "\nFaltan " + dias + " dias para las vacaciones de verano");

                    break;
                case 7:
                    System.out.println("Has seleccionado la opción 7. Salir");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona un número del 1 al 7.");
            }
        }
    }
}