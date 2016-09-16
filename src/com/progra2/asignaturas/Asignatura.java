package com.progra2.asignaturas;

/**
 * Created by user on 16/09/2016.
 */
public class Asignatura {
    private String asignatura = "";
    private int notaAsignada = 0;

    public Asignatura(String nombreAsignatura, int nota){
        asignatura = nombreAsignatura;
        notaAsignada = nota;
    }

    private void setNota(int nota){
        notaAsignada = nota;
    }

    public int getNota(){
        return notaAsignada;
    }

    public String resultado(int nota){
        String result = "";
        if (nota >= 60){
            result = "Aprobado";
        }
        else{
            result = "Reprobado";
        }
        return result;
    }

    public String nombreAsignatura(){
        return asignatura;
    }
}
