package Validator;

import Domain.AnimalProduct;
import Domain.Product;
import Domain.VegetalProduct;

import java.time.LocalDate;

/**
 * This class Validate a product.
 */
public class Validation {
    public void validate(Product p) throws ValidationException {
        String e = "";
        if (p.getId() <= 0) {
            e = e + "Id cannot be negative.\n";
        }
        if (p.getPrice() <= 0) {
            e = e + "Price cannot be negative.\n";
        }
        if (p.getName().equals(""))
            e = e + "Product must have a name.\n";
        if (p.getValidity_date().isBefore(LocalDate.now()))
            e = e + "Validity date must be highter than today.\n";
        if (p.getWeight() <= 0)
            e = e + "Weight must be positive.\n";

        if (p instanceof AnimalProduct) {
            if (((AnimalProduct) p).getStorage_temp() > 30)
                e = e + "Storage temperature must be a potrivite one.\n";

        } else {
            if (((VegetalProduct) p).getVitamins().size() == 0)
                e = e + "The product must have vitamins.\n";


        }
        if (e.length() > 0)
            throw new ValidationException(e);
    }
}
