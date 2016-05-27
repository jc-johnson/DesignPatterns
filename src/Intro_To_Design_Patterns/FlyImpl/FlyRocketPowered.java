package Intro_To_Design_Patterns.FlyImpl;

import Intro_To_Design_Patterns.Interfaces.FlyBehavior;

/**
 * Created by Jordan on 5/26/2016.
 */
public class FlyRocketPowered implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
