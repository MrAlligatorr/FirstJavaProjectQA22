package animalRescue.Animals.Cats;

import animalRescue.Animals.Animals;

public class Cats extends Animals {
    private boolean hasFur;
    public void purr() {
        System.out.println("PuRrRrRr");
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }
}
