package WeekSeven;


/**
 * Write a description of class Menu here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
 class Menu {
    private String itemName;
    private float price;
    private String category;
    private boolean vegetarian;
    private boolean available;
    
    public Menu(String itemName, float price, String category, boolean vegetarian, boolean available) {
        this.itemName = itemName;
        this.price = price;
        this.category = category;
        this.vegetarian = vegetarian;
        this.available = available;
    }
    
    public String getIteName() {
        return itemName;
    }
    
    public float getPrice() {
        return price;
    }
    
    public String getCategory() {
        return category;
    }
    
    public boolean isVegetarian() {
        return vegetarian;
    }
    
    public boolean isAvailable() {
        return available;
    }
    
    public void  isVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }
    
    public void isAvailable(boolean available) {
        this.available = available;
    }
    
    public String toString() {
        return "Menu : " + "\n" +
        "Name: " + itemName + "\n" +
        "Price: " + "Rs." + price + "\n" +
        "Category: " + category + "\n" +
        "Veg: " + vegetarian + "\n" +
        "Available: "  + available + "\n";
    }
}