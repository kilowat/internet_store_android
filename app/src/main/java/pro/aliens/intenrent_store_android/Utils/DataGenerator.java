package pro.aliens.intenrent_store_android.Utils;

import java.util.ArrayList;

import pro.aliens.intenrent_store_android.R;
import pro.aliens.intenrent_store_android.extra.PageKey;
import pro.aliens.intenrent_store_android.model.Category;
import pro.aliens.intenrent_store_android.model.DrawerItem;

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

    public static ArrayList<DrawerItem> drawerItems(){
        ArrayList<DrawerItem> drawerItems = new ArrayList<>();
        DrawerItem item1 = new DrawerItem(PageKey.INDEX, R.drawable.ic_assignment_return_24dp, "Main page");
        DrawerItem item2 = new DrawerItem(PageKey.INDEX, R.drawable.ic_assignment_return_24dp, "About");
        DrawerItem item3 = new DrawerItem(PageKey.INDEX, R.drawable.ic_assignment_return_24dp, "Profile");
        DrawerItem item4 = new DrawerItem(PageKey.INDEX, R.drawable.ic_assignment_return_24dp, "Quit");
        drawerItems.add(item1);
        drawerItems.add(item2);
        drawerItems.add(item3);
        drawerItems.add(item4);

        return drawerItems;
    }
}
