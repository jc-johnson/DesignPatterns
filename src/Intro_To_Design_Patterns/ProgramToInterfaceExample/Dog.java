package Intro_To_Design_Patterns.ProgramToInterfaceExample;

/**
 * Created by jordan on 5/18/16.
 */
public class Dog implements Animal {
    @Override
    public void makeSound() {
        bark();
    }

    public void bark(){
        //bark sound
    }

    public static void main(String[] args) {

        // Programming to an implementation
        // using Dog - concrete implementation of Animal
        // forces you to code a concrete implementation
        Dog dog  = new Dog();
        dog.bark();

        // Programming to an interface/supertype
        // Using polymorphism to reference Animal
        Animal animal = new Dog();
        animal.makeSound();

        // Even better - assigning concrete implementation
        // at run time
        // We don't know what animal subtype a is
        // all that matters is that it can respond to
        // makeSound().

        // a = getAnimal();
        // a.makeSound();
    }
}
