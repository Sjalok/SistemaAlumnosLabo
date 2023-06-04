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
            if (i.equals(dni)) {
                System.out.println("Alumno encontrado!");
                return repositorioAlumnos.get(i);
            }
        }
        System.out.println("El alumno no se encontro!");
        return null;
    }

    @Override
    public void loadAlumno(Alumno alumno) {
        if (repositorioAlumnos.containsValue(alumno)) {
            repositorioAlumnos.replace(alumno.getDni(), alumno);
        } else {
            System.out.println("No se encontro el alumno!");
        }
    }
}
