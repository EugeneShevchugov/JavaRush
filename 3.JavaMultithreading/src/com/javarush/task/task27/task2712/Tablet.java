package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.ad.AdvertisementManager;
import com.javarush.task.task27.task2712.ad.NoVideoAvailableException;
import com.javarush.task.task27.task2712.kitchen.Order;
import javafx.beans.InvalidationListener;

import java.io.IOException;
import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tablet extends Observable {
    final int number;

    private static Logger logger = Logger.getLogger(Tablet.class.getName());;

    public Tablet(int number) {
        this.number = number;
    }

    public Order createOrder(){
        Order order = null;
        try {
            order = new Order(this);

        } catch (IOException e) {
            logger.log(Level.SEVERE,"Console is unavailable.");


        }
        finally {
            if (!order.isEmpty()){
                setChanged();
                notifyObservers(order);
                AdvertisementManager manager = new AdvertisementManager(order.getTotalCookingTime()*60);
                try {
                    manager.processVideos();
                }
                catch (NoVideoAvailableException e){
                    logger.log(Level.INFO, "No video is available for the order " + order.toString());
                }
            }
            return order;
        }
    }


    @Override
    public String toString() {
        return "Tablet{" +
                "number=" + number +
                '}';
    }

}
