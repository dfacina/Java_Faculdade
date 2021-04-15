package entidades;

public class Circulo extends Forma{

    private Double raio;

    public Circulo(Double raio){
        super();
        this.raio = raio;
    }

    @Override
    public Double getArea(){

        return Math.PI * raio * raio;
    }

    
}
