package UtilForma;

import java.util.Scanner;
import java.util.ArrayList;

import entidades.Circulo;
import entidades.Forma;
import entidades.Quadrado;

public final class Util_F {

    private Util_F() { 
    }

    public static void imprimir(ArrayList<Forma> formas){

        System.out.println("Areas das Formas Geométricas: ");

        for (Forma forma : formas) {
            if (forma instanceof Circulo){ 
                System.out.println("Area do circulo: " + forma.getArea());
            }
            else if (forma instanceof Quadrado){
                System.out.println("Area do quadrado: " + forma.getArea());
            }
        }
    }

    public static void imprimir(Circulo circulo) { 
        System.out.println("Circulo");
        System.out.println("Area: " +circulo.getArea());
    }

    public static Double lerCirculo(){
            
        Double raio;
        Scanner escrever = new Scanner(System.in);

        System.out.println("Entre com o raio do circulo: ");
        raio = escrever.nextDouble();

        return raio;

    }

    public static Double lerQuadrado(){
            
        Double lado;
        Scanner escrever = new Scanner(System.in);
    
        System.out.println("Entre com o lado do quadrado : ");
        lado = escrever.nextDouble();

        return lado;

    }
}
