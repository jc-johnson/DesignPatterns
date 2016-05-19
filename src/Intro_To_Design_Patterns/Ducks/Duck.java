package Intro_To_Design_Patterns.Ducks;

import Intro_To_Design_Patterns.Interfaces.FlyBehavior;
import Intro_To_Design_Patterns.Interfaces.QuackBehavior;

/**
 * Created by jordan on 5/18/16.
 */
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    abstract void Duck();

    // all that matters is that the duck knows how to quack
    public void PerformQuack(){
        quackBehavior.quack();
    }

    abstract void swim();

    abstract void display();

    abstract void PerformFly();
}
