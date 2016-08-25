package com.nubi.controlador;

import com.nubi.colecciones.Restaurante;
import com.nubi.colecciones.SitiosEstudio;
import com.nubi.colecciones.Usuario;

import java.util.List;

/**
 * Created by Felipe on 23/08/2016.
 */
public class Candidato {
    private Restaurante restaurante;
    private SitiosEstudio sitio;
    private Usuario usuario;
    private double distancia;
    private double puntaje;

    public Candidato() {
    }

    public Candidato(Restaurante restaurantes, Usuario usuario, double distancia, double puntaje) {
        this.restaurante = restaurantes;
        this.usuario = usuario;
        this.distancia = distancia;
        this.puntaje = puntaje;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurantes) {
        this.restaurante = restaurantes;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }
}
