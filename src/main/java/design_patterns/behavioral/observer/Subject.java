package design_patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.Iterator;

abstract class Subject {
    ArrayList<Observer> observers = new ArrayList<Observer>();

    public void notifyObservers() {
        Iterator<Observer> iteratorObservers = observers.iterator();

        while (iteratorObservers.hasNext()) {
            iteratorObservers.next().update();
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
