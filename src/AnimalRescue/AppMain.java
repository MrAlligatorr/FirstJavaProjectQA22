package AnimalRescue;

public class AppMain {

    public static void main(String[] args) {
        Animals dog = new Animals();
        dog.setAge(4);
        System.out.println(dog.getAge());

        dog.setName("Rex");
        System.out.println(dog.getName());

        dog.setHealthState(7);
        System.out.println(dog.getHealthState());

        dog.setHungry(9);
        System.out.println(dog.getHungry());

        dog.setHappiness(4);
        System.out.println(dog.getHappiness());

        dog.setFavoriteFood("Hotdogs");
        System.out.println(dog.getFavoriteFood());

        dog.setFavoriteFunActivity("Sleeping");
        System.out.println(dog.getFavoriteFunActivity());

        Adopters adopter = new Adopters();
        adopter.setName("Alex");
        System.out.println(adopter.getName());

        adopter.setMoneyIn$(300);
        System.out.println(adopter.getMoneyIn$());

        Food food = new Food();
        food.setName("Hotdogs");
        System.out.println(food.getName());

        food.setPriceIn$(1.99f);
        System.out.println(food.getPriceIn$());

        food.setQuantity(3);
        System.out.println(food.getQuantity());

        food.setInStock(200);
        System.out.println(food.getInStock());


        FunActivities sleep = new FunActivities();
        sleep.setSleeping("ZzZzZz...");
        System.out.println(sleep.getSleeping());

        Staff medic = new Staff();
        medic.setMedic("Dr.Plusica");
        System.out.println(medic.getMedic());

        medic.setSpecialization("Nutrition");
        System.out.println(medic.getSpecialization());
    }

}
