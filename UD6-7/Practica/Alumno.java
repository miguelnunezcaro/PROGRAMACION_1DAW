package com.company.Practica;

import java.io.Serializable;
import java.util.Objects;

public class Alumno implements Serializable {

    private String nombre;
    private String apellidos;
    private String direccion;
    private String dni;
    private String email;
    private String curso;
    private Boolean dual;

    public Alumno(String nombre, String apellidos, String direccion,
                  String dni, String email, String curso, Boolean dual) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.dni = dni;
        this.email = email;
        this.curso = curso;
        this.dual = dual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Boolean getDual() {
        return dual;
    }

    public void setDual(Boolean dual) {
        this.dual = dual;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return nombre.equals(alumno.nombre) && apellidos.equals(alumno.apellidos) && direccion.equals(alumno.direccion) && dni.equals(alumno.dni) && email.equals(alumno.email) && curso.equals(alumno.curso) && dual.equals(alumno.dual);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellidos, direccion, dni, email, curso, dual);
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", direccion='" + direccion + '\'' +
                ", dni='" + dni + '\'' +
                ", email='" + email + '\'' +
                ", curso='" + curso + '\'' +
                ", dual=" + dual +
                '}';
    }
}
