package com.company;

import java.util.Arrays;
import java.util.Objects;

public class Chirigota extends AgrupacionOficial implements Callejera {

    private String nombre;
    private String autorGeneral;
    private String autorMusica;
    private String autorLetras;
    private String tipo;
    private Integer numCuples;
    private Integer puntosObtenidos;

    public Chirigota(String nombre, String autorGeneral, String autorMusica,
                     String autorLetras, String tipo, Integer numCuples, Integer puntosObtenidos) {
        this.nombre = nombre;
        this.autorGeneral = autorGeneral;
        this.autorMusica = autorMusica;
        this.autorLetras = autorLetras;
        this.tipo = tipo;
        this.numCuples = numCuples;
        this.puntosObtenidos = puntosObtenidos;
        this.integrantes = new Integrante[0];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutorGeneral() {
        return autorGeneral;
    }

    public void setAutorGeneral(String autorGeneral) {
        this.autorGeneral = autorGeneral;
    }

    public String getAutorMusica() {
        return autorMusica;
    }

    public void setAutorMusica(String autorMusica) {
        this.autorMusica = autorMusica;
    }

    public String getAutorLetras() {
        return autorLetras;
    }

    public void setAutorLetras(String autorLetras) {
        this.autorLetras = autorLetras;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getNumCuples() {
        return numCuples;
    }

    public void setNumCuples(Integer numCuples) {
        this.numCuples = numCuples;
    }

    public Integer getPuntosObtenidos() {
        return puntosObtenidos;
    }

    public void setPuntosObtenidos(Integer puntosObtenidos) {
        this.puntosObtenidos = puntosObtenidos;
    }

    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación de la Chirigota con nombre " + getNombre());
    }

    @Override
    public void hacer_tipo() {
        System.out.println("La Chirigota " + getNombre() + " va de " + getTipo());
    }

    @Override
    public void insertar_integrante(Integrante integranteInsertado) {
        Integrante[] resultado = Arrays.copyOf(integrantes, integrantes.length + 1);
        resultado[resultado.length - 1] = integranteInsertado;
        integrantes = resultado;
    }

    @Override
    public Boolean esta_integrante(Integrante integrante) {
        for (int i = 0; i < integrantes.length; i++) {
            if (integrantes[i].equals(integrante)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Boolean eliminar_integrante(Integrante integrante) {
        if (esta_integrante(integrante)) {
            Integrante[] resultado = new Integrante[0];
            for (int i = 0; i < integrantes.length; i++) {
                if (!integrantes[i].equals(integrante)) {
                    resultado = Arrays.copyOf(resultado, resultado.length + 1);
                    resultado[resultado.length - 1] = integrantes[i];
                }
            }
            integrantes = resultado;
            return true;
        }
        return false;
    }

    @Override
    public void caminito_del_falla() {
        System.out.println("La Chirigota " + getNombre() + " va camino del falla");
    }

    @Override
    public void amo_a_escucha() {
        System.out.println("Amo a escucha la Chirigota " + getNombre());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chirigota chirigota = (Chirigota) o;
        return nombre.equals(chirigota.nombre) && autorGeneral.equals(chirigota.autorGeneral) && autorMusica.equals(chirigota.autorMusica) && autorLetras.equals(chirigota.autorLetras) && tipo.equals(chirigota.tipo) && numCuples.equals(chirigota.numCuples) && puntosObtenidos.equals(chirigota.puntosObtenidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, autorGeneral, autorMusica, autorLetras, tipo, numCuples, puntosObtenidos);
    }

    @Override
    public String toString() {
        return "Chirigota{" +
                "integrantes=" + Arrays.toString(integrantes) +
                ", nombre='" + nombre + '\'' +
                ", autorGeneral='" + autorGeneral + '\'' +
                ", autorMusica='" + autorMusica + '\'' +
                ", autorLetras='" + autorLetras + '\'' +
                ", tipo='" + tipo + '\'' +
                ", numCuples=" + numCuples +
                ", puntosObtenidos=" + puntosObtenidos +
                '}';
    }
}


