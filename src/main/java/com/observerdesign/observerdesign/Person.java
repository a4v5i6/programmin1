/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.observerdesign.observerdesign;

import java.util.ArrayList;

/**
 *
 * @author Mohit Computers
 */
public class Person implements Observer{
   
    private String name;
    private Board board;
    
public Person(String name)
{
    this.name=name;
}
    @Override
    public void update() {
        String msg = (String) board.getUpdate(this);
        if(msg==null)
        {
            System.out.println(name+ " :No new message");
        }
        else{
            System.out.println(name +" :Consuming message-> " + msg);
        }
    }

    @Override
    public void subscribe(Board board) {
        this.board=board;
    }
}
