package UI;

import Domain.Sale;
import Service.Service;
import Validator.ValidationException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

/**
 * This class is our Order list, the class will desplay the menu of options from 1 to 4 and will throw a message if
 * you try to choose something that not exist.
 */
public class ConsoleUI {
    private Service s;

    public ConsoleUI(Service s) {
        this.s = s;
    }

    public void run() {
        while (true) {
            displayMenu();
            Integer cmd = getCommand();
            if (cmd == -1)
                continue;
            switch (cmd) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    saleProduct();
                    break;
                case 3:
                    salesFromDay();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("that option does not exist");
            }
        }
    }

    private void salesFromDay() {
        Scanner si = new Scanner(System.in);
        System.out.print("From what date do you want to see the sales?");
        LocalDate day;
        try{
            System.out.println("(yyyy-MM-dd): ");
            day = LocalDate.parse(si.nextLine(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            for(Sale sa:s.salesFromDate(day)){
                System.out.println(sa.getP().getId()+ " " + sa.getP().getName());
            }

        }
        catch (DateTimeParseException e){
            System.out.println("Errror formating data.");

        }
    }

    private void saleProduct() {
        Scanner si = new Scanner(System.in);
        System.out.println("Enter product Id: ");
        int id, quantity;
        try {
            id = Integer.parseInt(si.nextLine());
            System.out.println("Enter quantity: ");
            quantity = Integer.parseInt(si.nextLine());
            if (s.saleProduct(id, quantity) != 0) {
                System.out.println("There are no enough products in stock!");
            } else {
                System.out.println("Have a nice day!");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error at parsing data.");
        }
    }

    private void addProduct() {
        Scanner si = new Scanner(System.in);
        System.out.println("Product type ( 1 - animal; 2 - vegetal ) :");
        int pt, quantity, id;
        double price, weight;
        LocalDate date;
        String name;
        try {
            pt = Integer.parseInt(si.nextLine());
            if (pt != 1 && pt != 2) {
                System.out.println("Invalid product type!!");
                return;
            }
            System.out.println("Name of the product :");
            name = si.nextLine();
            System.out.println("Quantity of products to be added : ");
            quantity = Integer.parseInt(si.nextLine());
            System.out.println("Product id : ");
            id = Integer.parseInt(si.nextLine());
            System.out.println("Product price : ");
            price = Double.parseDouble(si.nextLine());
            System.out.println("Product validity date (yyyy-MM-dd): ");
            date = LocalDate.parse(si.nextLine(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            System.out.println("Product weight : ");
            weight = Double.parseDouble(si.nextLine());

            if (pt == 1) {
                System.out.println("Storage temperature : ");
                double storageTemp = Double.parseDouble(si.nextLine());
                s.addAnimalProduct(id, price, date, weight, storageTemp, quantity, name);
            } else {
                System.out.println("Vitamins (eg : \"A1,B2,B6,C\") : ");
                String vit = si.nextLine();
                String[] vist = vit.split("[ , ]");
                List<String> vitamins = new ArrayList<>();
                Collections.addAll(vitamins, vist);

                s.addVegetalProduct(id, price, date, weight, vitamins, quantity, name);
            }


        } catch (NumberFormatException e) {
            System.out.println("The option must be a number!!");
        }
        catch (DateTimeParseException e){
            System.out.println("Errror formating data.");

        }
        catch (ValidationException e){
            System.out.println(e.getMessage());
        }


    }

    private int getCommand() {
        System.out.println("Choose an option:");
        Scanner si = new Scanner(System.in);
        String str;
        str = si.nextLine();
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("The option must be a number!!");
            return -1;
        }
    }

    private void displayMenu() {
        System.out.println("1 Create product and add it to the store");
        System.out.println("2 Sale.");
        System.out.println("3 Sales from a day.");
        System.out.println("4 Exit.");
    }
}
