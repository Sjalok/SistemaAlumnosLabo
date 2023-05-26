package personal.app.model;

import java.util.ArrayList;

public class Profesor {
    private final String nombre;
    private final String apellido;
    private final String titulo;

    private final long dni;
    private ArrayList<Materia> materiasDictadas;

    public Profesor(String nombre, String apellido, String titulo, long dni, ArrayList<Materia> materiasDictadas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.dni = dni;
        this.materiasDictadas = materiasDictadas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTitulo() {
        return titulo;
    }

    public long getDni() {
        return dni;
    }

    public ArrayList<Materia> getMateriasDictadas() {
        return materiasDictadas;
    }

    public void setMateriasDictadas(ArrayList<Materia> materiasDictadas) {
        this.materiasDictadas = materiasDictadas;
    }
}
