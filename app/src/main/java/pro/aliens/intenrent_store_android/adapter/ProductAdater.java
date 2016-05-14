package pro.aliens.intenrent_store_android.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import pro.aliens.intenrent_store_android.R;
import pro.aliens.intenrent_store_android.model.Product;

/**
 * Created by Admin on 13.05.2016.
 */
public class ProductAdater extends RecyclerView.Adapter<ProductAdater.ProductViewHolder> {

    private LayoutInflater layoutInflater;
    private Context context;
    private ArrayList<Product> products = new ArrayList<>();

    public ProductAdater(Context context, ArrayList<Product> products) {
        this.context = context;
        this.products = products;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = layoutInflater.inflate(R.layout.product_list, parent, false);
        ProductViewHolder productViewHolder = new ProductViewHolder(view);

        return productViewHolder;
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {

        String name = products.get(position).getName();
        int image = products.get(position).getImage();
        float price = products.get(position).getPrice();

        holder.imageView.setImageResource(image);
        holder.nameView.setText(name);
        holder.priceView.setText(price+" Р");

    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder{

        public ImageView imageView;
        public TextView nameView;
        public TextView priceView;

        public ProductViewHolder(View itemView) {
            super(itemView);

            imageView = (ImageView) itemView.findViewById(R.id.product_image);
            nameView = (TextView) itemView.findViewById(R.id.product_name);
            priceView = (TextView) itemView.findViewById(R.id.product_price);
        }
    }
}
