package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.igu.domain.ObjPeluGuardar;
import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;



public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(ObjPeluGuardar objPeluGuardar) {

        System.out.println("Iniciando Proceso de Guardar " );
        //creamos el dueño y asignamos sus valores
        Duenio duenio = new Duenio();
        duenio.setNombre(objPeluGuardar.getNombreDuenio());
        duenio.setCelDuenio(objPeluGuardar.getCelDuenio());
        
        
        //creamos la mascota y asignamos sus valores 
        Mascota masco =  new Mascota ();
        masco.setAlergico(objPeluGuardar.getAlergico());
        masco.setAtencion_especial(objPeluGuardar.getAtenEsp());
        masco.setColor(objPeluGuardar.getColor());
        masco.setNombre(objPeluGuardar.getNombre());
        masco.setObservaciones(objPeluGuardar.getObservaciones());
        masco.setRaza(objPeluGuardar.getRaza());
        masco.setUnDuenio(duenio);

//        String apodo = objPeluGuardar.armarApodoPelu(objPeluGuardar.getNombre(), objPeluGuardar.getNombreDuenio());
        
        controlPersis.guardar(duenio,masco);
//        controlPersis.guardarApodo(apodo);

    }

    public void guardar(String raza, String color, String observaciones, String alergico, String atenEsp, String nombreDuenio, String celDuenio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
