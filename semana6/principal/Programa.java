package principal;
import java.util.Scanner;
import entidades.Circulo;

public class Programa {
    public static void main(String[] args){
        //Forma forma = new Forma();

        System.out.println("entre com valor do raio");

        Double raio;
        Scanner in = new Scanner(System.in);
        raio = in.nextDouble();

        Circulo circulo = new Circulo(raio);

        System.out.println("Area = "+ circulo.getArea());

    }
}
