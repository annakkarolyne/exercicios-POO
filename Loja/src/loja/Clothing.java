package loja;

public class Clothing implements ItemStockInterface {
    private String description;
    private int size;
    private float price;
    private int stock;

    public Clothing(String description, int size, float price, int stock) {
        this.description = description;
        this.size = size;
        this.price = price;
        this.stock = stock;
    }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public int getSize() { return size; }
    public void setSize(int size) { this.size = size; }

    public float getPrice() { return price; }
    public void setPrice(float price) { this.price = price; }

    public int getUnits() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    @Override
    public void incUnits(int qty) {
        this.stock += qty;
    }

    @Override
    public boolean decUnits(int qty) {
        if (stock < qty) return false;
        this.stock -= qty;
        return true;
    }

    @Override
    public void print() {
        System.out.println("Description: " + description);
        System.out.println("Size: " + size);
        System.out.println("Price: $" + price);
        System.out.println("Stock: " + stock);
        System.out.println("--------------------");
    }
}