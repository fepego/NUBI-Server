package com.nubi.colecciones;


import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/**
 * Created by Felipe on 22/08/2016.
 */
@Entity
public class Usuario {
    @Id
    String idUsuario;
    String carrera;
    String password;


}
