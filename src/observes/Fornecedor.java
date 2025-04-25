/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observes;

import java.util.Objects;
import subjects.Email;

/**
 *
 * @author Vitinho
 */
public class Fornecedor implements Observer {
    
    private String nome;
    private String email;

    public Fornecedor(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.nome);
        hash = 59 * hash + Objects.hashCode(this.email);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Fornecedor other = (Fornecedor) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return Objects.equals(this.email, other.email);
    }
    
    @Override
    public void update(String mensagem){
       Email.enviarEmail(this,mensagem);
    }
    
    @Override
    public String getNome(){
        return this.nome;
    }

    public String getEmail() {
        return email;
    }
    
    
}

