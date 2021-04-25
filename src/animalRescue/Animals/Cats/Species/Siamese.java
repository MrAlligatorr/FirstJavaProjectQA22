package animalRescue.Animals.Cats.Species;

import animalRescue.Animals.Cats.Cats;

public class Siamese extends Cats {
    @Override
    public void sleep() {
        System.out.println("ZzZzZzZzZzZ");
    }

    @Override
    public void plays() {
        System.out.println("*Playing*");
    }

    @Override
    public void purr() {
        System.out.println("PuRrRrRr");
    }
}
