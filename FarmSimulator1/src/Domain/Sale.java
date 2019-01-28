package Domain;

import java.time.LocalDate;

/**
 *
 */
public class Sale {
    private Product p;
    private Integer quantity;
    private LocalDate date;

    public Sale(Product p, Integer quantity, LocalDate date) {
        this.p = p;
        this.quantity = quantity;
        this.date = date;
    }

    public Product getP() {
        return p;
    }

    public void setP(Product p) {
        this.p = p;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
