package service;

import model.Product;


import java.util.ArrayList;
import java.util.List;

public class ProductService {
    public static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1,"phong","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcReF-kUWCJV7sVD4Zu9bkXzZUYsiC8aebL56w&usqp=CAU",100));
        products.add(new Product(2,"an","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcReF-kUWCJV7sVD4Zu9bkXzZUYsiC8aebL56w&usqp=CAU",200));

    }

    public static int findIndexById(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id){
                return i;
            }
        }
        return -1;
    }

    public static void save(Product p) {
        products.add(p);
    }
    public static void delete(int index) {
        products.remove(index);
    }

    public static void edit(int index, Product product) {
        products.set(index, product);
    }


    public static Object getProduct(int id) {
        return products.get(findIndexById(id));
    }
}
