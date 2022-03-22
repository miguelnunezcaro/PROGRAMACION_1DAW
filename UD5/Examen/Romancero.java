package com.company;

import java.util.Objects;

public class Romancero extends Agrupacion implements Callejera {

    private String nombre;
    private String autorGeneral;
    private String autorMusica;
    private String autorLetras;
    private String tipo;
    private String tematica;

    public Romancero(String nombre, String autorGeneral, String autorMusica, String autorLetras,
                     String tipo, String tematica) {
        this.nombre = nombre;
        this.autorGeneral = autorGeneral;
        this.autorMusica = autorMusica;
        this.autorLetras = autorLetras;
        this.tipo = tipo;
        this.tematica = tematica;
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

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación del Romancero con nombre " + getNombre());
    }

    @Override
    public void hacer_tipo() {
        System.out.println("El Romancero " + getNombre() + " va de " + getTipo());
    }

    @Override
    public void amo_a_escucha() {
        System.out.println("Amo a escucha el Romancero " + getNombre());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Romancero romancero = (Romancero) o;
        return nombre.equals(romancero.nombre) && autorGeneral.equals(romancero.autorGeneral) && autorMusica.equals(romancero.autorMusica) && autorLetras.equals(romancero.autorLetras) && tipo.equals(romancero.tipo) && tematica.equals(romancero.tematica);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, autorGeneral, autorMusica, autorLetras, tipo, tematica);
    }

    @Override
    public String toString() {
        return "Romancero{" +
                "nombre='" + nombre + '\'' +
                ", autorGeneral='" + autorGeneral + '\'' +
                ", autorMusica='" + autorMusica + '\'' +
                ", autorLetras='" + autorLetras + '\'' +
                ", tipo='" + tipo + '\'' +
                ", tematica='" + tematica + '\'' +
                '}';
    }
}
