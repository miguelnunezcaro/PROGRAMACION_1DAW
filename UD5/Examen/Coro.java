package com.company;

import java.util.Arrays;
import java.util.Objects;

public class Coro extends AgrupacionOficial {

    private String nombre;
    private String autorGeneral;
    private String autorMusica;
    private String autorLetras;
    private String tipo;
    private Integer numBandurrias;
    private Integer numGuitarras;
    private Integer puntosObtenidos;

    public Coro(String nombre, String autorGeneral, String autorMusica, String autorLetras, String tipo,
                Integer numBandurrias, Integer numGuitarras, Integer puntosObtenidos) {
        this.nombre = nombre;
        this.autorGeneral = autorGeneral;
        this.autorMusica = autorMusica;
        this.autorLetras = autorLetras;
        this.tipo = tipo;
        this.numBandurrias = numBandurrias;
        this.numGuitarras = numGuitarras;
        this.puntosObtenidos = puntosObtenidos;
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

    public Integer getNumBandurrias() {
        return numBandurrias;
    }

    public void setNumBandurrias(Integer numBandurrias) {
        this.numBandurrias = numBandurrias;
    }

    public Integer getNumGuitarras() {
        return numGuitarras;
    }

    public void setNumGuitarras(Integer numGuitarras) {
        this.numGuitarras = numGuitarras;
    }

    public Integer getPuntosObtenidos() {
        return puntosObtenidos;
    }

    public void setPuntosObtenidos(Integer puntosObtenidos) {
        this.puntosObtenidos = puntosObtenidos;
    }

    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación del Coro con nombre " + getNombre());
    }

    @Override
    public void hacer_tipo() {
        System.out.println("El Coro " + getNombre() + " va de " + getTipo());
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
        System.out.println("El Coro " + getNombre() + " va camino del falla");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coro coro = (Coro) o;
        return nombre.equals(coro.nombre) && autorGeneral.equals(coro.autorGeneral) && autorMusica.equals(coro.autorMusica) && autorLetras.equals(coro.autorLetras) && tipo.equals(coro.tipo) && numBandurrias.equals(coro.numBandurrias) && numGuitarras.equals(coro.numGuitarras) && puntosObtenidos.equals(coro.puntosObtenidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, autorGeneral, autorMusica, autorLetras, tipo, numBandurrias, numGuitarras, puntosObtenidos);
    }

    @Override
    public String toString() {
        return "Coro{" +
                "nombre='" + nombre + '\'' +
                ", autorGeneral='" + autorGeneral + '\'' +
                ", autorMusica='" + autorMusica + '\'' +
                ", autorLetras='" + autorLetras + '\'' +
                ", tipo='" + tipo + '\'' +
                ", numBandurrias=" + numBandurrias +
                ", numGuitarras=" + numGuitarras +
                ", puntosObtenidos=" + puntosObtenidos +
                '}';
    }
}
