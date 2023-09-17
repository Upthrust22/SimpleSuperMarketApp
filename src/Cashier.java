public class Cashier extends Staff{

    public Cashier(String name, short age, String id) {
        super(name, age, id);
    }

    public Cashier(String name, short age, String id, double salary) {
        super(name, age, id, salary);
    }

    public String processPurchase(Customer customer, Product product, int quantity) {
        String receipt;
        if(customer.purchaseProduct(product, quantity)) {
           double totalPrice = product.getPrice() * quantity;
           receipt = getName() + " processed the purchase for " + customer.getName() + " - Total: #" + totalPrice;
        } else {
            receipt = "Unable to process the purchase for " + customer.getName();
        }
        return receipt;
    }


}
