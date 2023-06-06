/*
    Crear una clase FechaPropia que maneje fechas en formato string “AAAA-MM-DD”.

    Debe tener un constructor que permita crear una fecha en el formato dado anteriormente.
    La clase debe tener 2 métodos, sumarDias y restarDias donde se envía un número entero
    indicando la cantidad de días que se quiere sumar o restar.

    El cálculo de la fecha debe realizarse sin la ayuda de ninguna clase extra de Java,
    ya sea de librería externa o de alguna clase que exista en las clase estándares de
    Java (el cálculo es manual).

    Crear un set de pruebas con JUnit y verificar que:
    2019-01-01 + 1 días = 2019-01-02
    2019-01-01 + 15 días = 2019-01-16
    ...
*/

package com.example.Ejercicio1;


import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class FechaPropia {
    protected String fecha;     //! AAAA-MM-DD


    public String sumarDias(Integer dias) {
        int anio = Integer.parseInt(fecha.substring(0, 4));
        int mes = Integer.parseInt(fecha.substring(5, 7));
        int dia = Integer.parseInt(fecha.substring(8, 10));

        dia += dias;

        while (dia > diasDelMes(mes, anio)) {
            dia -= diasDelMes(mes, anio);
            mes++;
            if (mes > 12) {
                mes = 1;
                anio++;
            }
        }

        String nuevaFecha = String.format("%04d-%02d-%02d", anio, mes, dia);
        return nuevaFecha;
    }
    
    public String restarDias(Integer dias) {
        int anio = Integer.parseInt(fecha.substring(0, 4));
        int mes = Integer.parseInt(fecha.substring(5, 7));
        int dia = Integer.parseInt(fecha.substring(8, 10));

        dia -= dias;

        while (dia <= 0) {
            mes--;
            if (mes <= 0) {
                mes = 12;
                anio--;
            }
            dia += diasDelMes(mes, anio);
        }

        String nuevaFecha = String.format("%04d-%02d-%02d", anio, mes, dia);
        return nuevaFecha;
    }


    protected static int diasDelMes(int mes, int anio) {
        if (mes == 2) {
            if (anioBisiesto(anio)){
                return 29;
            } else {
                return 28;
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return 30;
        } else {
            return 31;
        }
    }

    protected static boolean anioBisiesto(int anio) {
        return (anio % 4 == 0);
    }
}
