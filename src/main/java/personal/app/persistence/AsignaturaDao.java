package personal.app.persistence;

import personal.app.model.Alumno;
import personal.app.model.Asignatura;
import personal.app.model.Materia;

public interface AsignaturaDao {
    void saveAsignatura(Alumno alumno, Asignatura asignatura);

    Asignatura findAsignatura(Alumno alumno, String nombreAsignatura);
}