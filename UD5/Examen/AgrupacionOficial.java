package com.company;

import java.util.Arrays;

public abstract class AgrupacionOficial extends Agrupacion {

    protected Integrante[] integrantes;

    public AgrupacionOficial() {
        this.integrantes = new Integrante[0];
    }

    public Integrante[] getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(Integrante[] integrantes) {
        this.integrantes = integrantes;
    }

    public abstract void insertar_integrante(Integrante integranteInsertado);

    public abstract Boolean esta_integrante(Integrante integrante);

    public abstract Boolean eliminar_integrante(Integrante integrante);

    public abstract void caminito_del_falla();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AgrupacionOficial that = (AgrupacionOficial) o;
        return Arrays.equals(integrantes, that.integrantes);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(integrantes);
    }

    @Override
    public String toString() {
        return "AgrupacionOficial{" +
                "integrantes=" + Arrays.toString(integrantes) +
                '}';
    }
}
