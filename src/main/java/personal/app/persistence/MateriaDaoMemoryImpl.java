package personal.app.persistence;

import personal.app.model.Materia;

import java.util.HashMap;
import java.util.Map;

public class MateriaDaoMemoryImpl implements MateriaDao{

    private static Map<String,Materia> repositorioMaterias = new HashMap<>();

    @Override
    public void saveMateria(Materia materia) {
        repositorioMaterias.put(materia.getNombre(),materia);
    }

    @Override
    public Materia findMateria(String nombreMateria) {
        for (String materia: repositorioMaterias.keySet()) {
            if (nombreMateria.equals(materia)) {
                System.out.println("Se encontro la materia!");
                return repositorioMaterias.get(materia);
            }
        }
        System.out.println("No se encontro la materia!");
        return null;
    }
}
