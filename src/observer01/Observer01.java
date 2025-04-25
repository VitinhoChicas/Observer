/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package observer01;

import observes.Cliente;
import observes.Fornecedor;
import observes.Funcionario;
import observes.Parceiro;
import subjects.Newsletter;

/**
 *
 * @author Vitinho
 */
public class Observer01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //ciração Newsletter
        Newsletter newsletter = new Newsletter();
        
        //criação funcionario
        Funcionario funcionario1 = new Funcionario("Funcionario 01", "funcionario01@teste.com");
        newsletter.registerObserver(funcionario1);
        Funcionario funcionario2 = new Funcionario("Funcionario 02", "funcionario02@teste.com");
        newsletter.registerObserver(funcionario2);
        
        //criaçao cliente
        Cliente cliente = new Cliente("Cliente01", "cliente01@teste.com");
        newsletter.registerObserver(cliente);
        
        //criação parceiro
        Parceiro parceiro = new Parceiro("Parceiro01", "parceiro01@teste.com");
        newsletter.registerObserver(parceiro);
        
        //criação fornecedor
        Fornecedor fornecedor = new Fornecedor("Fornecedor01", "fornecedor01@teste.com");
        newsletter.registerObserver(fornecedor);
        
        System.out.println("----------------------------TESTE PRIMEIRA MENSAGEM---------------------");
        newsletter.addMessage("Primeira Mensagem");
        
        newsletter.removeObserver(funcionario2);
        System.out.println("----------------------------TESTE SEGUNDA MENSAGEM---------------------");
        newsletter.addMessage("Segunda Mensagem");
        
        newsletter.registerObserver(funcionario2);
        System.out.println("----------------------------TESTE TERCEIRA MENSAGEM---------------------");
        newsletter.addMessage("Terceira Mensagem");
        
    }
    
}
