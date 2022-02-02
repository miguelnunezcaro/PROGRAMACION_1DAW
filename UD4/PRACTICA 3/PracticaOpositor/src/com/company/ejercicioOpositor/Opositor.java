package com.company.ejercicioOpositor;

import java.util.Objects;

public class Opositor {

    private String nombre;
    private String apellidos;
    private Integer anoNacimiento;
    private Boolean adaptacion;
    private String descripcionAdaptacion;

    public Opositor(String nombre, String apellidos, Integer anoNacimiento, Boolean adaptacion, String descripcionAdaptacion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.anoNacimiento = anoNacimiento;
        this.adaptacion = adaptacion;
        if (adaptacion == false) {
            this.descripcionAdaptacion = null;
        } else {
            this.descripcionAdaptacion = descripcionAdaptacion;
        }
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

    public Integer getAnoNacimiento() {
        return anoNacimiento;
    }

    public void setAnoNacimiento(Integer anoNacimiento) {
        this.anoNacimiento = anoNacimiento;
    }

    public Boolean getAdaptacion() {
        return adaptacion;
    }

    public void setAdaptacion(Boolean adaptacion) {
        this.adaptacion = adaptacion;
    }

    public String getDescripcionAdaptacion() {
        return descripcionAdaptacion;
    }

    public void setDescripcionAdaptacion(String descripcionAdaptacion) {
        this.descripcionAdaptacion = descripcionAdaptacion;
    }
    public void mostrarInformacion(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Opositor{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", anoNacimiento=" + anoNacimiento +
                ", adaptacion=" + adaptacion +
                ", descripcionAdaptacion='" + descripcionAdaptacion + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Opositor opositor = (Opositor) o;
        return nombre.equals(opositor.nombre) && apellidos.equals(opositor.apellidos) && anoNacimiento.equals(opositor.anoNacimiento) && adaptacion.equals(opositor.adaptacion) && descripcionAdaptacion.equals(opositor.descripcionAdaptacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellidos, anoNacimiento, adaptacion, descripcionAdaptacion);
    }
}
