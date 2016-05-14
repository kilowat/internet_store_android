package pro.aliens.intenrent_store_android.activity;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import pro.aliens.intenrent_store_android.R;
import pro.aliens.intenrent_store_android.fragment.DrawerFragment;
import pro.aliens.intenrent_store_android.fragment.MainFragment;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUI();
        setSupportActionBar(toolbar);

    }


}
