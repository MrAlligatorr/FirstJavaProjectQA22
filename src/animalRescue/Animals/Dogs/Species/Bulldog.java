package animalRescue.Animals.Dogs.Species;

import animalRescue.Animals.Dogs.Dogs;

public class Bulldog extends Dogs {
    @Override
    public void barks() {
        System.out.println("Haaaaam Haaaaam");
    }

    @Override
    public void sleep() {
        System.out.println("ZZZZZZZZZZZZ....*snores*");
    }

    @Override
    public void plays() {
        System.out.println("Loves to play");
    }
}
