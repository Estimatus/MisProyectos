package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;



public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar( String raza, String color, String observaciones, String alergico, String atenEsp, String nombreDuenio, String celDuenio, String nombre) {

        System.out.println("Iniciando Proceso de Guardar " );
        
        
        //creamos el dueño y asignamos sus valores
        Duenio duenio = new Duenio();
        duenio.setNombre(nombreDuenio);
        duenio.setCelDuenio(celDuenio);
        
        
        //creamos la mascota y asignamos sus valores 
        Mascota masco =  new Mascota ();
        masco.setAlergico(alergico);
        masco.setAtencion_especial(atenEsp);
        masco.setColor(color);
        masco.setNombre(nombre);
        masco.setObservaciones(observaciones);
        masco.setRaza(raza);
        masco.setUnDuenio(duenio);
        
        
        controlPersis.guardar(duenio,masco);


    }

    public void guardar(String raza, String color, String observaciones, String alergico, String atenEsp, String nombreDuenio, String celDuenio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
