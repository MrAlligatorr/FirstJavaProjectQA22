package animalRescue.Animals.Cats.Species;

import animalRescue.Animals.Cats.Cats;

public class MainCoon extends Cats {
    @Override
    public void purr() {
        System.out.println("Pur pur pur pur pur...");
    }

    @Override
    public void sleep() {
        System.out.println("ZZZZZZZZZZZZzzzzzzzzz...");
    }

    @Override
    public void plays() {
        System.out.println("Hates to play games");
    }
}
