package com.centec.appimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvResultado;
    EditText etPeso, etAltura;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResultado = findViewById(R.id.tvResultado);
        etPeso = findViewById(R.id.etPeso);
        etAltura = findViewById(R.id.etAltura);
    }

    public void calcularIMC(View view){
        String peso = etPeso.getText().toString();
        String altura = etAltura.getText().toString();

        double pesoNew = Double.parseDouble(peso);
        double alturaNew = Double.parseDouble(altura);

        double imc = pesoNew/(alturaNew*alturaNew);

        if(imc<18.5){
            tvResultado.setText(String.format("Abaixo do Peso"));
        } else if (imc<24.9) {
            tvResultado.setText(String.format("Peso Ideal"));
        } else if (imc<29.9) {
            tvResultado.setText(String.format("Acima do Peso"));
        } else if (imc<34.9) {
            tvResultado.setText(String.format("Obesidade Grau I"));
        } else if (imc<39.9) {
            tvResultado.setText(String.format("Obesidade Grau II"));
        }else {
            tvResultado.setText(String.format("Obesidade Grau III"));
        }

    }
}