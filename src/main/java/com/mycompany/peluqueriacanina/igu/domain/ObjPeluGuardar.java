package com.mycompany.peluqueriacanina.igu.domain;

public class ObjPeluGuardar {

    private String raza;
    private String color;
    private String observaciones;
    private String alergico;
    private String atenEsp;
    private String nombreDuenio;
    private String celDuenio;
    private String nombre;

    public ObjPeluGuardar() {
    }

    public ObjPeluGuardar(String raza, String color, String observaciones, String alergico, String atenEsp, String nombreDuenio, String celDuenio, String nombre) {
        this.raza = raza;
        this.color = color;
        this.observaciones = observaciones;
        this.alergico = alergico;
        this.atenEsp = atenEsp;
        this.nombreDuenio = nombreDuenio;
        this.celDuenio = celDuenio;
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getAlergico() {
        return alergico;
    }

    public void setAlergico(String alergico) {
        this.alergico = alergico;
    }

    public String getAtenEsp() {
        return atenEsp;
    }

    public void setAtenEsp(String atenEsp) {
        this.atenEsp = atenEsp;
    }

    public String getNombreDuenio() {
        return nombreDuenio;
    }

    public void setNombreDuenio(String nombreDuenio) {
        this.nombreDuenio = nombreDuenio;
    }

    public String getCelDuenio() {
        return celDuenio;
    }

    public void setCelDuenio(String celDuenio) {
        this.celDuenio = celDuenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String armarApodoPelu(String nombre, String nombreDuenio){
        return nombre + "-" + nombreDuenio + "-" + "pelu";
    }

}
