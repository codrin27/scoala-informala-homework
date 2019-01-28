import Repo.Repository;
import Service.Service;
import UI.ConsoleUI;
import Validator.Validation;

/**
 * @author: Codrin
 * The program is a simulation for a local store that sells Animal and Vegetal food and let you choise from adding a
 * product, selling, showing the sells from a day or exit.
 */
public class Main {

    public static void main(String[] args) {

        Repository r = new Repository();
        Validation v = new Validation();
        Service s = new Service(r, v);
        ConsoleUI app = new ConsoleUI(s);

        app.run();


    }
}
