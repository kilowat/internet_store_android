package pro.aliens.intenrent_store_android.model;

/**
 * Created by Admin on 17.05.2016.
 */
public class CartProduct {

    private int id;
    private String name;
    private int image;
    private int count;
    private float price;

    public CartProduct(int id, String name, int image, int count, float price) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.count = count;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
