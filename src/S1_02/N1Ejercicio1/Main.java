package S1_02.N1Ejercicio1;



import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Sale sale = new Sale();
        try {

            try {
                sale.calculateTotal();
            } catch (EmptySaleException e) {
                System.out.println(e.getMessage());
            }

            sale.addProduct(new Product("Product1", 100));
            sale.addProduct(new Product("Product2", 200));
            sale.calculateTotal();
            System.out.println("Total price is: " + sale.getTotalPrice());
        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }


        try {
            Product[] products1 = new Product[1];
            products1[1] = new Product("Sugar", 20);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}