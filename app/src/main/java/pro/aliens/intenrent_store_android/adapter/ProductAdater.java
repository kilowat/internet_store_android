package pro.aliens.intenrent_store_android.adapter;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import pro.aliens.intenrent_store_android.R;
import pro.aliens.intenrent_store_android.model.Product;

/**
 * Created by Admin on 13.05.2016.
 */
public class ProductAdater extends RecyclerView.Adapter<ProductAdater.ProductViewHolder>  {

    private LayoutInflater layoutInflater;
    private Context context;
    private ArrayList<Product> products = new ArrayList<>();
    private OnProductClickListener onProductClickListener;


    public ProductAdater(Context context, ArrayList<Product> products) {
        this.context = context;
        this.products = products;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = layoutInflater.inflate(R.layout.product_list, parent, false);
        Button addToCard = (Button) view.findViewById(R.id.add_to_cart);

        final ProductViewHolder productViewHolder = new ProductViewHolder(view);

        addToCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(onProductClickListener!=null) {
                    Product curProduct = products.get(productViewHolder.getAdapterPosition());
                    onProductClickListener.onClick(v, curProduct);
                }
            }
        });

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


    public void setOnClickListener(OnProductClickListener onProductClickListener){

        this.onProductClickListener = onProductClickListener;
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

    public interface OnProductClickListener{
        public void onClick(View view, Product product);
    }
}
