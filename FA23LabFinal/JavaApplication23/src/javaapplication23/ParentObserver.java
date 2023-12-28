package javaapplication23;


import javaapplication23.Observer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class ParentObserver implements Observer {
    @Override
    public void update() {
        System.out.println("Parent received feedback update.");
    }
}
