package personal.app.persistence;

import personal.app.model.Profesor;

import java.util.HashMap;

public class ProfesorDaoMemoryImpl implements ProfesorDao{

    private static HashMap<Long,Profesor> repositorioProfesores = new HashMap<>();

    @Override
    public void saveProfesor(Profesor profesor) {
        repositorioProfesores.put(profesor.getDni(),profesor);
    }

    @Override
    public Profesor findProfesor(Long dni) {
        for (Long i: repositorioProfesores.keySet()) {
            if (dni.equals(i)) {
                System.out.println("Profesor encontrado!");
                return repositorioProfesores.get(i);
            }
        }
        System.out.println("El profesor no fue encontrado!");
        return null;
    }
}
