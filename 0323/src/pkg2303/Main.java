package pkg2303;

public class Main {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Tania", 20);
        Aluno a1 = new Aluno("Pedro", 16, "200147");
        Professor prof1 = new Professor("Dorival",  169, 10000);
        Monitor m1 = new Monitor("Jesus", 33, "200153", 200);
        
        System.out.println(p1.getNome() + " - " + p1.getIdade());

        System.out.println(a1.getNome() + " - " + a1.getIdade() + " - " + a1.getRa());
        
        System.out.println(prof1.getNome() + " - " + prof1.getIdade() + " - " + prof1.getSalario());
        
        System.out.println(m1.getNome() + " - " + m1.getIdade() + " - " + m1.getRa() + " - " + m1.getBolsa());
    }
    
}
