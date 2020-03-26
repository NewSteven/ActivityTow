package com.example.implicit_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ActividadDos extends AppCompatActivity {

    private EditText EnviarTextoTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_dos);
    }

    //metodo regresar actividad
    public void ActividadUno(View view){
        Intent actividad_uno = new Intent(this, ActividadDos.class);
        actividad_uno.putExtra("dato1", EnviarTextoTwo.getText().toString());
        startActivity(actividad_uno);
    }
}
