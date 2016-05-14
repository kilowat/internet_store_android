package pro.aliens.intenrent_store_android.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import pro.aliens.intenrent_store_android.R;
import pro.aliens.intenrent_store_android.Utils.DataGenerator;
import pro.aliens.intenrent_store_android.adapter.ProductAdater;

public class ProductListActivity extends BaseActivity {

    protected ProductAdater productAdater;
    protected RecyclerView productRecycler;
    protected int countRow = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);

        setUI();
        setSupportActionBar(toolbar);
        productRecycler = (RecyclerView) findViewById(R.id.product_list_recycler);
        productRecycler.setLayoutManager(new GridLayoutManager(this, countRow));
        productAdater = new ProductAdater(this, DataGenerator.products());
        productRecycler.setAdapter(productAdater);
    }
}
