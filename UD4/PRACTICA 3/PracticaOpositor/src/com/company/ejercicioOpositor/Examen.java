package com.company.ejercicioOpositor;

import java.util.Arrays;
import java.util.Calendar;

public class Examen {

    private Pregunta[] preguntas;
    private Calendar fecha;
    private String consejeria;
    private String enlaceURL;
    private Sede[] sedeAsociada;

    public Examen(String consejeria, String enlaceURL) {
        this.preguntas = new Pregunta[0];
        this.fecha = Calendar.getInstance();
        this.consejeria = consejeria;
        this.enlaceURL = enlaceURL;
        this.sedeAsociada = new Sede[0];
    }

    public Pregunta[] getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(Pregunta[] preguntas) {
        this.preguntas = preguntas;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public String getConsejeria() {
        return consejeria;
    }

    public void setConsejeria(String consejeria) {
        this.consejeria = consejeria;
    }

    public String getEnlaceURL() {
        return enlaceURL;
    }

    public void setEnlaceURL(String enlaceURL) {
        this.enlaceURL = enlaceURL;
    }

    public Sede[] getSedeAsociada() {
        return sedeAsociada;
    }

    public void setSedeAsociada(Sede[] sedeAsociada) {
        this.sedeAsociada = sedeAsociada;
    }

    public Boolean addSede(Sede sedeAnadida) {
        Sede[] resultado = Arrays.copyOf(sedeAsociada, sedeAsociada.length + 1);
        resultado[resultado.length - 1] = sedeAnadida;
        sedeAsociada = resultado;
        return true;
    }

    public Boolean deleteSede() {
        if (sedeAsociada.length>0){
            Sede[] resultado = new Sede[sedeAsociada.length-1];
            for (int i = 0; i < resultado.length; i++) {
                resultado[i] = sedeAsociada[i];
            }
            sedeAsociada = resultado;
            return true;
        }
        return false;
    }

    public Boolean addPreguntas(Pregunta preguntaAnadida){
        if (preguntas.length<100){
            Pregunta[] resultado = Arrays.copyOf(preguntas, preguntas.length+1);
            resultado[resultado.length-1] = preguntaAnadida;
            preguntas = resultado;
            return true;
        }
        return false;
    }
    public Boolean deletePregunta() {
        if (preguntas.length>0){
            Pregunta[] resultado = new Pregunta[preguntas.length-1];
            for (int i = 0; i < resultado.length; i++) {
                resultado[i] = preguntas[i];
            }
            preguntas = resultado;
            return true;
        }
        return false;
    }
    public void mostrarInformacion(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Examen{" +
                "preguntas=" + Arrays.toString(preguntas) +
                ", fecha=" + fecha +
                ", consejeria='" + consejeria + '\'' +
                ", enlaceURL='" + enlaceURL + '\'' +
                ", sedeAsociada=" + Arrays.toString(sedeAsociada) +
                '}';
    }


}
