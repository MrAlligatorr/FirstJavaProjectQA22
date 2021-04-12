package animalRescue.Food;

public class Food {

    private String name;
    private float priceIn$;
    private int quantity;
    private int inStock;
    private int recepies;


    public int getRecepies() {
        return recepies;
    }

    public void setRecepies(int recepies) {
        this.recepies = recepies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPriceIn$() {
        return priceIn$;
    }

    public void setPriceIn$(float priceIn$) {
        this.priceIn$=priceIn$;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getInStock() {
        return inStock;
    }

    public void setInStock(int inStock) {
        this.inStock = inStock;
    }
}
