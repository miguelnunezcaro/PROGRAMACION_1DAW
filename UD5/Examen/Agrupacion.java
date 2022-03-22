package com.company;

import java.util.Comparator;

public abstract class Agrupacion extends COAC {

    private static Integer contador = 1;

    public Agrupacion() {
        this.contador = contador;
        contador++;
    }

    public static Integer getContador() {
        return contador;
    }

    public static void setContador(Integer contador) {
        Agrupacion.contador = contador;
    }

    public abstract void cantar_la_presentacion();

    public abstract void hacer_tipo();
}
