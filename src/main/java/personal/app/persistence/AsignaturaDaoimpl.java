package personal.app.persistence;

import personal.app.model.Alumno;
import personal.app.model.Asignatura;
import personal.app.model.Materia;

import java.util.HashMap;
import java.util.Map;

public class AsignaturaDaoimpl implements AsignaturaDao {

    private static Map<Long,Asignatura> repositorioAsignaturas = new HashMap<>();
    @Override
    public void saveAsignatura(Alumno alumno, Asignatura asignatura) {
        repositorioAsignaturas.put(alumno.getDni(), asignatura);
    }

    @Override
    public Asignatura findAsignatura(Alumno alumno, String nombreAsignatura) {
        for (Map.Entry<Long,Asignatura> entry: repositorioAsignaturas.entrySet()) {
            Long aux = entry.getKey();
            Asignatura asignatura = entry.getValue();
            if (aux.equals(alumno.getDni()) && nombreAsignatura.equals(asignatura.getMateria().getNombre())) {
                return asignatura;
            }
        }

        System.out.println("El alumno no posee esa asignatura aprobada!");
        return null;
    }
}
