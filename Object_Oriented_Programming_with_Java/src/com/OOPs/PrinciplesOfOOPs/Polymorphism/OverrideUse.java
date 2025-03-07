package com.OOPs.PrinciplesOfOOPs.Polymorphism;

public class OverrideUse {
    int num;

    public OverrideUse(int num){
        this.num = num;
    }

    @Override
    public String toString(){
        return "OverrideUse{" +
                "num=" + num +
                '}';
    }

    public static void main(String[]args){
        OverrideUse obj = new OverrideUse(2);
        System.out.println(obj); // OverrideUse{num=2}
    }
}
