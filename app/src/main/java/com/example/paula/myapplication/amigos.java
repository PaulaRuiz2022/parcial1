package com.example.paula.myapplication;

import static com.example.paula.myapplication.MainActivity.Ciudad;
import static com.example.paula.myapplication.MainActivity.Nombre;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.paula.myapplication.db.dbContactos;

import java.util.Random;

public class amigos extends AppCompatActivity {

    private TextView nomb;
    private TextView ciu;
    private TextView ed;
    private Button add;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amigos);

        nomb = findViewById(R.id.name);
        ciu = findViewById(R.id.city);
        ed = findViewById(R.id.age);
        edad r = new edad();
        add = findViewById(R.id.btnagregar);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbContactos database = new dbContactos(amigos.this);
                long id = database.insertarContacto(nomb.getText().toString(), ciu.getText().toString(), ed.getText().toString());

                if (id > 0) {
                    Toast.makeText(amigos.this, "Amigo agregado", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(amigos.this, "No se pudo agregar", Toast.LENGTH_LONG).show();

                }
            }
        });

        Bundle persona=getIntent().getExtras();
        TextView nombre = (TextView) findViewById(R.id.name);
        nombre.setText(persona.getString(Nombre));
        TextView ciudad = (TextView) findViewById(R.id.city);
        ciudad.setText(persona.getString(Ciudad));

        Random random = new Random();
        int numeroal = random.nextInt(6);

        int resultado = Integer.parseInt(r.factorial(numeroal, 1));
        ed.setText(Integer.toString(resultado));

    }
}