package com.example.Ejercicio1Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

import com.example.Ejercicio1.FechaPropia;

public class MockitoFechaPropiaTest {
    
    @Test
    public void testRestarDias() {
        FechaPropia fechaMock = mock(FechaPropia.class);
        when(fechaMock.sumarDias(180)).thenReturn("2019-06-30");
        assertEquals("2019-06-30", fechaMock.sumarDias(180));
        verify(fechaMock).sumarDias(180);
    }
}


// 2019-01-01 + 180 días = 2019-06-30
// 2019-02-27 + 1 días = 2019-02-28
// 2019-02-28 + 1 días = 2019-03-01
// 2019-03-01 + 1 días = 2019-03-02
// 2019-03-01 + 15 días = 2019-03-16
// 2020-02-29 - 1 días = 2020-02-28
// 2020-03-01 - 1 días = 2020-02-29
// 2020-03-01 - 15 días = 2020-02-15
// 2020-03-01 - 40 días = 2020-01-21