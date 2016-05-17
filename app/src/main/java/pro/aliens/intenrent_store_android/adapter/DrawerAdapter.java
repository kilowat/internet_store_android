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
import pro.aliens.intenrent_store_android.model.DrawerItem;

/**
 * Created by razor on 12.05.2016.
 */
public class DrawerAdapter extends RecyclerView.Adapter<DrawerAdapter.DrawerViewHolder> {

    private ArrayList<DrawerItem> data = new ArrayList<>();
    private Context context;
    private LayoutInflater layoutInflater;

    public DrawerAdapter(Context context, ArrayList<DrawerItem> data) {

        this.context = context;
        this.data = data;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public DrawerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View container = layoutInflater.inflate(R.layout.drawer_list, parent, false);
        DrawerViewHolder holder = new DrawerViewHolder(container);
        return holder;
    }

    @Override
    public void onBindViewHolder(DrawerViewHolder holder, int position) {

        String name = data.get(position).getName();
        int image = data.get(position).getImage();
        holder.name.setText(name);
        holder.image.setImageResource(image);
    }

    @Override
    public int getItemCount() {

        return data.size();
    }

    public class DrawerViewHolder extends RecyclerView.ViewHolder {

        public TextView name;
        public ImageView image;

        public DrawerViewHolder(View itemView) {
            super(itemView);

            name = (TextView) itemView.findViewById(R.id.drawer_text);
            image = (ImageView) itemView.findViewById(R.id.drawer_ico);
        }
    }

}
