package iii.org.tw.lifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Page2Activity extends AppCompatActivity {
    private TextView showText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        Log.d("Abner","Page2onCreate");

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        int stage = intent.getIntExtra("stage",2);
        boolean voice = intent.getBooleanExtra("voice",false);
        int temp = intent.getIntExtra("temp",0);

        showText = (TextView)findViewById(R.id.showText);

        showText.setText("name:" + name + "\n" +
                          "stage:" + stage + "\n" +
                          "voice:" + voice + "\n" +
                          "temp:" + temp);



    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Abner","Page2onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Abner","Page2onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Abner","Page2onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Abner","Page2onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Abner","Page2onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Abner","Page2onDestroy");
    }

}