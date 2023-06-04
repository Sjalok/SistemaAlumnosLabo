package personal.app.presentation;

import personal.app.business.AlumnoServiceImpl;
import personal.app.model.Alumno;
import personal.app.model.Asignatura;

import static personal.app.model.Asignatura.Estado.CURSADO;

public class AlumnoPresentationImpl implements AlumnoPresentation{
    private AlumnoServiceImpl alumnoService;

    @Override
    public void chequearInputsAprobarAsignatura(Alumno alumno, Asignatura asignatura, int nota) {
        if (!chequearNotas(nota)) {
            System.out.println("Hay un problema con respecto a las notas!");
            return;
        }

        if (!chequearEstadoAsignatura(asignatura)) {
            System.out.println("La materia no esta cursada o ya esta aprobada!");
            return;
        }

        alumnoService.aprobarAsignatura(alumno,asignatura,nota);
    }

    @Override
    public boolean chequearNotas(int nota) {
        if (nota < 6) {
            return false;
        } else if (nota > 10) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean chequearEstadoAsignatura(Asignatura asignatura) {
        if (asignatura.getEstado() != CURSADO) {
            return false;
        } else {
            return true;
        }
    }
}
