package com.company.Practica;

import java.util.Objects;

public class Persona {

    private String nif;
    private String nombre;
    private String apellidos;
    private Integer identificador;
    private static Integer contador = 1;

    public Persona(String nif, String nombre, String apellidos) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.identificador = contador;
        contador++;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public static Integer getContador() {
        return contador;
    }

    public static void setContador(Integer contador) {
        Persona.contador = contador;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nif='" + nif + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", identificador=" + identificador +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return nif.equals(persona.nif) && identificador.equals(persona.identificador);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, identificador);
    }
}
