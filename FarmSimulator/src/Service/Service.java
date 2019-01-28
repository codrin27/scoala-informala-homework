package Service;

import Domain.AnimalProduct;
import Domain.Product;
import Domain.Sale;
import Domain.VegetalProduct;
import Repo.Repository;
import Validator.Validation;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * This class work with all Products that are added or saled in that day.
 */
public class Service {
    Repository repo;
    Validation v;


    public Service(Repository repo, Validation v) {
        this.repo = repo;
        this.v = v;
    }

    public void addAnimalProduct(int id, double price, LocalDate validitydate, double weight, double storage_temp, int quantity, String name) {
        Product p = new AnimalProduct(id, price, validitydate, weight, storage_temp, name);
        v.validate(p);
        repo.add(p, quantity);

    }

    public void addVegetalProduct(int id, double price, LocalDate validitydate, double weight, List<String> vitamins, int quantity, String name) {
        Product p = new VegetalProduct(id, price, validitydate, weight, name, vitamins);
        v.validate(p);
        repo.add(p, quantity);
    }

    public int saleProduct(int id, int quantity) {
        Product p = new AnimalProduct(id, 0, null, 0, 0, null);
        return repo.rem(p, quantity);
    }
    public List<Sale> salesFromDate(LocalDate day){
        List<Sale> ret = new ArrayList<>();
        for (Sale s:repo.allSales()){
            if(s.getDate().equals(day))
                ret.add(s);
        }
        return ret;
    }
}
