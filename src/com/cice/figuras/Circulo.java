package com.cice.figuras;

public class Circulo {

    private double area;
    private double perimetro;
    private double radio;

    public Circulo(double rad){

        radio =  rad;
    }

    public double calcularArea(){
        double resultado = 0;

        resultado = radio * radio * Math.PI;

        return resultado;
    }

    public double calcularPerimetro(){
        double resultado = 0;

        resultado = 2 * radio * Math.PI;

        return resultado;
    }



}
