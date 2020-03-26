package com.example.implicit_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText TextoVista1;
    private TextView TextoVista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextoVista1 = (EditText)findViewById(R.id.EnviarTexto);

        TextoVista = (TextView)findViewById(R.id.textView1);
        String vista2 = getIntent().getStringExtra("vista2");
        TextoVista.setText((vista2));
    }

    //metodo regresar actividad
    public void ActividadTow(View view){
        Intent actividadDos = new Intent(this, ActividadDos.class);
        actividadDos.putExtra("vista1", TextoVista1.getText().toString());
        startActivity(actividadDos);
    }
}
