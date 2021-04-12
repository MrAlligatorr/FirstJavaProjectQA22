package animalRescue.Staff;

public class Staff {
    private int age;
    private String name;
    private boolean isMale;
    private int daysWorking;
    private int daysOff;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public int getDaysWorking() {
        return daysWorking;
    }

    public void setDaysWorking(int daysWorking) {
        this.daysWorking = daysWorking;
    }

    public int getDaysOff() {
        return daysOff;
    }

    public void setDaysOff(int daysOff) {
        this.daysOff = daysOff;
    }
}

