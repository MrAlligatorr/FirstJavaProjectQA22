package animalRescue;

import animalRescue.Adopters.Adopters;
import animalRescue.Animals.Animals;
import animalRescue.Animals.Cats.Species.MainCoon;
import animalRescue.Animals.Cats.Species.Siamese;
import animalRescue.Animals.Dogs.Species.Bulldog;
import animalRescue.Animals.Dogs.Species.GoldenRetriever;
import animalRescue.Food.Food;
import animalRescue.Food.Meat.Meat;
import animalRescue.FunActivities.Inside.InsideActivities;
import animalRescue.FunActivities.Outside.OutsideActivities;
import animalRescue.Staff.CleaningStaff.CleaningStaff;
import animalRescue.Staff.Doctors.Doctors;
import animalRescue.Staff.Nurses.Nurses;

public class AppMain {

    public static void main(String[] args) {
        Siamese sia = new Siamese();
        sia.purr();

        sia.sleep();

        sia.plays();

        MainCoon mc = new MainCoon();
//        mc.setHasFur(true);
//        System.out.println(mc.isHasFur());

        mc.plays();

        mc.purr();

        mc.sleep();

//        mc.setAge(2);
//        System.out.println(mc.getAge());
//
//        mc.setAnimalCode(152362);
//        System.out.println(mc.getAnimalCode());
//
//        mc.setName("Luna");
//        System.out.println(mc.getName());
//
//        mc.setHealthState(10);
//        System.out.println(mc.getHealthState());
//
//        mc.setHungry(1);
//        System.out.println(mc.getHungry());
//
//        mc.setHappiness(8);
//        System.out.println(mc.getHappiness());
//
//        mc.setFavoriteFood("Fish Sticks");
//        System.out.println(mc.getFavoriteFood());
//
//        mc.setFavoriteFunActivity("Eating");
//        System.out.println(mc.getFavoriteFunActivity());
//
        GoldenRetriever gldn = new GoldenRetriever();
        gldn.barks();

        gldn.plays();

        gldn.sleep();

        Bulldog dog = new Bulldog();
//        dog.setAge(4);
//        System.out.println(dog.getAge());
//
//        dog.setAnimalCode(15346);
//        System.out.println(dog.getAnimalCode());
//
//        dog.setAgresivityLevel1To10(8);
//        System.out.println(dog.getAgresivityLevel1To10());
//
        dog.barks();
//
        dog.plays();

        dog.sleep();

//        dog.setName("Rex");
//        System.out.println(dog.getName());
//
//        dog.setHealthState(7);
//        System.out.println(dog.getHealthState());
//
//        dog.setHungry(9);
//        System.out.println(dog.getHungry());
//
//        dog.setHappiness(4);
//        System.out.println(dog.getHappiness());
//
//        dog.setFavoriteFood("Hotdogs");
//        System.out.println(dog.getFavoriteFood());
//
//        dog.setFavoriteFunActivity("Sleeping");
//        System.out.println(dog.getFavoriteFunActivity());
//
//        //Adopters
//        Adopters adopter = new Adopters();
//        adopter.setName("Alex");
//        System.out.println(adopter.getName());
//
//        adopter.setMoneyIn$(300);
//        System.out.println(adopter.getMoneyIn$());
//
//        adopter.setHasAnimalCode(15346);
//        System.out.println(adopter.getHasAnimalCode());
//
//        adopter.setPurchaseAnimalDate(22.08f);
//        System.out.println(adopter.getPurchaseAnimalDate());
//
//        adopter.setTotalMoneyPurchasesIn$(2345.5f);
//        System.out.println(adopter.getTotalMoneyPurchasesIn$());
//
//        adopter.setAge(24);
//        System.out.println(adopter.getAge());
//
//        //Food
//        Meat meat = new Meat();
//        meat.setRecepies(23);
//        System.out.println(meat.getRecepies());
//
//        meat.setName("Hotdogs");
//        System.out.println(meat.getName());
//
//        meat.setPriceIn$(1.99f);
//        System.out.println(meat.getPriceIn$());
//
//        meat.setQuantity(3);
//        System.out.println(meat.getQuantity());
//
//        meat.setInStock(200);
//        System.out.println(meat.getInStock());
//
//        //Activities
//        InsideActivities ins = new InsideActivities();
//        ins.sleeping();
//
//        OutsideActivities out = new OutsideActivities();
//        out.fetch();
//
//        //Staff
//        Doctors doc = new Doctors();
//        doc.setSpecialization("Nutrition");
//        System.out.println(doc.getSpecialization());
//
//        doc.setAge(36);
//        System.out.println(doc.getAge());
//
//        doc.setName("Plusica");
//        System.out.println(doc.getName());
//
//        doc.setMale(false);
//        System.out.println(doc.isMale());
//
//        doc.setDaysWorking(24686);
//        System.out.println(doc.getDaysWorking());
//
//        doc.setDaysOff(4);
//        System.out.println(doc.getDaysOff());
//
//        CleaningStaff cs = new CleaningStaff();
//        cs.setAge(24);
//        System.out.println(cs.getAge());
//
//        cs.setName("Alex");
//        System.out.println(cs.getName());
//
//        cs.setMale(true);
//        System.out.println(cs.isMale());
//
//        cs.setDaysWorking(23);
//        System.out.println(cs.getDaysWorking());
//
//        cs.setDaysOff(0);
//        System.out.println(cs.getDaysOff());
//
//        Nurses nurse = new Nurses();
//        nurse.setAge(20);
//        System.out.println(nurse.getAge());
//
//        nurse.setName("Tiffy");
//        System.out.println(nurse.getName());
//
//        nurse.setMale(true);
//        System.out.println(nurse.isMale());
//
//        nurse.setDaysWorking(70);
//        System.out.println(nurse.getDaysWorking());
//
//        nurse.setDaysOff(1);
//        System.out.println(nurse.getDaysOff());
    }

}
