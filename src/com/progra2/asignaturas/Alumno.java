package com.progra2.asignaturas;

/**
 * Created by user on 16/09/2016.
 */
public class Alumno {
    private String nombreAlumno = "";
    private int alumnoEdad = 0;
    public String[] asignaturas = {};

    public Alumno(String nombre, int edad){
        nombreAlumno = nombre;
        alumnoEdad = edad;
    }

    public String getNombre(){
        return nombreAlumno;
    }

    private void setNombre(String nombre){
        nombreAlumno = nombre;
    }

    public int getEdad(){
        return alumnoEdad;
    }

    private void setEdad(int edad){
        alumnoEdad = edad;
    }

    private void addAsignatura(String nombreAsignatura, String notaAsignatura){
        new Asignatura(nombreAsignatura, notaAsignatura);
        Asignatura.nombreAsignatura();
        Asignatura.getNota();
    }
}
