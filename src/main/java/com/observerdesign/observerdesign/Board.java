/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.observerdesign.observerdesign;

/**
 *
 * @author Mohit Computers
 */
public interface Board {
    void Register(Observer obj);
    void unRegister(Observer observer);
    void NotifyObserver();
    
    Object getUpdate(Observer obj);
}
