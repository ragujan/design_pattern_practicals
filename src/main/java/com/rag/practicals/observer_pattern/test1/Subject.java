package com.rag.practicals.observer_pattern.test1;

import java.util.LinkedList;
import java.util.List;

public interface Subject {
    //register and unregister an Observer
    public void register(Observer observer);
    public void unregister(Observer observer);

//    method to notify the observers of change
    public void notifyObservers();
//    method to get updates from subject
    public Object getUpdate(Observer observerj);
}
interface Observer{
//    method to update the observer, used by subject
    public void update();

//    attach with subject to observe
    public void setSubject(Subject subject);
}

 class MyTopic implements Subject{

    List<Observer> observerList;
    private String message;
    private boolean changed;
    private final Object MUTEX = new Object();

    public MyTopic(){
        this.observerList = new LinkedList<>();
    }
     @Override
     public void register(Observer observer) {
         synchronized (MUTEX){
             if(!observerList.contains(observer)){
                 observerList.add(observer);
             }
         }
     }

     @Override
     public void unregister(Observer observer) {
         synchronized (MUTEX){
             if(observerList.contains(observer)){
                 observerList.remove(observer);
             }
         }
     }

     @Override
     public void notifyObservers() {
              List<Observer> observersLocal = null;

//              synchronization is used to make sure any observer
//         registered after message is received is not notified
         synchronized (MUTEX){
             if(!changed){
                 return;
             }else{
                 observersLocal = new LinkedList<>(this.observerList);
                 this.changed = false;
             }
         }

         for (Observer obj:observersLocal){
             obj.update();
         }



     }

     @Override
     public Object getUpdate(Observer observerj) {
         return this.message;
     }
//     method to post message to the topic
     public void postMessage(String message){
         System.out.println("Message posted to topic :"+message);
         this.message = message;
         this.changed = true;
         notifyObservers();

     }
 }
 class MyTopicSubscriber implements Observer{
    private String name;
    private Subject topic;

     public MyTopicSubscriber(String name) {
         this.name = name;
     }

     @Override
     public void update() {
         String msg = (String) topic.getUpdate(this);

         if(msg == null){
             System.out.println("No new message ");
         }else{
             System.out.println(name+" consuming message "+msg);
         }
     }

     @Override
     public void setSubject(Subject subject) {
           this.topic = subject;
     }
 }
 class Test{
     public static void main(String[] args) {
         MyTopic topic = new MyTopic();

//         create observers
         Observer observer1 = new MyTopicSubscriber("Ob1");
         Observer observer2 = new MyTopicSubscriber("Ob2");
         Observer observer3 = new MyTopicSubscriber("Ob3");

//         register observers to the subject

         topic.register(observer1);
         topic.register(observer2);
         topic.register(observer3);

//         attach observer to subject

         observer1.setSubject(topic);
         observer2.setSubject(topic);
         observer3.setSubject(topic);

         topic.postMessage("Hey from topic ");
     }
 }

