package com.OOPs.Interfaces;

public class Main {
    public static void main(String []args){
        Engine car = new Car();
        // implementing class instance vars cannot be instantiate
        //System.out.println(car.a);
        car.start(); // I start engine like a normal car.
        car.acc(); // I accelerate engine like a normal car.
        car.stop(); // I stop engine like a normal car.

        // Here implementation of Engine's methods invoking
        //MediaPlayer carPlayer = new Car();
        //carPlayer.start(); // I start engine like a normal car.


        newCar newcar = new newCar();
        newcar.start(); // Power Engine Start
        newcar.startMusic(); // Music start
        newcar.stop(); // Power Engine Stop
        newcar.upgradeEngine();
        newcar.start(); // Electric Engine Start

    }
}
