package com.company.ejercicioOpositor;

import java.util.Arrays;

public class Sede {

    private String codigoSede;
    private Capitales ciudad;
    private Opositor[] numMaxOpositores;

    public Sede(String codigoSede, Capitales ciudad) {
        this.codigoSede = codigoSede;
        this.ciudad = ciudad;
        this.numMaxOpositores = new Opositor[0];
    }

    public String getCodigoSede() {
        return codigoSede;
    }

    public void setCodigoSede(String codigoSede) {
        this.codigoSede = codigoSede;
    }

    public Capitales getCiudad() {
        return ciudad;
    }

    public void setCiudad(Capitales ciudad) {
        this.ciudad = ciudad;
    }

    public Opositor[] getNumMaxOpositores() {
        return numMaxOpositores;
    }

    public void setNumMaxOpositores(Opositor[] numMaxOpositores) {
        this.numMaxOpositores = numMaxOpositores;
    }

    private boolean estaOpositor(Opositor opositor) {
        for (int i = 0; i < numMaxOpositores.length; i++) {
            if (numMaxOpositores[i].equals(opositor)) {
                return true;
            }
        }
        return false;
    }

    public Boolean addOpositor(Opositor opositorAnadido) {
        Opositor[] resultado = Arrays.copyOf(numMaxOpositores, numMaxOpositores.length + 1);
        resultado[resultado.length - 1] = opositorAnadido;
        numMaxOpositores = resultado;
        return true;
    }

    public Boolean deleteOpositor(Opositor opositorEliminiado) {
        Opositor[] resultado = new Opositor[0];
        Integer longitud = numMaxOpositores.length;
        for (int i = 0; i < numMaxOpositores.length; i++) {
            if (!numMaxOpositores[i].equals(numMaxOpositores)) {
                resultado = Arrays.copyOf(resultado, resultado.length + 1);
                resultado[resultado.length - 1] = numMaxOpositores[i];
                return true;
            }
        }
        return false;
    }
    public void mostrarInformacion(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Sede{" +
                "codigoSede='" + codigoSede + '\'' +
                ", ciudad=" + ciudad +
                ", numMaxOpositores=" + Arrays.toString(numMaxOpositores) +
                '}';
    }
}
