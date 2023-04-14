package Clases;

import Excepciones.ParametroNegativoExepcion;

public class Triangulo implements FiguraGeometrica {

    private double lado1;
    private double lado2;
    private double lado3;
    private double ejex;
    private double ejey;

    public Triangulo(double lado1, double lado2, double lado3) throws ParametroNegativoExepcion {
        if (lado1 >= 0 && lado2 >= 0 && lado3 >= 0 ) {
            this.lado1 = lado1;
            this.lado2 = lado2;
            this.lado3 = lado3;
        } else {
            throw new ParametroNegativoExepcion("Ningun lado no puede ser negativo.");
        }


    }

    public Triangulo(double lado1, double lado2, double lado3, double ejex, double ejey) throws ParametroNegativoExepcion {
        this.ejex = ejex;
        this.ejey = ejey;

        if (lado1 >= 0 && lado2 >= 0 && lado3 >= 0 ) {
            this.lado1 = lado1;
            this.lado2 = lado2;
            this.lado3 = lado3;
        } else {
            throw new ParametroNegativoExepcion("Ningun lado puede ser negativo.");
        }
        if (ejex >= 0 && ejey >= 0) {
            this.ejex = ejex;
            this.ejey = ejey;
        } else {
            throw new ParametroNegativoExepcion("Ningun valor de los ejes puede ser negativo.");
        }
    }

    @Override
    public double calcularPerimetro() {
        return this.lado1 + this.lado2 + this.lado3;
    }

    @Override
    public double calcularSuperficie() {
        return (this.lado1 * this.lado2)/ 2;
    }

    @Override
    public String toString() {
        return "Triangulo: {" +
                "lado1:" + this.lado1 +
                "lado2:" + this.lado2 +
                "lado3:" + this.lado3 +
                ", perimetro:" + calcularPerimetro() +
                ", superficie:" + calcularSuperficie() +
                "}";
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) throws ParametroNegativoExepcion {
        if (lado1 >= 0) {
            this.lado1 = lado1;
        } else {
            throw new ParametroNegativoExepcion("El lado1 no puede ser negativo.");
        }
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) throws ParametroNegativoExepcion {
        if (lado2 >= 0) {
            this.lado2 = lado2;
        } else {
            throw new ParametroNegativoExepcion("El lado2 no puede ser negativo.");
        }
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) throws ParametroNegativoExepcion {
        if (lado3 >= 0) {
            this.lado3 = lado3;
        } else {
            throw new ParametroNegativoExepcion("El lado3 no puede ser negativo.");
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
