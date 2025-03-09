package com.OOPs.Interfaces;

// "implements" keyword is used to implement the capa   bilities of interfaces
public class Car implements Engine, MediaPlayer, Brake {
    int a = 30;


    @Override
    public void start() {
        System.out.println("I start engine like a normal car.");
    }

    @Override
    public void acc() {
        System.out.println("I accelerate engine like a normal car.");
    }

    @Override
    public void stop() {
        System.out.println("I stop engine like a normal car.");

    }

    @Override
    public void brake() {
        System.out.println("I brake like normal car.");
    }


}
