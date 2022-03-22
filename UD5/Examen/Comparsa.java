package com.company;

import java.util.Arrays;
import java.util.Objects;

public class Comparsa extends AgrupacionOficial {

    private String nombre;
    private String autorGeneral;
    private String autorMusica;
    private String autorLetras;
    private String tipo;
    private String empresaAtrezzo;
    private Integer puntosObtenidos;

    public Comparsa(String nombre, String autorGeneral, String autorMusica, String autorLetras,
                    String tipo, String empresaAtrezzo, Integer puntosObtenidos) {
        this.nombre = nombre;
        this.autorGeneral = autorGeneral;
        this.autorMusica = autorMusica;
        this.autorLetras = autorLetras;
        this.tipo = tipo;
        this.empresaAtrezzo = empresaAtrezzo;
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

    public String getEmpresaAtrezzo() {
        return empresaAtrezzo;
    }

    public void setEmpresaAtrezzo(String empresaAtrezzo) {
        this.empresaAtrezzo = empresaAtrezzo;
    }

    public Integer getPuntosObtenidos() {
        return puntosObtenidos;
    }

    public void setPuntosObtenidos(Integer puntosObtenidos) {
        this.puntosObtenidos = puntosObtenidos;
    }

    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación de la Comparsa con nombre " + getNombre());
    }

    @Override
    public void hacer_tipo() {
        System.out.println("La Comparsa " + getNombre() + " va de " + getTipo());
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
        System.out.println("La Comparsa " + getNombre() + " va camino del falla");

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comparsa comparsa = (Comparsa) o;
        return nombre.equals(comparsa.nombre) && autorGeneral.equals(comparsa.autorGeneral) && autorMusica.equals(comparsa.autorMusica) && autorLetras.equals(comparsa.autorLetras) && tipo.equals(comparsa.tipo) && empresaAtrezzo.equals(comparsa.empresaAtrezzo) && puntosObtenidos.equals(comparsa.puntosObtenidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, autorGeneral, autorMusica, autorLetras, tipo, empresaAtrezzo, puntosObtenidos);
    }

    @Override
    public String toString() {
        return "Comparsa{" +
                "nombre='" + nombre + '\'' +
                ", autorGeneral='" + autorGeneral + '\'' +
                ", autorMusica='" + autorMusica + '\'' +
                ", autorLetras='" + autorLetras + '\'' +
                ", tipo='" + tipo + '\'' +
                ", empresaAtrezzo='" + empresaAtrezzo + '\'' +
                ", puntosObtenidos=" + puntosObtenidos +
                '}';
    }
}
