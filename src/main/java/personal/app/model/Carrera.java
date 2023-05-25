package personal.app.model;

import java.util.ArrayList;

public class Carrera {
    private final String nombre;
    private final int cantidadAnios;
    private ArrayList<Materia> listaMaterias;

    public Carrera(String nombre, int cantidadAnios, ArrayList<Materia> listaMaterias) {
        this.nombre = nombre;
        this.cantidadAnios = cantidadAnios;
        this.listaMaterias = listaMaterias;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidadAnios() {
        return cantidadAnios;
    }

    public ArrayList<Materia> getListaMaterias() {
        return listaMaterias;
    }

    public void setListaMaterias(ArrayList<Materia> listaMaterias) {
        this.listaMaterias = listaMaterias;
    }
}
