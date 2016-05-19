package Intro_To_Design_Patterns.Ducks;

import Intro_To_Design_Patterns.Ducks.Duck;

/**
 * Created by jordan on 5/18/16.
 */
public class RedheadDuck extends Duck {

    @Override
    void Duck() {

    }

    @Override
    void quack() {
        // overridden to squeak since it's a rubber duck
    }

    @Override
    void swim() {

    }

    @Override
    public void display(){
        // looks like a red head
    }

    @Override
    void fly() {
        // override to do nothing since it's a rubber duck
    }
}
