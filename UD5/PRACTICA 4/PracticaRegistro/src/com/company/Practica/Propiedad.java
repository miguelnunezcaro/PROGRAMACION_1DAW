package com.company.Practica;

import java.util.Objects;

public abstract class Propiedad implements Comparable<Propiedad> {

    private Integer year;
    private String direccion;
    private Integer metrosCuadrados;

    public Propiedad(Integer year, String direccion, Integer metrosCuadrados) {
        this.year = year;
        this.direccion = direccion;
        this.metrosCuadrados = metrosCuadrados;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(Integer metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public abstract void mostrarPropiedad();

    @Override
    public int compareTo(Propiedad propiedad) {
        return this.getMetrosCuadrados() - propiedad.getMetrosCuadrados();
    }

    @Override
    public String toString() {
        return "Propiedad{" +
                "year=" + year +
                ", direccion='" + direccion + '\'' +
                ", metrosCuadrados=" + metrosCuadrados +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Propiedad propiedad = (Propiedad) o;
        return year.equals(propiedad.year) && direccion.equals(propiedad.direccion) && metrosCuadrados.equals(propiedad.metrosCuadrados);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, direccion, metrosCuadrados);
    }
}
