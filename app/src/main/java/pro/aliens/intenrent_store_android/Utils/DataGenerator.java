package pro.aliens.intenrent_store_android.Utils;

import java.util.ArrayList;

import pro.aliens.intenrent_store_android.model.Category;

/**
 * Created by Admin on 11.05.2016.
 */
public class DataGenerator {

    public static ArrayList<Category> categories(){
        String[] category = {
                "Аксессуары для мобильных телефонов и планшетов",
                "Комплектующие для мобильных телефонов и планшетов",
                "Комплектующие для ремонта ноутбуков",
                "Оборудование для ремонта мобильных телефонов, планшетов, ноутбуков",
                "Прочая электроника",
                "Распродажа аксессуаров",
        };
        ArrayList<Category> categories = new ArrayList<>();
        for(int i = 0; category.length>i;i++){
            Category cat = new Category(category[i]);
            categories.add(cat);
        }
        return categories;
    }
}
