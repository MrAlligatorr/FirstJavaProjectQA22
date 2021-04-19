package animalRescue.Adopters;

public class Adopters {

    private String name;
    private float moneyIn$;
    private int hasAnimalCode;
    private float purchaseAnimalDate;
    private float totalMoneyPurchasesIn$;
    private int age;
    private String responsibleForTheAnimal;


    public String getResponsibleForTheAnimal() {
        return responsibleForTheAnimal;
    }

    public void setResponsibleForTheAnimal(String responsibleForTheAnimal) {
        this.responsibleForTheAnimal = responsibleForTheAnimal;
    }

    public int getHasAnimalCode() {
        return hasAnimalCode;
    }

    public void setHasAnimalCode(int hasAnimalCode) {
        this.hasAnimalCode = hasAnimalCode;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getPurchaseAnimalDate() {
        return purchaseAnimalDate;
    }

    public void setPurchaseAnimalDate(float purchaseAnimalDate) {
        this.purchaseAnimalDate = purchaseAnimalDate;
    }

    public float getTotalMoneyPurchasesIn$() {
        return totalMoneyPurchasesIn$;
    }

    public void setTotalMoneyPurchasesIn$(float totalMoneyPurchasesIn$) {
        this.totalMoneyPurchasesIn$ = totalMoneyPurchasesIn$;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMoneyIn$() {
        return moneyIn$;
    }

    public void setMoneyIn$(float moneyIn$) {
        this.moneyIn$ = moneyIn$;
    }
}
