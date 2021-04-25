package animalRescue.FunActivities.Outside;

import animalRescue.FunActivities.FunActivities;

public class OutsideActivities extends FunActivities {
    public void fetch() {
        System.out.println("*brings back item*");
    }

    @Override
    public void weather() {
        System.out.println("Sunny");
    }
}
