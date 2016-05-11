package pro.aliens.intenrent_store_android.model;

/**
 * Created by Admin on 11.05.2016.
 */
public class Category {

    private String name;
    private int image = 0;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Category(int id, String name, int image) {
        this.name = name;
        this.image = image;
    }
    public Category(int id, String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
