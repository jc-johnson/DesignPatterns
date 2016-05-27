package Intro_To_Design_Patterns.Ducks;

import Intro_To_Design_Patterns.Interfaces.FlyBehavior;
import Intro_To_Design_Patterns.Interfaces.QuackBehavior;

/**
 * Created by jordan on 5/18/16.
 */
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {

    }

    // subclass can each choose how to display itself
    public abstract void display();

    // delegate to the behavior class
    // calling the interface method
    public void performFly() {flyBehavior.fly();}

    // all that matters is that the instantiated duck knows how to quack
    // delegate to the behavior class
    // calling the interface method
    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }
}
