package Domain;

import java.time.LocalDate;
import java.util.Objects;

/**
 * The Product class is the main class for our shop. She is in charge for all the products that are added in our shop.
 * She contain the atributes for our products.
 */
public abstract class Product implements Comparable{
    Integer id;
    private double price;
    private LocalDate validity_date;
    private double weight;
    private String name;


    public Product(int id, double price, LocalDate validity_date, double weight, String name) {
        this.id = id;
        this.price = price;
        this.validity_date = validity_date;
        this.weight = weight;
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "price: " + price +
                "  validity_date: " + validity_date +
                "  weight: " + weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getValidity_date() {
        return validity_date;
    }

    public void setValidity_date(LocalDate validity_date) {
        this.validity_date = validity_date;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * I overrinde the "equal" and "compareTo" objects to compare the products id when a products is added or sold.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public int compareTo(Object o) {
        return (id.compareTo(((Product)o).id));

    }
}
