package com.ifsc.appsorteio;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Poderia extender Activity mas perderia retrocompatibilidade

    EditText txtLowValue, txtHighValue;
    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtLowValue=findViewById(R.id.editTextMinValue);
        txtHighValue=findViewById(R.id.editTextMaxValue);
        textViewResult = findViewById(R.id.textViewResult);
    }

    public void randomNumber(View view){
        int lowValue=0, highValue=0;

        lowValue = Integer.parseInt(txtLowValue.getText().toString());
        highValue = Integer.parseInt(txtHighValue.getText().toString());

        int randomNumber = (new Random().nextInt(highValue - lowValue + 1))+lowValue;
        Log.i("RandomValue", Integer.toString(randomNumber));

        textViewResult.setText(Integer.toString(randomNumber));
    }
}