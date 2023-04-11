package com.example.paula.myapplication;

import java.io.Serializable;

public class informacion implements Serializable{

    private String nombre;
    private String ciudad;

    informacion(){
        this.nombre="";
        this.ciudad="";
    }
    informacion(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
