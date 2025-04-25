/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subjects;

import java.util.ArrayList;
import java.util.List;
import observes.Observer;

/**
 *
 * @author Vitinho
 */
public class Newsletter  implements Subject {
    
    
    private List<Observer> observers;
    private List<String> emails;

    public Newsletter(){
        this.observers = new ArrayList<>();
        this.emails = new ArrayList<>();
    }
    
    @Override
    public void registerObserver(Observer observer){
        this.observers.add(observer);
    }
    
    @Override
    public void removeObserver(Observer observer){
        if(!observers.isEmpty())
            observers.removeIf(x -> x.equals(observer));
    }
 
    @Override
    public void notifyObserver(){
        for(Observer observer : observers){
            if(!emails.isEmpty())
                observer.update(emails.get(emails.size()-1));
        }
    }
 
    @Override
    public void addMessage(String message){
        this.emails.add(message);
        this.notifyObserver();
    }
    
}
