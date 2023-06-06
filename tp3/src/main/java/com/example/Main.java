package com.example;

import java.time.LocalDate;

import com.example.Ejercicio1.FechaPropia;

public class Main {
    public static void main( String[] args ) {
        FechaPropia fecha = new FechaPropia(LocalDate.now().toString());
        
        System.out.println("Ayer fue " + fecha.restarDias(1));
        System.out.println("Mañana es " + fecha.sumarDias(1));
    }
}
