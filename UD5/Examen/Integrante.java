package com.company;

import java.util.Objects;

public class Integrante {

    private Integer numero_participante;
    private String nombre;
    private Integer edad;
    private String localidad;

    public Integrante(Integer numero_participante, String nombre, Integer edad, String localidad) {
        this.numero_participante = numero_participante;
        this.nombre = nombre;
        this.edad = edad;
        this.localidad = localidad;
    }

    public Integer getNumero_participante() {
        return numero_participante;
    }

    public void setNumero_participante(Integer numero_participante) {
        this.numero_participante = numero_participante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Integrante that = (Integrante) o;
        return numero_participante.equals(that.numero_participante) && nombre.equals(that.nombre) && edad.equals(that.edad) && localidad.equals(that.localidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero_participante, nombre, edad, localidad);
    }

    @Override
    public String toString() {
        return "Integrante{" +
                "numero_participante=" + numero_participante +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", localidad='" + localidad + '\'' +
                '}';
    }
}
