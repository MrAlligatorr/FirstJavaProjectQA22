package animalRescue.Animals.Dogs;

import animalRescue.Animals.Animals;

public class Dogs extends Animals {
    private int agresivityLevel1To10;
    public void barks(){
        System.out.println("Ham Ham");
    }

    public int getAgresivityLevel1To10() {
        return agresivityLevel1To10;
    }

    public void setAgresivityLevel1To10(int agresivityLevel1To10) {
        this.agresivityLevel1To10 = agresivityLevel1To10;
    }


}
