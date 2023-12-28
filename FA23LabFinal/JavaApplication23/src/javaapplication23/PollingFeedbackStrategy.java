/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication23;

/**
 *
 * @author Lenovo
 */
public class PollingFeedbackStrategy implements FeedbackStrategy {
    @Override
    public void collectFeedback() {
        System.out.println("Collecting feedback through polling.");
    }
}
