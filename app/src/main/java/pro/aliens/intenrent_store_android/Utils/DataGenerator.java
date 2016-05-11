package pro.aliens.intenrent_store_android.Utils;

import java.util.ArrayList;

import pro.aliens.intenrent_store_android.R;
import pro.aliens.intenrent_store_android.model.Category;

/**
 * Created by Admin on 11.05.2016.
 */
public class DataGenerator {

    public static ArrayList<Category> categories(){
        ArrayList<Category> categories = new ArrayList<>();
        categories.add(new Category(0,"Аксессуары", R.drawable.ic_misc));
        categories.add(new Category(1,"Комплектующие", R.drawable.ic_complect));
        categories.add(new Category(2,"Оборудование", R.drawable.ic_repair));
        categories.add(new Category(3,"Электроника", R.drawable.ic_electronica));
        return categories;
    }
}
