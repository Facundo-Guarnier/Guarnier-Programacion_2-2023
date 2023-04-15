package Clases;

import Excepciones.ParametroNegativoExepcion;

import java.util.ArrayList;

public class Cuadrado implements FiguraGeometrica {
    private double lado;
    private double ejex;
    private double ejey;

    public Cuadrado(double lado) throws ParametroNegativoExepcion {
        if (lado >= 0) {
            this.lado = lado;
        } else {
            throw new ParametroNegativoExepcion("El lado no puede ser negativo.");
        }

    }

    public Cuadrado(double lado, double ejex, double ejey) throws ParametroNegativoExepcion {
        if (lado >= 0) {
            this.lado = lado;
        } else {
            throw new ParametroNegativoExepcion("Los lados no pueden ser negativo.");
        }
        if (ejex >= 0 && ejey >= 0) {
            this.ejey = ejey;
            this.ejex = ejex;
        } else {
            throw new ParametroNegativoExepcion("Los ejes no pueden ser negativo.");
        }
    }

    @Override
    public double calcularPerimetro() {
        return 4 * this.lado;
    }

    @Override
    public double calcularSuperficie() {
        return this.lado * this.lado;
    }
    @Override
    public String toString() {
        return "Cuadrado: {" +
                "lado:" + this.lado +
                ", perimetro:" + calcularPerimetro() +
                ", superficie:" + calcularSuperficie() +
                "}";
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) throws ParametroNegativoExepcion {
        if (lado >= 0) {
            this.lado = lado;
        } else {
            throw new ParametroNegativoExepcion("Los lados no pueden ser negativo.");
        }
    }

    public double getEjex() {
        return ejex;
    }

    public void setEjex(double ejex) throws ParametroNegativoExepcion {
        if (ejex >= 0) {
            this.ejex = ejex;
        } else {
            throw new ParametroNegativoExepcion("El eje x no puede ser negativo.");
        }
    }

    public double getEjey() {
        return ejey;
    }

    public void setEjey(double ejey) throws ParametroNegativoExepcion {
        if (ejey >= 0) {
            this.ejey = ejey;
        } else {
            throw new ParametroNegativoExepcion("El eje y no puede ser negativo.");
        }
    }
}
