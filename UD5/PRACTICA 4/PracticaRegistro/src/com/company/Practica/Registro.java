package com.company.Practica;

import java.util.Arrays;
import java.util.Comparator;

public class Registro  {
    Propiedad[] propiedades;

    public Registro() {
        this.propiedades = new Propiedad[0];
    }

    public Propiedad[] getPropiedadades() {
        return propiedades;
    }

    public void setPropiedadades(Propiedad[] propiedadades) {
        this.propiedades = propiedadades;
    }

    public boolean addPropiedad(Propiedad propiedadAnadida){
        Propiedad[] resultado = Arrays.copyOf(propiedades, propiedades.length+1);
        resultado[resultado.length-1] = propiedadAnadida;
        propiedades = resultado;
        return true;
    }
    private boolean estaPropiedad(Propiedad propiedad) {
        for (int i = 0; i < propiedades.length; i++) {
            if (propiedades[i].equals(propiedad)) {
                return true;
            }
        }
        return false;
    }

    public boolean deletePropiedad(Propiedad propiedad) {
        if (estaPropiedad(propiedad)) {
            Propiedad[] resultado = new Propiedad[0];
            for (int i = 0; i < propiedades.length; i++) {
                if (!propiedades[i].equals(propiedad)) {
                    resultado = Arrays.copyOf(propiedades, propiedades.length - 1);
                    resultado[resultado.length - 1] = propiedades[i];
                }
            }
            propiedades = resultado;
            return true;
        }
        return false;
    }

    public void informeSuperficie(){
        Arrays.sort(propiedades);
        System.out.println(Arrays.toString(propiedades));
    }
    public void informeAntiguedad(){
        Arrays.sort(propiedades, new Comparator<Propiedad>() {
            @Override
            public int compare(Propiedad p1, Propiedad p2) {
                if (p1.getYear()==p2.getYear()){
                    return p2.getMetrosCuadrados()-p1.getMetrosCuadrados();
                }
                return p1.getYear()-p2.getYear();
            }
        });
        System.out.println(Arrays.toString(propiedades));
    }

    @Override
    public String toString() {
        return "Registro{" +
                "propiedadades=" + Arrays.toString(propiedades) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Registro registro = (Registro) o;
        return Arrays.equals(propiedades, registro.propiedades);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(propiedades);
    }
}
