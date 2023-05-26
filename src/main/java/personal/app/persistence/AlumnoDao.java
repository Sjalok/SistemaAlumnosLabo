package personal.app.persistence;

import personal.app.model.Alumno;

public interface AlumnoDao {

    void saveAlumno(Alumno alumno);

    void findAlumno(Long dni);
}
