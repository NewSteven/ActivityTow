package com.example.implicit_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.Telephony;
import android.util.Log;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText EnviarTexto;
    private TextView TextoVista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EnviarTexto = (EditText)findViewById(R.id.EnviarTexto);

        TextoVista = (TextView)findViewById(R.id.TextoVista);
        String dato1 = getIntent().getStringExtra("dato1");
        TextoVista.setText((dato1));
    }

    // metodo boto siguiente actividad
    public void ActividadTow(View view){
        Intent actividadDos = new Intent(this, ActividadDos.class);
        actividadDos.putExtra("dato1", EnviarTexto.getText().toString());
        startActivity(actividadDos);
    }
}
