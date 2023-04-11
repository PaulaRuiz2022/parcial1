package com.example.paula.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public static final String Nombre = "nombre";
    public static final String Ciudad = "ciudad";

    private EditText user;
    private EditText pass;
    private Button ing;
    private informacion agregar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user=findViewById(R.id.usuario);
        pass =findViewById(R.id.contrasena);
        ing=findViewById(R.id.ingresar);
        agregar= new informacion("Paula","Bogota");

        ing.setOnClickListener(view -> {
            String información1 = agregar.getNombre();
            String informacion2 = agregar.getCiudad();

            if(user.getText().toString().equals("Paula") && pass.getText().toString().equals("20123014")) {
                Intent ingresar = new Intent(this, amigos.class);
                Bundle persona = new Bundle();
                persona.putString(Nombre, información1);
                persona.putString(Ciudad, informacion2);
                ingresar.putExtras(persona);
                startActivity(ingresar);
                Toast.makeText(MainActivity.this, "¡Bienvenido nuevamente!", Toast.LENGTH_LONG).show();
            }else{
                Toast.makeText(MainActivity.this,"Usuario no válido",Toast.LENGTH_SHORT).show();
            }
        });
    }
}