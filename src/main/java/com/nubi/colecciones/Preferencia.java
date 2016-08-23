package com.nubi.colecciones;

import org.mongodb.morphia.annotations.Entity;

/**
 * Created by Felipe on 23/08/2016.
 */
@Entity
public class Preferencia {

    private double tiempoMinimo;
    private double tiempoMaximo;
    private String Disponibilidad;
    private double distancia;
    private int frecuenciaNotificacion;
    private boolean notificaciones;

    public Preferencia() {
    }

    public Preferencia(double tiempoMinimo, double tiempoMaximo, String disponibilidad, double distancia, int frecuenciaNotificacion, boolean notificaciones) {
        this.tiempoMinimo = tiempoMinimo;
        this.tiempoMaximo = tiempoMaximo;
        Disponibilidad = disponibilidad;
        this.distancia = distancia;
        this.frecuenciaNotificacion = frecuenciaNotificacion;
        this.notificaciones = notificaciones;
    }

    public double getTiempoMinimo() {
        return tiempoMinimo;
    }

    public void setTiempoMinimo(double tiempoMinimo) {
        this.tiempoMinimo = tiempoMinimo;
    }

    public double getTiempoMaximo() {
        return tiempoMaximo;
    }

    public void setTiempoMaximo(double tiempoMaximo) {
        this.tiempoMaximo = tiempoMaximo;
    }

    public String getDisponibilidad() {
        return Disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        Disponibilidad = disponibilidad;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public int getFrecuenciaNotificacion() {
        return frecuenciaNotificacion;
    }

    public void setFrecuenciaNotificacion(int frecuenciaNotificacion) {
        this.frecuenciaNotificacion = frecuenciaNotificacion;
    }

    public boolean isNotificaciones() {
        return notificaciones;
    }

    public void setNotificaciones(boolean notificaciones) {
        this.notificaciones = notificaciones;
    }
}
