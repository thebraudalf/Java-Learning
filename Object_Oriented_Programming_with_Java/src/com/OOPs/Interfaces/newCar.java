package com.OOPs.Interfaces;

public class newCar {
    private Engine engine;
    private MediaPlayer player = new Player();

    public newCar(){
        engine = new PowerEngine();
    }

    public newCar(Engine engine){
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }

    public void acc(){
        engine.acc();
    }

    public void stop(){
        engine.stop();
    }

    public void startMusic(){
        player.start();
    }

    public void stopMusic(){
        player.stop();
    }

    public void upgradeEngine(){
        this.engine = new ElectricEngine();
    }

}
