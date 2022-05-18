package examen.ej2;

import java.util.Objects;

public class Plato {

    private String nombre;
    private Double precio;
    private Integer calorias;

    public Plato(String nombre, Double precio, Integer calorias) {
        this.nombre = nombre;
        this.precio = precio;
        this.calorias = calorias;
    }
    public Plato() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getCalorias() {
        return calorias;
    }

    public void setCalorias(Integer calorias) {
        this.calorias = calorias;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plato plato = (Plato) o;
        return nombre.equals(plato.nombre) && precio.equals(plato.precio) && calorias.equals(plato.calorias);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, precio, calorias);
    }

    @Override
    public String toString() {
        return "Plato{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", calorias=" + calorias +
                '}';
    }
}
