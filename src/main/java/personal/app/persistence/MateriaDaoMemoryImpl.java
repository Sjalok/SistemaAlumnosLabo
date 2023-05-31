package personal.app.persistence;

import personal.app.model.Materia;

import java.util.HashMap;
import java.util.Map;

public class MateriaDaoMemoryImpl implements MateriaDao{

    private static Map<Integer,Materia> repositorioMaterias = new HashMap<>();

    @Override
    public void saveMateria(Materia materia) {
        repositorioMaterias.put(materia.getMateriaId(), materia);
    }

    @Override
    public Materia findMateria(String nombreMateria) {
        for (Materia materia: repositorioMaterias.values()) {
            if (materia.getNombre().equals(nombreMateria)) {
                return materia;
            }
        }

        System.out.println("No se encontro la materia solicitada!");
        return null;
    }

    @Override
    public void loadMateria(Materia materia) {
        if (repositorioMaterias.containsValue(materia)) {
            repositorioMaterias.replace(materia.getMateriaId(), materia);
        } else {
            System.out.println("Esa materia no se encuentra en nuestro repositorio!");
        }
    }
}
