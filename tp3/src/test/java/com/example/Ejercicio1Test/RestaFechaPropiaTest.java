package com.example.Ejercicio1Test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.example.Ejercicio1.FechaPropia;

public class RestaFechaPropiaTest {
    @Test
    public void testCalcularFechaEnero19() {
        FechaPropia fecha = new FechaPropia("2019-01-01");
        assertEquals("2018-12-31", fecha.restarDias(1));
        assertEquals("2018-12-17", fecha.restarDias(15));
        assertEquals("2018-11-22", fecha.restarDias(40));
        assertEquals("2018-10-13", fecha.restarDias(80));
        assertEquals("2018-07-05", fecha.restarDias(180));
    }

    @Test
    public void testCalcularFechaFebrero19() {
        FechaPropia fecha = new FechaPropia("2019-02-27");
        assertEquals("2019-02-26", fecha.restarDias(1));
        FechaPropia fecha2 = new FechaPropia("2019-02-28");
        assertEquals("2019-02-27", fecha2.restarDias(1));
    }
    
    @Test
    public void testCalcularFechaFebrero20() {
        FechaPropia fecha = new FechaPropia("2020-02-29");
        assertEquals("2020-02-28", fecha.restarDias(1));
    }
    
    @Test
    public void testCalcularFechaMarzo20() {
        FechaPropia fecha = new FechaPropia("2020-03-01");
        assertEquals("2020-02-29", fecha.restarDias(1));
        assertEquals("2020-02-15", fecha.restarDias(15));
        assertEquals("2020-01-21", fecha.restarDias(40));
        assertEquals("2019-12-12", fecha.restarDias(80));
        assertEquals("2019-09-03", fecha.restarDias(180));
    }

    @Test
    public void testCalcularFechaDiciembre20() {
        FechaPropia fecha = new FechaPropia("2020-12-15");
        assertEquals("2020-12-14", fecha.restarDias(1));
        assertEquals("2020-11-30", fecha.restarDias(15));
        assertEquals("2020-11-05", fecha.restarDias(40));
        assertEquals("2020-09-26", fecha.restarDias(80));
        assertEquals("2020-06-18", fecha.restarDias(180));
    }

}

