package com.example.implicit_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.Telephony;
import android.util.Log;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

//   Intent intentEnviar = getIntent();
//   String mensaje = intentEnviar.getStringExtra(MainActivity.EXTRA_MESSAGE);
// textViewVista = findViewById(R.id.EnviarTexto);
// textViewVista.getText(mensaje);

    private EditText EnviarTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EnviarTexto = (EditText)findViewById(R.id.EnviarTexto);
    }

    // metodo boto siguiente actividad
    public void ActividadTow(View view){
        Intent actividadDos = new Intent(this, ActividadDos.class);
        actividadDos.putExtra("dato1", EnviarTexto.getText().toString());
        startActivity(actividadDos);
    }
}
