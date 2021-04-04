package lab2.AnimalRescue;

public class AppMain {

    public static void main(String[] args) {
        Animals Rex =new Animals();
        System.out.println(Rex.type);
        System.out.println(Rex.age);
        System.out.println(Rex.healthState);
        System.out.println(Rex.hungry);
        System.out.println(Rex.happiness);
        System.out.println(Rex.favoriteFood);
        System.out.println(Rex.favoriteFunActivity);

        Adopters Peter = new Adopters();
        System.out.println(Peter.moneyIn$);

        Food Hotdogs = new Food();
        System.out.println(Hotdogs.inStock);
        System.out.println(Hotdogs.priceIn$);
        System.out.println(Hotdogs.quantity);

        FunActivities Sleeping = new FunActivities();
        System.out.println(Sleeping.sleeping);

        Staff DrPlusica = new Staff();
        System.out.println(DrPlusica.specialization);


    }

}
