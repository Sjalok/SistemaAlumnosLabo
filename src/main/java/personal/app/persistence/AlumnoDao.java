package personal.app.persistence;

import personal.app.model.Alumno;

public interface AlumnoDao {

    public void saveAlumno(Alumno alumno);

    public Alumno findAlumno(Long dni);

    public void loadAlumno(Alumno alumno);
}
