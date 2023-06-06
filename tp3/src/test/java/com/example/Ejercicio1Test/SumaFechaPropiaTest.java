package com.example.Ejercicio1Test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.example.Ejercicio1.FechaPropia;

public class SumaFechaPropiaTest {
    @Test
    public void testCalcularFechaEnero19() {
        FechaPropia fecha = new FechaPropia("2019-01-01");
        assertEquals("2019-01-02", fecha.sumarDias(1));
        assertEquals("2019-01-16", fecha.sumarDias(15));
        assertEquals("2019-02-10", fecha.sumarDias(40));
        assertEquals("2019-03-22", fecha.sumarDias(80));
        assertEquals("2019-06-30", fecha.sumarDias(180));
    }

    @Test
    public void testCalcularFechaFebrero19() {
        FechaPropia fecha = new FechaPropia("2019-02-27");
        assertEquals("2019-02-28", fecha.sumarDias(1));
        FechaPropia fecha2 = new FechaPropia("2019-02-28");
        assertEquals("2019-03-01", fecha2.sumarDias(1));
    }

    @Test
    public void testCalcularFechaMarzo19() {
        FechaPropia fecha = new FechaPropia("2019-03-01");
        assertEquals("2019-03-02", fecha.sumarDias(1));
        assertEquals("2019-03-16", fecha.sumarDias(15));
        assertEquals("2019-04-10", fecha.sumarDias(40));
        assertEquals("2019-05-20", fecha.sumarDias(80));
        assertEquals("2019-08-28", fecha.sumarDias(180));
    }
    
    @Test
    public void testCalcularFechaEnero20() {
        FechaPropia fecha = new FechaPropia("2020-01-01");
        assertEquals("2020-01-02", fecha.sumarDias(1));
        assertEquals("2020-01-16", fecha.sumarDias(15));
        assertEquals("2020-02-10", fecha.sumarDias(40));
        assertEquals("2020-03-21", fecha.sumarDias(80));
        assertEquals("2020-06-29", fecha.sumarDias(180));
    }

    @Test
    public void testCalcularFechaFebrero20() {
        FechaPropia fecha = new FechaPropia("2020-02-27");
        assertEquals("2020-02-28", fecha.sumarDias(1));
        FechaPropia fecha1 = new FechaPropia("2020-02-28");
        assertEquals("2020-02-29", fecha1.sumarDias(1));
        FechaPropia fecha2 = new FechaPropia("2020-02-29");
        assertEquals("2020-03-01", fecha2.sumarDias(1));
    }

    @Test
    public void testCalcularFechaMarzo20() {
        FechaPropia fecha = new FechaPropia("2020-03-01");
        assertEquals("2020-03-02", fecha.sumarDias(1));
        assertEquals("2020-03-16", fecha.sumarDias(15));
        assertEquals("2020-04-10", fecha.sumarDias(40));
        assertEquals("2020-05-20", fecha.sumarDias(80));
        assertEquals("2020-08-28", fecha.sumarDias(180));
    }

    @Test
    public void testCalcularFechaDiciembre20() {
        FechaPropia fecha = new FechaPropia("2020-12-15");
        assertEquals("2020-12-16", fecha.sumarDias(1));
        assertEquals("2020-12-30", fecha.sumarDias(15));
        assertEquals("2021-01-24", fecha.sumarDias(40));
        assertEquals("2021-03-05", fecha.sumarDias(80));
        assertEquals("2021-06-13", fecha.sumarDias(180));
    }

}
