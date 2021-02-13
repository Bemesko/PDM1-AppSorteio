package com.ifsc.appsorteio;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    //Poderia extender Activity mas perderia retrocompatibilidade

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void randomNumber(View view){
        int initialValue=6, finalValue=10;

        int randomNumber = (new Random().nextInt(finalValue - initialValue + 1))+initialValue;
        Log.i("RandomValue", Integer.toString(randomNumber));
    }
}