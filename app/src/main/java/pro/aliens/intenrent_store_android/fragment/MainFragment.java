package pro.aliens.intenrent_store_android.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;

import pro.aliens.intenrent_store_android.R;
import pro.aliens.intenrent_store_android.Utils.DataGenerator;
import pro.aliens.intenrent_store_android.adapter.CategoryAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {

    private RecyclerView categoryRecycler;
    private CategoryAdapter categoryAdapter;
    private int categoryRowCount = 2;

    public static MainFragment instance(){
        MainFragment fragment = new MainFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        categoryRecycler = (RecyclerView) view.findViewById(R.id.category_recycler);
        categoryAdapter = new CategoryAdapter(DataGenerator.categories(),getActivity());

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getActivity(),categoryRowCount);
        categoryRecycler.setLayoutManager(layoutManager);
        categoryRecycler.setAdapter(categoryAdapter);

        return view;
    }



}
