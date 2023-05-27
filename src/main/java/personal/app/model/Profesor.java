package personal.app.model;

import java.util.ArrayList;

public class Profesor {
    private final String nombre;
    private final String apellido;
    private final String titulo;

    private final long dni;
    private ArrayList<Materia> materiasDictadas;

    public Profesor(String nombre, String apellido, String titulo, long dni, Materia m) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.dni = dni;
        materiasDictadas = new ArrayList<>();
        materiasDictadas.add(m);
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

    public void agregarMateriaADictar(Materia m) {
        this.materiasDictadas.add(m);
    }

    public void sacarMateriaADictar(Materia m) {
        if (this.materiasDictadas.contains(m)) {
            this.materiasDictadas.remove(m);
        } else {
            System.out.println("Este profesor no dicta esa materia!");
        }
    }
}
