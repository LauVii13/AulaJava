package pkg23022022;
import java.util.Scanner;


public class Main {
    
    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
        
    public static void main(String[] args) {
        
        Scanner t = new Scanner(System.in);
        
        int i = 1;
        int e = 0;
        
        String nA, rA, tA;
        int iA;
        boolean esA;
        
        String nD, codD, curD;
        
        String nDi, eDi, cDi;
        float largDi, altDi;
        int idDi;
        boolean cabumDi;
       
        
        System.out.println("---------------------------");
        System.out.println("O que vc deseja instanciar?");
        System.out.println("1.ALUNO");
        System.out.println("2.DISCIPLINA");
        System.out.println("3.DINOSSAURO");
        System.out.println("---------------------------");
        
        do
        {
            e = t.nextInt();
                        
            if (e == 1)
            {              
                Aluno aluno1 = new Aluno();
                System.out.println("\n\n-------");
                System.out.println("Digite!");
                
                nA = t.nextLine();
                aluno1.setNome(nA);
                
                rA = t.nextLine();
                aluno1.setRa(rA);
                
                tA = t.nextLine();
                aluno1.setTurma(tA);
                
                iA = t.nextInt();
                aluno1.setIdade(iA);
                
                esA = t.nextBoolean();
                aluno1.setEstado(esA);
                
                System.out.println("A "+ esA);
            }
            if (e == 2)
            {
                Disciplina dis1 = new Disciplina();
                System.out.println("\n\n-------");
                System.out.println("Digite!");
                nD = t.nextLine();
                codD = t.nextLine();
                curD = t.nextLine();
                
                dis1.CadastroD(nD, codD, curD);
            }
            if (e == 3)
            {
                Dino dino1 = new Dino();
                System.out.println("\n\n-------");
                System.out.println("Digite!");
                nDi = t.nextLine();
                eDi = t.nextLine();
                cDi = t.nextLine();
                largDi = t.nextFloat();
                altDi = t.nextFloat();
                idDi = t.nextInt();
                cabumDi = t.nextBoolean();
                
                dino1.CadastroDino(nDi, eDi, cDi, largDi, altDi, idDi, cabumDi);
            }
            else
            {
                if (e != 0)
                {
                    System.out.println("AAAAAAAAAAAAAAAAAAA ESSE NUMAEO NN OIUDE");
                }
            }
            
            i++;            
        }while(e == 0);
        
    }
    
}
