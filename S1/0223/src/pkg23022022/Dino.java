package pkg23022022;


public class Dino {
    private String nome, especie, cor;
    private float largura, altura;
    private int idade;
    private boolean extinto = false;
    
    void cabum()
    {
        this.extinto = true;
    }
    
    void CadastroDino(String n, String e, String c, float larg, float alt, int id, boolean cabum)
    {
        this.nome = n;
        this.especie = e;
        this.cor = c;
        this.largura = larg;
        this.altura = alt;
        this.idade = id;
        
        if (cabum == true)
        {
            cabum();
        }
        
    }
}


