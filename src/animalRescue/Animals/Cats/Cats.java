package animalRescue.Animals.Cats;

import animalRescue.Animals.Animals;

public abstract class Cats extends Animals {
    private boolean hasFur;

    public abstract void purr();

    public boolean isHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }
}
