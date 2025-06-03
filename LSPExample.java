package Solid_Design_Principles;

public class LSPExample {
    public static void main(String[] args) {
        Bird myBird = new Parrot();
        makeItSing(myBird);
    }

    public static void makeItSing(Bird bird) {
        bird.makeSound();  // Works for both Solid_Design_Principles.Bird and Solid_Design_Principles.Parrot
    }
}

class Bird {
    public void makeSound() {
        System.out.println("Chirp!");
    }
}

class Parrot extends Bird {
    @Override
    public void makeSound() {
        System.out.println("Squawk!");
    }
}