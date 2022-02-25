package com.company.Practica;

import java.util.Objects;

public class LocalComercial extends Local {

    private String descripcion;

    public LocalComercial(Integer year, String direccion, Integer metrosCuadrados, Double precio, String descripcion) {
        super(year, direccion, metrosCuadrados, precio);
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public void mostrarPropiedad() {
        super.mostrarPropiedad();
        System.out.println("Estas llamando desde la clase LocalComercial");
    }

    @Override
    public void mostrarPrecioVenta() {
        System.out.println("Soy un LocalComercial que me dedico a " + this.descripcion + " y valgo " + this.getPrecio()+"€");
    }

    @Override
    public String toString() {
        return "LocalComercial{" + super.toString() +
                "descripcion='" + descripcion + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        LocalComercial that = (LocalComercial) o;
        return descripcion.equals(that.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), descripcion);
    }
}
