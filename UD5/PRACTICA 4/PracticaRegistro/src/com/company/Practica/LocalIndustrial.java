package com.company.Practica;

import java.util.Objects;

public class LocalIndustrial extends Local {

    private Integer consumoEnergetico;

    public LocalIndustrial(Integer year, String direccion, Integer metrosCuadrados, Double precio, Integer consumoEnergetico) {
        super(year, direccion, metrosCuadrados, precio);
        this.consumoEnergetico = consumoEnergetico;
    }

    public Integer getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(Integer consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    @Override
    public void mostrarPropiedad() {
        super.mostrarPropiedad();
        System.out.println("Estas llamando desde la clase LocalIndustrial");
    }

    @Override
    public void mostrarPrecioVenta() {
        System.out.println("Soy un LocalIndustrail con un consumo máximo de " + this.consumoEnergetico + " y valgo " + this.getPrecio() + "€");
    }

    @Override
    public String toString() {
        return "LocalIndustrial{" + super.toString() +
                "consumoEnergetico=" + consumoEnergetico +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        LocalIndustrial that = (LocalIndustrial) o;
        return consumoEnergetico.equals(that.consumoEnergetico);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), consumoEnergetico);
    }
}
