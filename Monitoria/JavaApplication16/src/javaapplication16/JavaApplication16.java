/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class JavaApplication16 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
       ArrayList <Cliente> lista = new ArrayList(); 
       ArrayList <Funcionario> listaFuncionario = new ArrayList();
       
       Cliente c1 = new Cliente();
       
       c1.setNome("Adriano");
       c1.setCpf("123123213");
       c1.setRg("12335323");
       c1.setIdade(10);
       
       Cliente c2 = new Cliente();
       
       c2.setNome("B");
       c2.setCpf("123123213");
       c2.setRg("12335323");
       c2.setIdade(10);
       
       Cliente c3 = new Cliente();
       
       c3.setNome("C");
       c3.setCpf("123123213");
       c3.setRg("12335323");
       c3.setIdade(19);
       
       lista.add(c1);
       lista.add(c2);
       lista.add(c3);
       
        System.out.println("Digite o nome do usuário para ser excluído: ");
        teclado.nextLine();
        
       for(Cliente a : lista )
       {
           System.out.println("Nome: " + a.getNome());
           if(teclado.equals(a.getNome()))
           {
               lista.remove(a);
           }          
       }
       
       
    }
    
}
