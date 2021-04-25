package animalRescue.Animals;

public abstract class Animals {

    private String name;
    private int age;
    private int healthState;
    private int hungry;
    private int happiness;
    private String favoriteFood;
    private String favoriteFunActivity;
    private int animalCode;


    public int getAnimalCode() {
        return animalCode;
    }

    public void setAnimalCode(int animalCode) {
        this.animalCode = animalCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealthState() {
        return healthState;
    }

    public void setHealthState(int healthState) {
        this.healthState = healthState;
    }

    public int getHungry() {
        return hungry;
    }

    public void setHungry(int hungry) {
        this.hungry = hungry;
    }

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public String getFavoriteFunActivity() {
        return favoriteFunActivity;
    }

    public void setFavoriteFunActivity(String favoriteFunActivity) {
        this.favoriteFunActivity = favoriteFunActivity;
    }

    public abstract void sleep ();

    public abstract void plays ();
}