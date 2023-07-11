package com.centec.appalcoolgasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvResultado;
    EditText etAlcool, etGasolina;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResultado = findViewById(R.id.tvResultado);
        etAlcool = findViewById(R.id.etAlcool);
        etGasolina = findViewById(R.id.etGasolina);


    }

    public void calcular(View view){
        String alcool=etAlcool.getText().toString();
        String gasolina=etGasolina.getText().toString();

        double precoA=Double.parseDouble(alcool);
        double precoG=Double.parseDouble(gasolina);

        double resultado = precoA/precoG;

        if(resultado<=0.7){
            tvResultado.setText(String.format("Álcool."));
        }else{
            tvResultado.setText(String.format("Gasolina é melhor."));
        }



    }
}