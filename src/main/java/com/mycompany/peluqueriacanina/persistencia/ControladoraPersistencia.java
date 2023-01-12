package com.mycompany.peluqueriacanina.persistencia;

import com.mycompany.peluqueriacanina.logica.Duenio;
import com.mycompany.peluqueriacanina.logica.Mascota;

public class ControladoraPersistencia {
    
    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascoJpa = new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota masco) {
       
        //creando en la bd el dueño
        duenioJpa.create(duenio);
        
        //crear en la bd la mascota
        mascoJpa.create(masco);
        
        
        
        
    }
    
    
    
}
