package com.activityligfecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    @Override
    public void onStart() {

        Toast toast = Toast.makeText(getApplicationContext(),"start",LENGTH_SHORT);
        toast.show();
        super.onStart();
    }
    @Override
    public void onResume() {
        Toast toast = Toast.makeText(getApplicationContext(),"resume",LENGTH_SHORT);
        toast.show();

        super.onResume();
    }
    @Override
    public void onPause() {
        Toast toast = Toast.makeText(getApplicationContext(),"pause",LENGTH_SHORT);
        toast.show();
        super.onPause();
    }
    @Override
    public void onStop() {
        Toast toast = Toast.makeText(getApplicationContext(),"stop",LENGTH_SHORT);
        toast.show();
        super.onStop();
    }
    @Override
    public void onRestart() {
        Toast toast = Toast.makeText(getApplicationContext(),"Restart",LENGTH_SHORT);
        toast.show();
        super.onRestart();
    }
    @Override
    public void onDestroy() {
        Toast toast = Toast.makeText(getApplicationContext(),"destroy",LENGTH_SHORT);
        toast.show();
        super.onDestroy();
    }
}


