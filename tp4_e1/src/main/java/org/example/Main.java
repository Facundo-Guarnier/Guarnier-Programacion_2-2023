package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.example.Ejercicio1.ApplicationConfigE1;
import org.example.Ejercicio1.ApplicationContextProviderE1;
import org.example.Ejercicio1.ArranqueE1;

public class Main {
    public static void main(String[] args) {

        // Ejercicio 1
        ApplicationContext contexte1 = new AnnotationConfigApplicationContext(ApplicationConfigE1.class);
        ArranqueE1 arranquee1 = contexte1.getBean(ArranqueE1.class);
        ApplicationContextProviderE1 applicationContextProviderE1 = new ApplicationContextProviderE1();
        applicationContextProviderE1.setApplicationContext(contexte1);
        arranquee1.arranque();
    }

}