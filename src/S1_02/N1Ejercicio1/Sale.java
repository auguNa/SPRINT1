package S1_02.N1Ejercicio1;



import java.util.ArrayList;

public class Sale {
    private ArrayList<Product> products;
    private double totalPrice;


    public Sale() {
        this.products = new ArrayList<>();
        this.totalPrice = 0;
    }
public void addProduct(Product product){
        this.products.add(product);
}

    public double getTotalPrice() {
        return totalPrice;
    }

        public double calculateTotal()throws EmptySaleException {
        if (products.isEmpty()){
            throw new EmptySaleException("To make a sale, first add products.");
        }
         totalPrice = 0;
        for (int i = 0; i < products.size(); i++) {
            totalPrice += products.get(i).getPrice();
        }
        return totalPrice;
    }
    public void showProducts(){
        for (int i = 0; i < products.size(); i++){
            System.out.println(products.get(i).getName() + products.get(i).getName() + "€");
        }
    }
}
