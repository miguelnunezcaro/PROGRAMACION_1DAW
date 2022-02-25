package com.company.Practica;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Objects;

public class Vivienda extends Propiedad implements PrecioVenta {

    private Integer numBathrooms;
    private Integer numHabitaciones;
    private Integer capacidadMax;
    private Double precio;
    private Persona[] numPersonas;

    public Vivienda(Integer year, String direccion, Integer metrosCuadrados, Integer numBathrooms, Integer numHabitaciones, Integer capacidadMax, Double precio) {
        super(year, direccion, metrosCuadrados);
        this.numBathrooms = numBathrooms;
        this.numHabitaciones = numHabitaciones;
        this.capacidadMax = capacidadMax;
        this.precio = precio;
        this.numPersonas = new Persona[0];
    }

    public Integer getNumBathrooms() {
        return numBathrooms;
    }

    public void setNumBathrooms(Integer numBathrooms) {
        this.numBathrooms = numBathrooms;
    }

    public Integer getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(Integer numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public Integer getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(Integer capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Persona[] getNumPersonas() {
        return numPersonas;
    }

    public void setNumPersonas(Persona[] numPersonas) {
        this.numPersonas = numPersonas;
    }

    public boolean addPersona(Persona personaAnadida) {
        if (numPersonas.length < capacidadMax && !estaPersona(personaAnadida)) {
            Persona[] resultado = Arrays.copyOf(numPersonas, numPersonas.length + 1);
            resultado[resultado.length - 1] = personaAnadida;
            numPersonas = resultado;
            return true;
        }
        return false;
    }

    private boolean estaPersona(Persona persona) {
        for (int i = 0; i < numPersonas.length; i++) {
            if (numPersonas[i].equals(persona)) {
                return true;
            }
        }
        return false;
    }

    public boolean deletePersona(Persona persona) {
        if (estaPersona(persona)) {
            Persona[] resultado = new Persona[0];
            for (int i = 0; i < numPersonas.length; i++) {
                if (!numPersonas[i].equals(persona)) {
                    resultado = Arrays.copyOf(numPersonas, numPersonas.length - 1);
                    resultado[resultado.length - 1] = numPersonas[i];
                }
            }
            numPersonas = resultado;
            return true;
        }
        return false;
    }

    @Override
    public void mostrarPropiedad() {
        System.out.println(Calendar.getInstance());
        System.out.println(toString());
        System.out.println("Estas llamando desde la clase Vivienda");
    }

    @Override
    public void mostrarPrecioVenta() {
        System.out.println("Soy una Vivienda con capacidad máxima " + this.capacidadMax + " y valgo " + this.precio +"€");
    }

    @Override
    public String toString() {
        return "Vivienda{" + super.toString() +
                "numBathrooms=" + numBathrooms +
                ", numHabitaciones=" + numHabitaciones +
                ", capacidadMax=" + capacidadMax +
                ", precio=" + precio +
                ", numPersonas=" + Arrays.toString(numPersonas) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Vivienda vivienda = (Vivienda) o;
        return numBathrooms.equals(vivienda.numBathrooms) && numHabitaciones.equals(vivienda.numHabitaciones) && capacidadMax.equals(vivienda.capacidadMax) && precio.equals(vivienda.precio) && Arrays.equals(numPersonas, vivienda.numPersonas);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(super.hashCode(), numBathrooms, numHabitaciones, capacidadMax, precio);
        result = 31 * result + Arrays.hashCode(numPersonas);
        return result;
    }
}
