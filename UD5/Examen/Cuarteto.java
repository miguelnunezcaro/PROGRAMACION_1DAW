package com.company;

import java.util.Arrays;
import java.util.Objects;

public class Cuarteto extends AgrupacionOficial implements Callejera {

    private String nombre;
    private String autorGeneral;
    private String autorMusica;
    private String autorLetras;
    private String tipo;
    private Integer numMiembros;
    private Integer puntosObtenidos;

    public Cuarteto(String nombre, String autorGeneral, String autorMusica, String autorLetras,
                    String tipo, Integer numMiembros, Integer puntosObtenidos) {
        this.nombre = nombre;
        this.autorGeneral = autorGeneral;
        this.autorMusica = autorMusica;
        this.autorLetras = autorLetras;
        this.tipo = tipo;
        this.numMiembros = numMiembros;
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

    public Integer getNumMiembros() {
        return numMiembros;
    }

    public void setNumMiembros(Integer numMiembros) {
        this.numMiembros = numMiembros;
    }

    public Integer getPuntosObtenidos() {
        return puntosObtenidos;
    }

    public void setPuntosObtenidos(Integer puntosObtenidos) {
        this.puntosObtenidos = puntosObtenidos;
    }

    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación del Cuarteto con nombre " + getNombre());
    }

    @Override
    public void hacer_tipo() {
        System.out.println("El Cuarteto " + getNombre() + " va de " + getTipo());
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
        System.out.println("El Cuarteto " + getNombre() + " va camino del falla");
    }

    @Override
    public void amo_a_escucha() {
        System.out.println("Amo a escucha el Cuarteto " + getNombre());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cuarteto cuarteto = (Cuarteto) o;
        return nombre.equals(cuarteto.nombre) && autorGeneral.equals(cuarteto.autorGeneral) && autorMusica.equals(cuarteto.autorMusica) && autorLetras.equals(cuarteto.autorLetras) && tipo.equals(cuarteto.tipo) && numMiembros.equals(cuarteto.numMiembros) && puntosObtenidos.equals(cuarteto.puntosObtenidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, autorGeneral, autorMusica, autorLetras, tipo, numMiembros, puntosObtenidos);
    }

    @Override
    public String toString() {
        return "Cuarteto{" +
                "nombre='" + nombre + '\'' +
                ", autorGeneral='" + autorGeneral + '\'' +
                ", autorMusica='" + autorMusica + '\'' +
                ", autorLetras='" + autorLetras + '\'' +
                ", tipo='" + tipo + '\'' +
                ", numMiembros=" + numMiembros +
                ", puntosObtenidos=" + puntosObtenidos +
                '}';
    }
}
