package Domain;

import java.time.LocalDate;

/**
 * The class AnimalProduct is the child class for Product. This class will store the animal products with the storage
 * temperature that is needed for the products.
 */
public class AnimalProduct extends Product {
    private double storage_temp;

    public AnimalProduct(int id, double price, LocalDate validity_date, double weight, double storage_temp, String name) {
        super(id, price, validity_date, weight, name);
        this.storage_temp = storage_temp;
    }

    @Override
    public String toString() {
        return super.toString() +
                "  storage_temp: " + storage_temp;
    }

    public double getStorage_temp() {
        return storage_temp;
    }

    public void setStorage_temp(double storage_temp) {
        this.storage_temp = storage_temp;
    }
}
