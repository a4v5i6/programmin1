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
public class Main {
    
    public static void main(String[] args)
    {
        ScoreBoard ab = new ScoreBoard();
        Observer observer1 = new Person("observer1");
        Observer observer2 = new Person("observer2");
        Observer observer3 = new Person("observer3");
        
        ab.Register(observer1);
        ab.Register(observer2);
        ab.Register(observer3);
        
        observer1.subscribe(ab);
        observer2.subscribe(ab);
        observer3.subscribe(ab);
        
        observer1.update();
        
        ab.postMessage("IPL run : 145/4");
        
        ab.unRegister(observer3);
        ab.postMessage("IPL run : 160/7");
        
    }
}
