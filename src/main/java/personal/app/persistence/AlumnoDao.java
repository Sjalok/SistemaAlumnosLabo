package personal.app.persistence;

import personal.app.model.Alumno;

public interface AlumnoDao {

    void saveAlumno(Alumno alumno);

    Alumno findAlumno(Long dni);
}
