package com.example.lab2as;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText ilePrzeliczyc;
    private Button buttonUsd, buttonEur, buttonChf;
    private TextView wynik;
    private final double USD_TO_PLN = 3.99;
    private final double EUR_TO_PLN = 4.32;
    private final double CHF_TO_PLN = 4.53;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonUsd = findViewById(R.id.buttonUsd);
        buttonEur = findViewById(R.id.buttonEur);
        buttonChf = findViewById(R.id.buttonChf);

        buttonUsd.setOnClickListener(v -> countResult(USD_TO_PLN));
        buttonEur.setOnClickListener(v -> countResult(EUR_TO_PLN));
        buttonChf.setOnClickListener(v -> countResult(CHF_TO_PLN));
    }

    private void countResult(double currency) {
        ilePrzeliczyc = findViewById(R.id.ilePrzeliczyc);
        String string = ilePrzeliczyc.getText().toString();
        double amountToConvert  = Double.parseDouble(string);

       double result = amountToConvert * currency;

        wynik = findViewById(R.id.wynik);
        wynik.setText(String.valueOf(result));
    }
}