import java.util.ArrayList;
import java.util.List;

public class Manager extends Staff{
    private List<Cashier> hiredCashiers;

    public Manager(String name, short age, String id) {
        super(name, age, id);
        this.hiredCashiers = new ArrayList<>();
    }

    public Manager(String name, short age, String id, double salary) {
        super(name, age, id, salary);
        this.hiredCashiers = new ArrayList<>();
    }

    public void addProduct(Product product, int quantity) {
        product.setQuantity(product.getQuantity() + quantity);
        System.out.println(getName() + " added " + quantity + " " + product.getName() + "(s) to the store.");
    }

    public void hireCashier(String name, short age, String id) {
        Cashier newCashier = new Cashier(name, age, id);
        hiredCashiers.add(newCashier);
        System.out.println(getName() + " hired a new cashier: " + name);
       // return (Cashier) (Cashier) hiredCashiers;
    }

}
