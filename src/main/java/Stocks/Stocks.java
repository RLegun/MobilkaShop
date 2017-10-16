package Stocks;

public class Stocks {
    private int id;
    private String name;
    private int oldPrice;
    private int newPrice;
    private String description;

    public Stocks(int id, String name, int oldPrice, int newPrice, String description){
        this.id = id;
        this.name = name;
        this.oldPrice = oldPrice;
        this.newPrice = newPrice;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(int oldPrice) {
        this.oldPrice = oldPrice;
    }

    public int getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(int newPrice) {
        this.newPrice = newPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
