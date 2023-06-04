package personal.app.presentation;

import personal.app.model.Alumno;
import personal.app.model.Asignatura;

public interface AlumnoPresentation {

    public void chequearInputsAprobarAsignatura(Alumno alumno, Asignatura asignatura, int nota);

    public boolean chequearNotas(int nota);

    public boolean chequearEstadoAsignatura(Asignatura asignatura);
}
