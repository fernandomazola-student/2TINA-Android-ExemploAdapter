package br.com.fiap.exemplodeadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Atribuindo valor para ele, ATRELANDO XML com a ACTIVITY
        spinner = (Spinner)findViewById(R.id.spinner);
        //Criamos o adaptador e falamos que ele vai usar aquele layout de combobox e falando que dentro dele tem os cursos
        String[] cursos = {"TIN", "TDS", "TRC", "SI", "ADM", "EC", "EP"};
        ArrayAdapter<String>adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, cursos);
        spinner.setAdapter(adapter);

    }
}
