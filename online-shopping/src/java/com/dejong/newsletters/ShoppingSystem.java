package com.dejong.newsletters;

import java.util.ArrayList;

/** ShoppingSystem notifies members that subscribes to newsletters */
public class ShoppingSystem implements ISubject {

    private ArrayList<IObserver> observers;
    private String news;

    public ShoppingSystem() {
        observers = new ArrayList<IObserver>();
    }

    public void setObservers(ArrayList<IObserver> observers) {
        this.observers = observers;
    }

    public ArrayList<IObserver> getObservers() {
        return observers;
    }

    private void newsletters() {
        notifyObservers();
    }

    public void setNews(String news) {
        this.news = news;
        newsletters();
    }

    public String getNews() {
        return news;
    }

    public void registerObserver(IObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        System.out.println("Notify all members that subscribe to business newsletters");
        for(IObserver observer : observers) {
            observer.update(this.news);
        }
    }
}
