package design_patterns.behavioral.observer;

import java.util.ArrayList;

abstract class Subject {

  protected ArrayList<Observer> observers = new ArrayList<Observer>();

  public void notifyObservers() {
    for (Observer observer : observers) {
      observer.update();
    }
  }

  public void registerObserver(Observer observer) {
    observers.add(observer);
  }

  public void unregisterObserver(Observer observer) {
    observers.remove(observer);
  }

  public abstract String getState();

  public abstract void setState(String s);
}