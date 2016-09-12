package iii.org.tw.lifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private MyApp myApp;
    public MainActivity() {
        Log.d("Abner","MainActivity");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Abner","onCreate");

        myApp = (MyApp) getApplication();
        Log.d("Abner","a=" + myApp.getA());
        Log.d("Abner","b=" + myApp.getB());
        myApp.setA(123456);
        myApp.setB("III");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Abner","onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Abner","onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Abner","onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Abner","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Abner","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Abner","onDestroy");
    }


    //-----傳參數到下一個頁面
    public void goToPage2(View v) {
        Intent intent = new Intent(this , Page2Activity.class);
        intent.putExtra("name","Abner");
        intent.putExtra("stage",5);
        intent.putExtra("voice",false);
        startActivity(intent);
    }

    //-----傳參數到下一個頁面，有回傳
    public void goToPage2v2(View v) {
        Intent intent = new Intent(this , Page2Activity.class);
        intent.putExtra("name","Abner");
        intent.putExtra("stage",5);
        intent.putExtra("voice",false);

        startActivityForResult(intent,87);
    }

    public void goToPage3v2(View v) {
        Intent intent = new Intent(this , Page3Activity.class);
        startActivityForResult(intent,107);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==87) {
            Log.d("Abner", "Page2onActivityResult:" + resultCode);
            int a = data.getIntExtra("a", -1);
            int b = data.getIntExtra("b", -1);
            Log.d("Abner", "a=" + a + "b=" + b);
        } else if (requestCode==107) {
            Log.d("Abner", "Page3 Back:");
        }
    }

    public void exit(View v) {
        finish();
    }

    @Override
    public void finish() {
        super.finish();
        Log.d("Abner","finish");
    }
}
