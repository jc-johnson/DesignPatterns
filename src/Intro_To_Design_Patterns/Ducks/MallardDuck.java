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

    // The MallardDuck's quack behavior and fly behavior
    // depends on how the inherited instance variables
    // from Duck are polymorphized
    public MallardDuck() {
        // Inherits instance variables from Duck
        // these can easily be changed at runtime
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    void Duck() {

    }


    void Performquack() {

    }

    @Override
    void swim() {

    }

    public void display(){
        // looks like a Mallard
        System.out.println("I'm a real Mallard duck");
    }

    @Override
    void PerformFly() {

    }

    
}
