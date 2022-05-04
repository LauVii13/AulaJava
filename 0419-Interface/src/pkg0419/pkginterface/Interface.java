package pkg0419.pkginterface;

public class Interface {

    public static void main(String[] args) {
        
        Automovel a1 = new Carro();
        Automovel a2 = new Caminhao();
        VeiculoTerrestre v1 = (VeiculoTerrestre) a1;
        
        a1.acelerar();
     
        v1.frear();
        v1.ligar();
    }
    
}
