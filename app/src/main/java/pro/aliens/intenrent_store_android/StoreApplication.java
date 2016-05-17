package pro.aliens.intenrent_store_android;

import android.app.Application;
import android.content.Context;

/**
 * Created by Admin on 17.05.2016.
 */
public class StoreApplication extends Application {

    private static StoreApplication instance;

    public static StoreApplication getInstance(){
        return instance;
    }

    public static Context getAppContext(){
        return instance.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }
}
