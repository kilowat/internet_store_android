package pro.aliens.intenrent_store_android.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import pro.aliens.intenrent_store_android.R;
import pro.aliens.intenrent_store_android.Utils.DataGenerator;
import pro.aliens.intenrent_store_android.adapter.DrawerAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class DrawerFragment extends Fragment {



    public DrawerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_drawer, container, false);
        RecyclerView drawerRecycler = (RecyclerView) view.findViewById(R.id.drawer_recycler);
        DrawerAdapter adapter = new DrawerAdapter(getActivity(), DataGenerator.drawerItems());
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        drawerRecycler.setLayoutManager(layoutManager);
        drawerRecycler.setAdapter(adapter);
        return view;
    }



}
