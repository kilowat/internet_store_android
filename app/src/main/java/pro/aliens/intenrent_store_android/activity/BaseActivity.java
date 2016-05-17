package pro.aliens.intenrent_store_android.activity;

import android.content.Intent;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.support.v4.app.FragmentManager;
import android.widget.TextView;

import pro.aliens.intenrent_store_android.R;
import pro.aliens.intenrent_store_android.fragment.DrawerFragment;

public class BaseActivity extends AppCompatActivity {

    protected Toolbar toolbar;
    protected DrawerLayout mDrawerLayout;
    protected ActionBarDrawerToggle mDrawerToggle;
    public  View cartAction;

    public void setUI(){
        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        DrawerFragment drawerFragment = (DrawerFragment) getSupportFragmentManager().findFragmentById(R.id.drawer_nav_drawer_fragment);
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        setUp(R.id.drawer_nav_drawer_fragment, drawerLayout, toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        MenuItem cartItem = menu.findItem(R.id.action_cart);
        MenuItemCompat.setActionView(cartItem,R.layout.cart_count);
        cartAction = MenuItemCompat.getActionView(cartItem);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (mDrawerToggle.onOptionsItemSelected(item)) {
           return true;
        }

        switch(id){
            case R.id.product_list_menu_id:

                break;

        }

        return super.onOptionsItemSelected(item);
    }

    public void setUp(int drawer_nav_drawer_fragment, DrawerLayout drawerLayout, Toolbar toolbar) {
        mDrawerLayout = drawerLayout;
        mDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.drawer_open, R.string.drawer_close){
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                invalidateOptionsMenu();
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
                invalidateOptionsMenu();
            }
        };

        mDrawerLayout.addDrawerListener(mDrawerToggle);
        mDrawerLayout.post(new Runnable() {
            @Override
            public void run() {
                mDrawerToggle.syncState();
            }
        });
    }

    public void setCartBage(int count){
        TextView cartActionCount = (TextView) cartAction.findViewById(R.id.cart_count_product);
        cartActionCount.setText(String.valueOf(count));
    }
}
