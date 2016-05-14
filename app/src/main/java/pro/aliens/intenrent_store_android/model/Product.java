package pro.aliens.intenrent_store_android.model;

/**
 * Created by razor on 14.05.2016.
 */
public class Product {

    private int id;
    private String name;
    private int image;
    private float price;
    private int categoryId;

    public Product(int id, String name, int image, float price, int categoryId) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.price = price;
        this.categoryId = categoryId;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }


}
