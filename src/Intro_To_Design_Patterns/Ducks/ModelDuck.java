package Intro_To_Design_Patterns.Ducks;

import Intro_To_Design_Patterns.FlyImpl.FlyNoWay;
import Intro_To_Design_Patterns.QuackImpl.Quack;

/**
 * Created by Jordan on 5/26/2016.
 */
public class ModelDuck extends Duck {

    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
