package loja;

public interface ItemStockInterface {
    void incUnits(int qty);
    boolean decUnits(int qty);
    int getUnits();
    float getPrice();
    void print();
}