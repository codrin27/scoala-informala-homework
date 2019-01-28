package Domain;

import java.time.LocalDate;
import java.util.List;

/**
 * The "VegetalProduct" class is made for the vegetal products, is one of the child classes for Product, she has the
 * list of vitamins that contains a vegetal product.
 */
public class VegetalProduct extends Product {
    private List<String> vitamins;

    public VegetalProduct(int id, double price, LocalDate validity_date, double weight, String name, List<String> vitamins) {
        super(id, price, validity_date, weight, name);
        this.vitamins = vitamins;
    }

    public List<String> getVitamins() {
        return vitamins;
    }

    public void setVitamins(List<String> vitamins) {
        this.vitamins = vitamins;
    }

    @Override
    public String toString() {
        return super.toString() +
                "vitamins: " + vitamins;
    }
}
