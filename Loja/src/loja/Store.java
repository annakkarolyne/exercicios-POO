package loja;

public class Store {
    private ItemStockInterface[] items;
    private int count;

    public Store(int maxSize) {
        this.items = new ItemStockInterface[maxSize];
        this.count = 0;
    }

    public int add(ItemStockInterface item) {
        if (count >= items.length) return -1;
        items[count] = item;
        return count++;
    }

    public boolean incUnits(int index, int qty) {
        if (index < 0 || index >= count) return false;
        items[index].incUnits(qty);
        return true;
    }

    public boolean decUnits(int index, int qty) {
        if (index < 0 || index >= count) return false;
        return items[index].decUnits(qty);
    }

    public void listAll() {
        float total = 0;
        for (int i = 0; i < count; i++) {
            items[i].print();
            total += items[i].getPrice() * items[i].getUnits();
        }
        System.out.println("Total stock value: $" + total);
    }
}