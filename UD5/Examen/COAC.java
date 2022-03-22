package com.company;

import java.util.Arrays;

public class COAC {

    private AgrupacionOficial[] agrupaciones;

    public COAC() {
        this.agrupaciones = new AgrupacionOficial[0];
    }

    public AgrupacionOficial[] getAgrupaciones() {
        return agrupaciones;
    }

    public void setAgrupaciones(AgrupacionOficial[] agrupaciones) {
        this.agrupaciones = agrupaciones;
    }

    public void inscribir_agrupacion(AgrupacionOficial agrupacionInscrita) {
        AgrupacionOficial[] resultado = Arrays.copyOf(agrupaciones, agrupaciones.length + 1);
        resultado[resultado.length - 1] = agrupacionInscrita;
        agrupaciones = resultado;
    }

    public Boolean esta_agrupacion(AgrupacionOficial agrupacionOficial) {
        for (int i = 0; i < agrupaciones.length; i++) {
            if (agrupaciones[i].equals(agrupacionOficial)) {
                return true;
            }
        }
        return false;
    }

    public Boolean eliminar_agrupacion(AgrupacionOficial agrupacionOficial) {
        if (esta_agrupacion(agrupacionOficial)) {
            AgrupacionOficial[] resultado = new AgrupacionOficial[0];
            for (int i = 0; i < agrupaciones.length; i++) {
                if (!agrupaciones[i].equals(agrupacionOficial)) {
                    resultado = Arrays.copyOf(resultado, resultado.length + 1);
                    resultado[resultado.length - 1] = agrupaciones[i];
                }
            }
            agrupaciones = resultado;
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        COAC coac = (COAC) o;
        return Arrays.equals(agrupaciones, coac.agrupaciones);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(agrupaciones);
    }

    @Override
    public String toString() {
        return "COAC{" +
                "agrupaciones=" + Arrays.toString(agrupaciones) +
                '}';
    }
}
