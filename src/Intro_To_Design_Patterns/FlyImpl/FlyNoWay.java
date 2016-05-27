package Intro_To_Design_Patterns.FlyImpl;

import Intro_To_Design_Patterns.Interfaces.FlyBehavior;

/**
 * Created by jordan on 5/18/16.
 */

/**
 * Flying behavior implementation for ducks that do
 * NOT fly (like rubber ducks and decoy ducks).
 */
public class FlyNoWay implements FlyBehavior {


    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
