package Intro_To_Design_Patterns.TestClasses;

import Intro_To_Design_Patterns.Ducks.Duck;
import Intro_To_Design_Patterns.Ducks.MallardDuck;
import Intro_To_Design_Patterns.Ducks.ModelDuck;
import Intro_To_Design_Patterns.FlyImpl.FlyRocketPowered;

/**
 * Created by Jordan on 5/26/2016.
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();

        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
