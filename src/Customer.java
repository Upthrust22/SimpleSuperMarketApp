public class Customer {
    private String id;
    private String name;
    private double wallet;

    public Customer(String id, String name, double wallet) {
        this.id = id;
        this.name = name;
        this.wallet = wallet;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", wallet=" + wallet +
                '}';
    }

    public boolean purchaseProduct(Product product, int quantity) {
       if(product.getQuantity() >= quantity && wallet >= product.getPrice() * quantity) {
           product.setQuantity(product.getQuantity() - quantity);
           wallet -= product.getPrice() * quantity;
           System.out.println(name + " purchased " + quantity + " " + product.getName() + "(s).");
           return true;
       } else {
           System.out.println("Insufficient quantity in stock or not enough funds.");
           return false;
       }
    }

}
