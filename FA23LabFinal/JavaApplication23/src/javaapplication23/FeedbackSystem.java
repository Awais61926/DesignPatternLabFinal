/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication23;

/**
 *
 * @author Lenovo
 */
import java.util.ArrayList;
import java.util.List;

public class FeedbackSystem {
    private static FeedbackSystem instance;
    private List<Observer> observers;
    private List<FeedbackProvider> feedbackProviders;
    private FeedbackStrategy feedbackStrategy;

    private FeedbackSystem() {
        observers = new ArrayList<>();
        feedbackProviders = new ArrayList<>();
    }

    public static FeedbackSystem getInstance() {
        if (instance == null) {
            instance = new FeedbackSystem();
        }
        return instance;
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void setFeedbackStrategy(FeedbackStrategy strategy) {
        this.feedbackStrategy = strategy;
    }

    public void addFeedbackProvider(FeedbackProvider provider) {
        feedbackProviders.add(provider);
    }

    public void collectFeedback() {
        System.out.println("Collecting feedback using strategy: ");
        feedbackStrategy.collectFeedback();
    }
}
