package org.example.Ejercicio1;

import org.springframework.beans.factory.annotation.Autowired;

public class ArranqueE1 {
    @Autowired
    CalculatorService calculator;
    public void arranque() {
        // Potencia de 2 números
        int potencia1 = this.calculator.calculatePower(2, 3);
        int potencia2 = this.calculator.calculatePower(4,4);

        // Potencia de 1 número y el exponente default (2)
        int potencia3 = this.calculator.calculatePowerDefault(2);
        int potencia4 = this.calculator.calculatePowerDefault(4);

        // Raíz de 2 números
        double raiz1 = this.calculator.calculateRoot(2, 2);
        double raiz2 = this.calculator.calculateRoot(9,5);

        // Raiz de 1 número y la raiz default (3)
        double raiz3 = this.calculator.calculateRootDefault(3);
        double raiz4 = this.calculator.calculateRootDefault(4);

        System.out.println("2^3 = " + potencia1);
        System.out.println("4^4 = " + potencia2);
        System.out.println("2^2 (Default) = " + potencia3);
        System.out.println("4^2 (Default) = " + potencia4);

        System.out.println("2^(1/2) = " + raiz1);
        System.out.println("9^(1/5) = " + raiz2);
        System.out.println("3^(1/3) (Default) = " + raiz3);
        System.out.println("4^(1/3) (Default) = " + raiz4);

    }
}
