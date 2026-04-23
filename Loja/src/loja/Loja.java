package loja;

public class Loja {
    public static void main(String[] args) {

        Store store = new Store(5);

        Clothing c1 = new Clothing("T-Shirt", 40, 29.99f, 10);
        Clothing c2 = new Clothing("Jeans", 42, 89.99f, 5);
        Clothing c3 = new Clothing("Jacket", 38, 149.99f, 3);

        store.add(c1);
        store.add(c2);
        store.add(c3);

        System.out.println("=== Initial Stock ===");
        store.listAll();

        System.out.println("\n=== After adding 5 T-Shirts ===");
        store.incUnits(0, 5);
        store.listAll();

        System.out.println("\n=== After removing 3 Jeans ===");
        boolean success = store.decUnits(1, 3);
        System.out.println("Operation success: " + success);
        store.listAll();

        System.out.println("\n=== Trying to remove 10 Jackets (not enough stock) ===");
        boolean fail = store.decUnits(2, 10);
        System.out.println("Operation success: " + fail);
    }
}