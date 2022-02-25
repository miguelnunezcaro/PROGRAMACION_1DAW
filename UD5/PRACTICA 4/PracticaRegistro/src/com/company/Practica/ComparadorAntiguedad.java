package com.company.Practica;

import java.util.Comparator;

public class ComparadorAntiguedad implements Comparator<Propiedad> {
    @Override
    public int compare(Propiedad p1, Propiedad p2) {
        if (p1.getYear()!=p2.getYear()){
            return p1.getYear().compareTo(p2.getYear());
        }
        return p1.getMetrosCuadrados().compareTo(p2.getMetrosCuadrados());
    }
}
