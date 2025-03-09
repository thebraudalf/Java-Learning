package com.OOPs.PrinciplesOfOOPs.Abstraction;
// Overriding abstract methods with concrete classes
public class childClass1 extends superClass {
    public childClass1(int age) {
        super(age);
    }

    @Override
    void normalFn() {
        super.normalFn();
    }

    @Override
    void career() {
        System.out.println("Want to become an Doctor");
    }

    @Override
    void favoriteHero() {
        System.out.println("favorite hero is Super Man");
    }
}
