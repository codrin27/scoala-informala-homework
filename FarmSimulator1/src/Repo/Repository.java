package Repo;

import Domain.Product;
import Domain.Sale;
import Validator.ValidationException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * This class is the Stock class for our program.
 */
public class Repository {
    private TreeMap<Product, Integer> all;
    private List<Sale> sales;


    public Repository() {
        all = new TreeMap<>();
        sales = new ArrayList<>();
    }

    /**
     * This method add products in stock.
     * @param p
     * @param quantity
     */
    public void add(Product p, Integer quantity) {
        if (all.get(p) == null)

            all.put(p, quantity);
        else {
            Product pr = all.floorKey(p);
            if(!pr.getName().equals(p.getName())){
                throw new ValidationException("The Id is already assing for another product.");
            }
            int q = all.get(p);
            q = q + quantity;
            all.put(p, q);
        }
    }

    /**
     *This method remove products from stock.
     * @param p
     * @param quantity
     * @return
     */
    public int rem(Product p, Integer quantity) {
        Integer q = all.get(p);
        Product pr = all.floorKey(p);
        if (q >= quantity) {
            q -= quantity;
            Sale s = new Sale(pr, quantity, LocalDate.now());
            all.put(pr, q);
            sales.add(s);
            return 0;
        } else {
            all.put(pr, q);
            return -1;

        }
    }

    public Iterable<? extends Sale> allSales() {
        return sales;
    }
}
