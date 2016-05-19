package Intro_To_Design_Patterns.ProgramToInterfaceExample;

/**
 * Created by jordan on 5/18/16.
 */
public class Cat implements Animal {

    @Override
    public void makeSound() {
        meow();
    }

    public void meow() { /*meow sound*/}

}
