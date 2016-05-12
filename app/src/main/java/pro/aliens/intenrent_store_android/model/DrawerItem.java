package pro.aliens.intenrent_store_android.model;

/**
 * Created by razor on 12.05.2016.
 */
public class DrawerItem {

    private int id;
    private int image;
    private String name;

    public DrawerItem(int id, int image, String name) {
        this.id = id;
        this.image = image;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
