package com.example;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)   //! suite de pruebas
@Suite.SuiteClasses({
    com.example.Ejercicio1Test.SumaFechaPropiaTest.class,
    com.example.Ejercicio1Test.RestaFechaPropiaTest.class,
    com.example.Ejercicio1Test.MockitoFechaPropiaTest.class,
})
public class MainTest {
    
}