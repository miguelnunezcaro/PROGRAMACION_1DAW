package com.company.Practica;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Objects;

public abstract class Local extends Propiedad implements PrecioVenta {

    private Persona[] personaPropietaria;
    private Double precio;

    public Local(Integer year, String direccion, Integer metrosCuadrados, Double precio) {
        super(year, direccion, metrosCuadrados);
        this.personaPropietaria = new Persona[0];
        this.precio = precio;
    }

    public Persona[] getPersonaPropietaria() {
        return personaPropietaria;
    }

    public void setPersonaPropietaria(Persona[] personaPropietaria) {
        this.personaPropietaria = personaPropietaria;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public void mostrarPropiedad() {
        System.out.println(Calendar.getInstance());
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Local{" + super.toString() +
                "personaPropietaria=" + Arrays.toString(personaPropietaria) +
                ", precio=" + precio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Local local = (Local) o;
        return Arrays.equals(personaPropietaria, local.personaPropietaria) && precio.equals(local.precio);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(precio);
        result = 31 * result + Arrays.hashCode(personaPropietaria);
        return result;
    }
}
