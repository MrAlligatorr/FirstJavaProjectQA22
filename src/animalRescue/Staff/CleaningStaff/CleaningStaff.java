package animalRescue.Staff.CleaningStaff;

import animalRescue.Staff.Staff;

public class CleaningStaff extends Staff {
    @Override
    public void coffee() {
        System.out.println("Can't drink coffee without a cigarette");
    }
}
