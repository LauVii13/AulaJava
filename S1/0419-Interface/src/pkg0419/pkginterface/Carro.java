package pkg0419.pkginterface;

public class Carro implements Automovel,VeiculoTerrestre{
    @Override
    public void acelerar(){
        System.out.println("Velocidade do carro: 100Km/h");
    }
    
    @Override
    public void frear(){
        System.out.println("Freiando Carro");
    }
    
    @Override
    public void ligar(){
        System.out.println("ligou :)");
    }
}
