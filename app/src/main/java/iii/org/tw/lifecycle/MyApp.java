package iii.org.tw.lifecycle;

import android.app.Application;
import android.util.Log;

/**
 * Created by user on 2016/9/12.
 */
public class MyApp extends Application {
    private int a;
    private String b;
    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("Abner","MyApp");

        a = 10;
        b = "Abner";
    }
    int getA() {return a;}
    String getB() {return b;}
    void setA(int a) {this.a = a;}
    void setB(String b) {this.b = b;}
}
