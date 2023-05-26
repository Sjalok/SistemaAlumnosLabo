package personal.app.persistence;

import personal.app.model.Alumno;

import java.util.HashMap;
import java.util.Map;

public class AlumnoDaoMemoryImpl implements AlumnoDao{
    private static Map<Long, Alumno> repositorioAlumnos = new HashMap<>();

    @Override
    public void saveAlumno(Alumno alumno) {
        repositorioAlumnos.put(alumno.getDni(), alumno);
    }

    @Override
    public Alumno findAlumno(Long dni) {
        for (Long i: repositorioAlumnos.keySet()) {
            if (dni.equals(i)) {
                System.out.println("Alumno encontrado!");
                return repositorioAlumnos.get(i);
            }
        }
        System.out.println("El alumno no se encontro!");
        return null;
    }
}
