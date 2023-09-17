public class SuperMarketApp {
    public static void main(String[] args) {
        // Create products objects
        Product product1 = new Product("p1", "Plantain-Chip", 50, 50);
        Product product2 = new Product("p2", "Pepsi", 150, 200);
        Product product3 = new Product("p3", "Toothpaste", 600, 60);

        // Create a manager, cashier, and customer
        Manager manager = new Manager("Raphael", (short) 26, "M01");
        Cashier cashier = new Cashier("Binta", (short) 18, "C01");
        Customer customer = new Customer("Cust01", "Michael", 200000.00);

        // Manager adds products to the store
        manager.hireCashier("Emmanuel", (short) 19, "C02");
        manager.addProduct(product1, 30);
        manager.addProduct(product2, 50);
        manager.addProduct(product3, 40);

        // Customer makes a purchase
        customer.purchaseProduct(product1, 5);
        customer.purchaseProduct(product2, 2);
        customer.purchaseProduct(product3, 10);

        // Cashier process purchase
        cashier.processPurchase(customer, product1, 5);
        cashier.processPurchase(customer, product2, 2);
        cashier.processPurchase(customer, product3, 10);

        // Display updated product information
        System.out.println("\nUpdated Product Information:");
        product1.displayProduct();
        product2.displayProduct();
        product3.displayProduct();
    }
}