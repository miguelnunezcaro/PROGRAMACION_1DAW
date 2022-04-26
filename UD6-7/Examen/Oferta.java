package Examen;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Oferta implements Serializable {

    private Integer codigoOfert;
    private String descripcion;
    private Map<String, Set<Trabajador>> mapaTrabajadores;
    private Boolean ofertaCubierta;

    public Oferta(Integer codigoOfertOfert, String descripcion, Boolean ofertaCubierta) {
        this.codigoOfert = codigoOfert;
        this.descripcion = descripcion;
        this.mapaTrabajadores = new HashMap<>();
        this.ofertaCubierta = ofertaCubierta;
    }

    public Integer getcodigoOfert() {
        return codigoOfert;
    }

    public void setcodigoOfert(Integer codigoOfert) {
        this.codigoOfert = codigoOfert;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Map<String, Set<Trabajador>> getMapaTrabajadores() {
        return mapaTrabajadores;
    }

    public void setMapaTrabajadores(Map<String, Set<Trabajador>> mapaTrabajadores) {
        this.mapaTrabajadores = mapaTrabajadores;
    }

    public Boolean getOfertaCubierta() {
        return ofertaCubierta;
    }

    public void setOfertaCubierta(Boolean ofertaCubierta) {
        this.ofertaCubierta = ofertaCubierta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Oferta oferta = (Oferta) o;
        return codigoOfert.equals(oferta.codigoOfert);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoOfert);
    }

    @Override
    public String toString() {
        return "Oferta{" +
                "codigoOfert=" + codigoOfert +
                ", descripcion='" + descripcion + '\'' +
                ", mapaTrabajadores=" + mapaTrabajadores +
                ", ofertaCubierta=" + ofertaCubierta +
                '}';
    }
}
