  
package principal;

import entidades.Circulo;
import entidades.Forma;
import entidades.Quadrado;
import UtilForma.Util_F;

import java.util.ArrayList;
import java.util.Scanner;

public class Programa {
    
    public static void main(String[] args) {
        
        Double raio, lado;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Entre com o raio : ");
        raio= teclado.nextDouble();

        Circulo circulo = new Circulo(raio);


        //Quadrado

        System.out.println("Entre com o lado do quadrado: ");
        lado = teclado.nextDouble();

        Quadrado quadrado = new Quadrado(lado);

        ArrayList<Forma> formas = new ArrayList<Forma>();

        formas.add(circulo);
        formas.add(quadrado);

        Util_F.imprimir(formas);
        Util_F.imprimir(circulo);

        teclado.close();
    }
}
