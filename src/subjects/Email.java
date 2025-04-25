/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subjects;

import observes.Observer;

/**
 *
 * @author Vitinho
 */
public class Email {
    
    
    public static void enviarEmail(Observer observer, String mensagem){
        System.out.println("------------------------------------------"); 
        System.out.println("Email enviado para " + observer.getNome() + " - " + observer.getEmail());
        System.out.println("Mensagem : " + mensagem);
    }
    
    
}
