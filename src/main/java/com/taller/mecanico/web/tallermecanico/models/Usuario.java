package com.taller.mecanico.web.tallermecanico.models;

public class Usuario {
    private String nombre;
    private String rol;
    private int ci;

    public Usuario(String nombre, String rol, int ci) {
        this.nombre = nombre;
        this.rol = rol;
        this.ci = ci;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getRol() {
        return rol;
    }
    public void setRol(String rol) {
        this.rol = rol;
    }
    public int getCi() {
        return ci;
    }
    public void setCi(int ci) {
        this.ci = ci;
    }
    

}
