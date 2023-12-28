/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication23;

/**
 *
 * @author Lenovo
 */
public class StudentObserver implements Observer {
    @Override
    public void update() {
        System.out.println("Student received feedback update.");
    }
}

