import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



interface StoreOperations{
    public void addProduct(String productName);
    public void displayProducts();
    public void searchProduct(String productName);
    public void removeProduct(String productName);
    void countProducts();
    static void welcomeMessage(){
        System.out.println("Welcome to the Store");
    }
}
class Store implements StoreOperations{
    ArrayList<String> Products = new ArrayList<String>();



    @Override
    public void addProduct(String productName) {
        Products.add(productName);
        System.out.println("Adding product: " + productName);
    }

    @Override
    public void displayProducts() {
       for(String product : Products){
           System.out.println("lista: " + product);

       }
    }

    @Override
    public void searchProduct(String productName) {
        System.out.println("Searching product: " + productName);
     if(Products.contains(productName)){
         System.out.println("Found product: " + productName);

     }else{
        System.out.println("Not found product: " + productName);

     }
    }

    @Override
    public void removeProduct(String productName) {
        Products.remove(productName);
        System.out.println("Removing product: " + productName);
    }

    @Override
    public void countProducts() {
        System.out.println("Count products: " + Products.size());

    }

}




public class Main {
    public static void main(String[] args) {

    Store store = new Store();
    StoreOperations.welcomeMessage();
    store.addProduct("Apple");
    store.addProduct("Banana");
    store.addProduct("baklazan");

    store.displayProducts();
    store.searchProduct("baklazan");
    store.removeProduct("Banana");
    store.displayProducts();

        store.countProducts();






    }
}