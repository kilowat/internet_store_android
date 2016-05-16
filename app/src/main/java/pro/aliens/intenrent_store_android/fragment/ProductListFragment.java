package pro.aliens.intenrent_store_android.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import pro.aliens.intenrent_store_android.R;
import pro.aliens.intenrent_store_android.adapter.ProductAdater;
import pro.aliens.intenrent_store_android.model.Product;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProductListFragment extends Fragment {


    public ProductListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_product_list, container, false);

        // Inflate the layout for this fragment
        return view;
    }
}
