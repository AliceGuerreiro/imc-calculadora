package com.example.imccalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textResultado;
    private EditText editPeso, editAltura;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textResultado = findViewById(R.id.textResultado);
        editPeso = findViewById(R.id.editPeso);
        editAltura = findViewById(R.id.editAltura);


    }

    public void Calcular(View view) {

        double peso = Double.parseDouble(editPeso.getText().toString());
        double altura = Double.parseDouble(editAltura.getText().toString());
        double resultado = peso / (altura * altura);

        if (resultado < 19){

            textResultado.setText("Abaixo do peso");


        }else if ( resultado <19 || resultado <25){

            textResultado.setText("Peso normal");


        }else if ( resultado <=25 || resultado <30){

            textResultado.setText("Sobrepeso");


        }else if ( resultado <=30 || resultado <40){

            textResultado.setText("Obesidade tipo 1");


        }else if ( resultado >= 40){

            textResultado.setText("Obesidade tipo 2");


        }





    }


}