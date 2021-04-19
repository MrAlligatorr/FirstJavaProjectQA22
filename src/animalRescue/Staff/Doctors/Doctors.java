package animalRescue.Staff.Doctors;

import animalRescue.Staff.Staff;

public class Doctors extends Staff {

    private String specialization;

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void coffee(){
        System.out.println("Can't live without coffee");
    }
}
