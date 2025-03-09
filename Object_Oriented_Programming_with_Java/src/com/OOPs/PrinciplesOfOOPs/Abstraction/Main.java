package com.OOPs.PrinciplesOfOOPs.Abstraction;

public class Main {
    public static void main(String[] args) {
    // We cannot instantiate the abstract classes
    /*superClass Parent = new superClass() {
        @Override
        void career() {

        }

        @Override
        void favoriteHero() {

        }
    }*/

    childClass1 child1 = new childClass1(12);
    child1.career(); // Want to become an Doctor
    child1.favoriteHero(); // favorite hero is Super Man
    child1.normalFn(); // This is normal function.

    superClass child2 = new childClass2(13);
    child2.career(); // Want to become an Hero
    child2.favoriteHero(); // Favorite hero is BatMan
    child1.normalFn(); // This is normal function.

    }
}
