package com.progra2.asignaturas;

/**
 * Created by user on 16/09/2016.
 */
public class Asignatura {
    private static String asignatura = "";
    private static String notaAsignada = "";

    public Asignatura(String nombreAsignatura, String nota){
        asignatura = nombreAsignatura;
        notaAsignada = nota;
    }

    private void setNota(String nota){
        notaAsignada = nota;
    }

    public static String getNota(){
        return notaAsignada;
    }

    public static String resultado(int nota){
        String result = "";
        if (nota >= 60){
            result = "Aprobado";
        }
        else{
            result = "Reprobado";
        }
        return result;
    }

    public static String nombreAsignatura(){
        return asignatura;
    }
}
