package personal.app.model;

import java.util.ArrayList;

public class Alumno {
    private final String nombre;

    private final String apellido;

    private final long dni;

    private ArrayList<Asignatura> asignaturas; // yo planteo que este arraylist contiene las asignaturas que ya estan aprobadas

    public Alumno(String nombre, String apellido, long dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        asignaturas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public long getDni() {
        return dni;
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void agregarAsignaturas(Asignatura asignatura) {
        asignaturas.add(asignatura);
    }
}