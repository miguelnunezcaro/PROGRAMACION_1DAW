package com.company.ejercicioOpositor;

public class Opcion {

    private String respuestaTexto;
    private Boolean respuesta;

    public Opcion(String respuestaTexto, Boolean respuesta) {
        this.respuestaTexto = respuestaTexto;
        this.respuesta = respuesta;
    }

    public String getRespuestaTexto() {
        return respuestaTexto;
    }

    public void setRespuestaTexto(String respuestaTexto) {
        this.respuestaTexto = respuestaTexto;
    }

    public Boolean getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(Boolean respuesta) {
        this.respuesta = respuesta;
    }
    public void mostrarInformacion(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Opcion{" +
                "respuestaTexto='" + respuestaTexto + '\'' +
                ", respuesta=" + respuesta +
                '}';
    }
}
