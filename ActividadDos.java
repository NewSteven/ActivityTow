package com.example.implicit_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ActividadDos extends AppCompatActivity {

    private EditText EnviarTextoTwo;
    private TextView TextoVista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_dos);

        EnviarTextoTwo = (EditText)findViewById(R.id.EnviarTexto2);

        TextoVista = (TextView)findViewById(R.id.TextoVista2);
        String vista1 = getIntent().getStringExtra("vista1");
        TextoVista.setText((vista1));
    }

    //metodo regresar actividad
    public void ActividadUno(View view){
        Intent actividad_uno = new Intent(this, MainActivity.class);
        actividad_uno.putExtra("vista2", EnviarTextoTwo.getText().toString());
        startActivity(actividad_uno);
    }
}

