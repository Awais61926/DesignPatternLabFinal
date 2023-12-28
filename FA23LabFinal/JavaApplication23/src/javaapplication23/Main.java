/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication23;

/**
 *
 * @author Lenovo
 */
public class Main {
    public static void main(String[] args) {
        // creating instances of observers and providers
        Observer teacherObserver = new TeacherObserver();
        Observer parentObserver = new ParentObserver();
        FeedbackProvider teacherFeedbackProvider = new TeacherFeedbackProvider();
        FeedbackProvider parentFeedbackProvider = new ParentFeedbackProvider();

        //  Registering observers here 
        FeedbackSystem feedbackSystem = FeedbackSystem.getInstance();
        feedbackSystem.registerObserver(teacherObserver);
        feedbackSystem.registerObserver(parentObserver);

        //I am Adding feedback providers
        feedbackSystem.addFeedbackProvider(teacherFeedbackProvider);
        feedbackSystem.addFeedbackProvider(parentFeedbackProvider);

        // Setting feedback strategy
        FeedbackStrategy surveyStrategy = new SurveyFeedbackStrategy();
        feedbackSystem.setFeedbackStrategy(surveyStrategy);

        // Collecting feedback
        feedbackSystem.collectFeedback();

        // Notifying observers
        feedbackSystem.notifyObservers();
    }
}
