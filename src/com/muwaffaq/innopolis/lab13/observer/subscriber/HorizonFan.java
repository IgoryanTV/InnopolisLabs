package com.muwaffaq.innopolis.lab13.observer.subscriber;


import com.muwaffaq.innopolis.lab13.observer.Game;
import com.muwaffaq.innopolis.lab13.observer.Observer;

public class HorizonFan implements Observer<Game> {
    @Override
    public void update(Game data) {
        if (data.title.toLowerCase().contains("horizon")) {
            System.out.println("I'm Horizon fan");
            System.out.println("Yes,lets Go Aloy!! ... ");
            System.out.println("------------");
        }
    }
}
