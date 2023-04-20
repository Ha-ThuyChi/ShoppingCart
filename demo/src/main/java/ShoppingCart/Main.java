/**
 * @author Ha Thuy Chi - s3930417
 */

package ShoppingCart;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<ShoppingCart> lst = new ArrayList<>();
        Map<String, String> items = new HashMap<>();
        boolean start = false;
        while (!start) {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("\n\nPlease choose options by entering the number!\n" + 
            "1 Create shopping cart\n"+
            "2 Display all shopping carts base on their total weight\n"+
            "3 Exit");
            System.out.println("-------------------------------------------------");
            int ans1 = sc1.nextInt();
            switch (ans1) {
                case 1 : {
                    Scanner sc2 = new Scanner(System.in);
                    ShoppingCart cart1 = new ShoppingCart();
                    System.out.println("Your shopping cart was just created!");
                    
                    boolean avai1 = false;
                    while (!avai1) {
                        System.out.println("\n\nPlease choose options by entering the number!\n" + 
                        "1 Create new products\n"+
                        "2 Display the cart amount\n"+
                        "3 Exit");
                        System.out.println("-------------------------------------------------");
                        int ans2 = sc2.nextInt();
                        switch (ans2) {
                            case 1 : { //Create and Add products to cart
                                Scanner sc3 = new Scanner(System.in);
                                System.out.println("Please enter the values for products follow order!");
                                System.out.println("Type of product (Digital or Physical?):");
                                String type = sc3.nextLine();
                                if (type.charAt(0) == 'P' || type.charAt(0) == 'p') {
                                    System.out.println("Name:");
                                    String name = sc3.nextLine();
                                    System.out.println("Description:");
                                    String description = sc3.nextLine();
                                    System.out.println("Quantity:");
                                    int quantity = sc3.nextInt();
                                    System.out.println("Price:");
                                    double price = sc3.nextDouble();
                                    System.out.println("Weight:");
                                    double weight = sc3.nextDouble();
                                    PhysicalProduct product = new PhysicalProduct(name, description, quantity, price, weight);
                                    System.out.println("You just added product: " + product.toString());
                                    items.put(name, String.format("%s,%d,%.2f, %.2f", description, quantity, price, weight));
                                    
                                    boolean editItem = false;
                                    while (!editItem) {
                                        System.out.println("Do you want to edit item? (Y/N)\n");
                                        String ans3 = sc3.next();
                                        if (ans3.equals("Y")) {
                                            Scanner sc4 = new Scanner(System.in);
                                            System.out.println("Please choose what you want to edit (1 name, 2 description, 3 quantity, 4 price, or 5 weight)!");
                                            int choice = sc4.nextInt();
                                            Scanner sc5 = new Scanner(System.in);
                                            switch (choice) {
                                                case 1: {
                                                    System.out.println("Please enter the value you want to edit!");
                                                    String newValue = sc5.nextLine();
                                                    product.setName(newValue);
                                                    System.out.printf("Your new products: %s\n", product.toString());
                                                    break;
                                                } 
                                                case 2: {
                                                    System.out.println("Please enter the value you want to edit!");
                                                    String newValue = sc5.nextLine();
                                                    product.setDescription(newValue);
                                                    System.out.printf("Your new products: %s\n", product.toString());
                                                    break;
                                                }
                                                case 3: {
                                                    System.out.println("Please enter the value you want to edit!");
                                                    int newValue = sc5.nextInt();
                                                    product.setQuantity(newValue);
                                                    System.out.printf("Your new products: %s\n", product.toString());
                                                    break;
                                                }
                                                case 4 : {
                                                    System.out.println("Please enter the value you want to edit!");
                                                    double newValue = sc5.nextDouble();
                                                    product.setPrice(newValue);
                                                    System.out.printf("Your new products: %s\n", product.toString());
                                                    break;
                                                }
                                                case 5 : {
                                                    System.out.println("Please enter the value you want to edit!");
                                                    double newValue = sc5.nextDouble();
                                                    product.setWeight(newValue);
                                                    System.out.printf("Your new products: %s\n", product.toString());
                                                    break;
                                                }
                                            }
                                        } else { 
                                            editItem = true;
                                            break;
                                        }
                                    }


                                    Scanner sc4 = new Scanner(System.in);
                                    System.out.println("Do you want to add this product to cart? (Y/N)");
                                    String ans4 = sc4.nextLine();
                                    if (ans4.equals("Y")) {
                                        cart1.addItem(product.getName());
                                        System.out.println("Add successfully!");
                                    }

                                    Scanner sc5 = new Scanner(System.in);
                                    System.out.println("Do you want to remove this product from cart? (Y/N)");
                                    String ans5 = sc5.nextLine();
                                    if (ans5.equals("Y")) {
                                        cart1.removeItem(product.getName());
                                        System.out.println("Remove successfully!");
                                    }
                                } else {
                                    System.out.println("Name:");
                                    String name = sc3.nextLine();
                                    System.out.println("Description:");
                                    String description = sc3.nextLine();
                                    System.out.println("Quantity:");
                                    int quantity = sc3.nextInt();
                                    System.out.println("Price:");
                                    double price = sc3.nextDouble();
                                    DigitalProduct product = new DigitalProduct(name, description, quantity, price);
                                    System.out.println("You just added product: " + product.toString());


                                    boolean editItem = false;
                                    while (!editItem) {
                                        System.out.println("Do you want to edit item? (Y/N)");
                                        String ans3 = sc3.next();
                                        if (ans3.equals("Y")) {
                                            Scanner sc4 = new Scanner(System.in);
                                            System.out.println("Please choose what you want to edit (1 name, 2 description, 3 quantity, or 4 price)!");
                                            int choice = sc4.nextInt();
                                            Scanner sc5 = new Scanner(System.in);
                                            switch (choice) {
                                                case 1: {
                                                    System.out.println("Please enter the value you want to edit!");
                                                    String newValue = sc5.nextLine();
                                                    product.setName(newValue);
                                                    System.out.printf("Your new products: %s\n", product.toString());
                                                    break;
                                                } 
                                                case 2: {
                                                    System.out.println("Please enter the value you want to edit!");
                                                    String newValue = sc5.nextLine();
                                                    product.setDescription(newValue);
                                                    System.out.printf("Your new products: %s\n", product.toString());
                                                    break;
                                                }
                                                case 3: {
                                                    System.out.println("Please enter the value you want to edit!");
                                                    int newValue = sc5.nextInt();
                                                    product.setQuantity(newValue);
                                                    System.out.printf("Your new products: %s\n", product.toString());
                                                    break;
                                                }
                                                case 4 : {
                                                    System.out.println("Please enter the value you want to edit!");
                                                    double newValue = sc5.nextDouble();
                                                    product.setPrice(newValue);
                                                    System.out.printf("Your new products: %s\n", product.toString());
                                                    break;
                                                }
                                            }
                                        } else { 
                                            editItem = true;
                                            break;
                                        }
                                    }


                                    Scanner sc4 = new Scanner(System.in);
                                    System.out.println("Do you want to add this product to cart? (Y/N)");
                                    String ans4 = sc4.nextLine();
                                    if (ans4.equals("Y")) {
                                        cart1.addItem(product.getName());
                                        System.out.println("Add successfully!");
                                    }

                                    Scanner sc5 = new Scanner(System.in);
                                    System.out.println("Do you want to remove this product from cart? (Y/N)");
                                    String ans5 = sc5.nextLine();
                                    if (ans5.equals("Y")) {
                                        cart1.removeItem(product.getName());
                                        System.out.println("Remove successfully!");
                                    }
                                }
                                break;
                            }
                            case 2 : {
                                System.out.printf("Your cart amount is %.2f", cart1.cartAmount());
                                break;
                            }
                            case 3 : {
                                avai1 = true;
                                break;
                            }
                        }
                    }
                    lst.add(cart1);
                    break;
                }
                case 2 : {
                    List<ShoppingCart> copyLst = new ArrayList<>();
                    for (ShoppingCart c : lst) {
                        copyLst.add(c);
                    }
                    lst.sort(new ShoppingCartComparator());
                    for (ShoppingCart c : lst) {
                        for (ShoppingCart c1 : copyLst) {
                            if (c.equals(c1)) {
                                System.out.printf("Cart %d has: %s with %.2f\n",copyLst.indexOf(c1), c.toString(), c.totalWeight());
                            }
                        }
                    }
                    break;
                }
                case 3 : {
                    start = true;
                    break;
                }
            }
        }
    }
}