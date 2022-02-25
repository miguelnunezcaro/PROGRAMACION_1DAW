package com.company.Practica;

import java.util.Calendar;
import java.util.Objects;

public class EquipamientoServicio extends Propiedad {

    private TipoServicio tipoServicio;

    public EquipamientoServicio(Integer year, String direccion, Integer metrosCuadrados, TipoServicio tipoServicio) {
        super(year, direccion, metrosCuadrados);
        this.tipoServicio = tipoServicio;
    }

    public TipoServicio getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(TipoServicio tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    @Override
    public void mostrarPropiedad() {
        System.out.println(Calendar.getInstance());
        System.out.println(toString());
        System.out.println("Estas llamando desde la clase EquipamientoServicio");
    }

    @Override
    public String toString() {
        return "EquipamientoServicio{" + super.toString() +
                "tipoServicio=" + tipoServicio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        EquipamientoServicio that = (EquipamientoServicio) o;
        return tipoServicio == that.tipoServicio;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tipoServicio);
    }
}
