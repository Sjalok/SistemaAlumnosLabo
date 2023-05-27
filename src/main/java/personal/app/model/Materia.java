package personal.app.model;

import java.util.ArrayList;

public class Materia {
    private final String nombre;
    private final int anio;
    private final int cuatrimestre;
    private Profesor profesor;
    private ArrayList<Materia> correlatividades;

    public Materia(String nombre, int anio, int cuatrimestre, Profesor profesor) {
        this.nombre = nombre;
        this.anio = anio;
        this.cuatrimestre = cuatrimestre;
        this.profesor = profesor;
        correlatividades = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getAnio() {
        return anio;
    }

    public int getCuatrimestre() {
        return cuatrimestre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public ArrayList<Materia> getCorrelatividades() {
        return correlatividades;
    }

    public void agregarCorrelatividades(Materia m) {
        this.correlatividades.add(m);
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
}
