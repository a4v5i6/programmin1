/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.observerdesign.observerdesign;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mohit Computers
 */
public class ScoreBoard implements Board{

    private List<Observer> observers;
    private String message;
    private boolean changed;
    
    public ScoreBoard()
    {
        this.observers = new ArrayList<Observer>();
    }
    
    @Override
    public void Register(Observer obj) {
        if(obj==null)
        {
            throw new NullPointerException("No User Register");
        }
        if(!observers.contains(obj))
        {
            observers.add(obj);
        }
    }

    @Override
    public void unRegister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void NotifyObserver()
    {
        if(!changed)
            return;
        else
        {
            this.changed=false;
            for(Observer observer: this.observers)
                observer.update();
        }
    }

    @Override
    public Object getUpdate(Observer obj) {
        return this.message;
    }
    
    public void postMessage(String msg)
    {
        System.out.println("Message posted "+msg);
        this.message=msg;
        this.changed=true;
        NotifyObserver();
    }
}
