package com.example.johannesholzl.sw_eng_ii_divisionsrechner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText dividend;
    EditText divisor;
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dividend = (EditText) findViewById(R.id.dividendTV);
        divisor = (EditText) findViewById(R.id.divisorTV);
        output = (TextView) findViewById(R.id.outputText);
    }

    public void onClickButton(View view){
        String toOutput = "";


        try {
            double d0 = Double.parseDouble(dividend.getText().toString());

            double d1 = Double.parseDouble(divisor.getText().toString());
            if(d1 != 0){
                toOutput += d0/d1;
            }else{
                toOutput = "Division durch 0!";
            }
        }catch(Exception e){
            toOutput = "Ungültige Eingabe!";
        }

        output.setText(toOutput);
    }
}
