package com.cice.principal;

import com.cice.figuras.Circulo;

import java.util.Scanner;

public class Cliente{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double radio;
        double perimetro;
        double area;

        System.out.println("***********CIRCULO**********");
        System.out.println("****************************");
        System.out.println("");
        System.out.print("Introduce el radio del circulo: ");
        radio = sc.nextDouble();

        Circulo circulo = new Circulo(radio);

        area = circulo.calcularArea();
        perimetro = circulo.calcularPerimetro();

        System.out.println("El area es: " + area);
        System.out.println("El perimétro es: " + perimetro);


    }
}
