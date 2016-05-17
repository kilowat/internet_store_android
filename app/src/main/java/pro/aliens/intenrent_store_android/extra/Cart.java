package pro.aliens.intenrent_store_android.extra;

import android.app.Application;
import android.content.Context;

import java.lang.reflect.Array;
import java.util.ArrayList;

import pro.aliens.intenrent_store_android.StoreApplication;
import pro.aliens.intenrent_store_android.model.CartProduct;
import pro.aliens.intenrent_store_android.model.Product;

/**
 * Created by Admin on 17.05.2016.
 */
public class Cart {


    private ArrayList<CartProduct> products = new ArrayList<>();

    public static Cart instance;


    private Cart(){

    }

    public static Cart getInstance(){
        if(instance == null)
            instance = new Cart();
        return instance;
    }

    public void add(Product product, int count){

        int id = product.getId();
        String name = product.getName();
        int img = product.getImage();
        float price = product.getPrice();
        if(products.contains(product)){
            int productCount = products.get(product.getId()).getCount()+count;
            products.get(product.getId()).setCount(productCount);
        }else{
            CartProduct cartProduct = new CartProduct(id, name, img, count, price);
            this.products.add(cartProduct);
        }
    }
    public ArrayList<CartProduct> getProducts(){
        return this.products;
    }
    public int getItemCartCount(){
        int count = 1;

        for (int i = 1; products.size()>i;i++){
            if(products.get(i).getId()!= products.get(i-1).getId()){
                count++;
            }
        }
        return count;
    }
}
