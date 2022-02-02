package com.company.ejercicioOpositor;

import java.util.Arrays;

public class Pregunta {

    private String enunciado;
    private Opcion[] options;

    public Pregunta(String enunciado) {
        this.enunciado = enunciado;
        this.options = new Opcion[0];
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public Opcion[] getOpcions() {
        return options;
    }

    public void setOpcions(Opcion[] options) {
        this.options = options;
    }
    public Boolean addOption(Opcion opcionAnadida){
        if (options.length<3){
            Opcion[] resultado = Arrays.copyOf(options, options.length+1);
            resultado[resultado.length-1] = opcionAnadida;
            options = resultado;
            return true;
        }
        return false;
    }
    public Boolean deleteOption() {
        if (options.length>0){
            Opcion[] resultado = new Opcion[options.length-1];
            for (int i = 0; i < resultado.length; i++) {
                resultado[i] = options[i];
            }
            options = resultado;
            return true;
        }
        return false;
    }
    public void mostrarInformacion(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Pregunta{" +
                "enunciado='" + enunciado + '\'' +
                ", options=" + Arrays.toString(options) +
                '}';
    }
}
