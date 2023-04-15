package Clases;

import Excepciones.ParametroNegativoExepcion;

public class Circulo implements FiguraGeometrica {
    private double radio;
    private double ejex;
    private double ejey;

    public Circulo(double radio) throws ParametroNegativoExepcion {
        if (radio >= 0) {
            this.radio = radio;
        } else {
            throw new ParametroNegativoExepcion("El radio no puede ser negativo.");
        }
    }

    public Circulo(double radio, double ejex, double ejey) throws ParametroNegativoExepcion {
        if (radio >= 0) {
            this.radio = radio;
        } else {
            throw new ParametroNegativoExepcion("El radio no puede ser negativo.");
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
        return 2 * 3.14 * this.radio;
    }

    @Override
    public double calcularSuperficie() {
        return 3.14 * this.radio *  this.radio;
    }

    @Override
    public String toString() {
        return "Circulo: {" +
                "lado:" + this.radio +
                ", perimetro:" + calcularPerimetro() +
                ", superficie:" + calcularSuperficie() +
                "}";
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) throws ParametroNegativoExepcion {
        if (radio >= 0) {
            this.radio = radio;
        } else {
            throw new ParametroNegativoExepcion("El radio no puede ser negativo.");
        }
    }

    public double getEjex() {
        return ejex;
    }

    public void setEjex(double ejex) throws ParametroNegativoExepcion {
        if (ejex >= 0) {
            this.ejex = ejex;
        } else {
            throw new ParametroNegativoExepcion("El valor del eje x no puede ser negativo.");
        }
    }

    public double getEjey() {
        return ejey;
    }

    public void setEjey(double ejey) throws ParametroNegativoExepcion {
        if (ejey >= 0) {
            this.ejey = ejex;
        } else {
            throw new ParametroNegativoExepcion("El valor del eje y no puede ser negativo.");
        }
    }
}
