package br.com.fiap.exemplodeadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] cursos = {"TIN", "TDS", "TRC", "SI", "ADM", "EC", "EP"};
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Atribuindo valor para ele, ATRELANDO XML com a ACTIVITY
        spinner = (Spinner)findViewById(R.id.spinner);
        //Criamos o adaptador e falamos que ele vai usar aquele layout de combobox e falando que dentro dele tem os cursos
        //String[] cursos = {"TIN", "TDS", "TRC", "SI", "ADM", "EC", "EP"};
        ArrayAdapter<String>adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, cursos);
        spinner.setAdapter(adapter);
        /*FORMA ERRADA, QUE EU FIZ
        long curso = spinner.getSelectedItemId();
        String nomeCurso = cursos[(int)curso];
        Toast.makeText(this, nomeCurso, Toast.LENGTH_SHORT).show();*/

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, cursos[position], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }


}
