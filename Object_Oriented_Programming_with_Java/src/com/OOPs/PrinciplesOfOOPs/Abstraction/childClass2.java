package com.OOPs.PrinciplesOfOOPs.Abstraction;

public class childClass2 extends superClass {
    public childClass2(int age) {
        super(age);
    }

    @Override
    void normalFn() {
        super.normalFn();
    }

    @Override
    void career() {
        System.out.println("Want to become an Hero");
    }

    @Override
    void favoriteHero() {
        System.out.println("Favorite hero is BatMan");
    }
}
