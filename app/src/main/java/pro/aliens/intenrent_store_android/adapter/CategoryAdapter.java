package pro.aliens.intenrent_store_android.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

import pro.aliens.intenrent_store_android.R;
import pro.aliens.intenrent_store_android.model.Category;

/**
 * Created by Admin on 11.05.2016.
 */
public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder> {

    private ArrayList<Category> categories;
    private Context context;
    private LayoutInflater inflater;

    public CategoryAdapter(ArrayList<Category> categories, Context context) {

        this.categories = categories;
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public CategoryAdapter.CategoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View container = inflater.inflate(R.layout.category_list, parent, false);
        CategoryViewHolder holder = new CategoryViewHolder(container);

        return holder;
    }

    @Override
    public void onBindViewHolder(CategoryViewHolder holder, int position) {
        String categoryName = categories.get(position).getName();
        int categoryImage = categories.get(position).getImage();

        if(categoryName!=null){
            holder.categoryName.setText(categoryName);
        }
        if(categoryImage!=0){
            holder.categoryPicture.setImageResource(categoryImage);
        }
    }

    @Override
    public int getItemCount() {

        return categories.size();
    }

    class CategoryViewHolder extends RecyclerView.ViewHolder{

        TextView categoryName;
        ImageView categoryPicture;

        public CategoryViewHolder(View itemView) {
            super(itemView);

            categoryName = (TextView) itemView.findViewById(R.id.category_name);
            categoryPicture = (ImageView) itemView.findViewById(R.id.category_image);
        }
    }
}
