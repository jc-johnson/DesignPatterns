package Intro_To_Design_Patterns.Ducks;

import Intro_To_Design_Patterns.Ducks.Duck;
import Intro_To_Design_Patterns.FlyImpl.FlyWithWings;
import Intro_To_Design_Patterns.Interfaces.FlyBehavior;
import Intro_To_Design_Patterns.Interfaces.QuackBehavior;
import Intro_To_Design_Patterns.QuackImpl.Quack;

/**
 * Created by jordan on 5/18/16.
 */
public class MallardDuck  extends Duck {

    // A MallardDuck uses the Quack class to
    // handle its quack so when performQuack
    // is called, the responsibility for the
    // quack is delegated to the Quack object
    // and we get a real quack
    public MallardDuck() {
        // Inherits instance variables from Duck
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    void Duck() {

    }

    @Override
    void quack() {

    }

    @Override
    void swim() {

    }

    public void display(){
        // looks like a Mallard
    }

    @Override
    void PerformFly() {

    }

    
}
