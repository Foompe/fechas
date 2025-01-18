/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fechas;

import java.time.LocalDate;

/**
 *
 * @author FP Multip
 */
public class Fechas {

    public static void main(String[] args) {
        LocalDate fecha = LocalDate.of(LocalDate.now().getYear(),1,1);
        System.out.println("Fecha 1: " + fecha);
        
        LocalDate fecha2 = LocalDate.of(LocalDate.now().getYear(),3,15);
        System.out.println("Fecha 2: " + fecha2);
        
        LocalDate fechaHOY = LocalDate.of(LocalDate.now().getYear(),LocalDate.now().getMonth(),LocalDate.now().getDayOfMonth());
        System.out.println("Fecha de hoy: " + fechaHOY);
    }
}
