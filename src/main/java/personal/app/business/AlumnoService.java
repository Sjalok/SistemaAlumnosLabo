package personal.app.business;

import personal.app.model.Alumno;
import personal.app.model.Asignatura;
import personal.app.model.Materia;
import personal.app.persistence.AlumnoDaoMemoryImpl;

import static personal.app.model.Asignatura.Estado.CURSADO;

public class AlumnoService {
    private static AlumnoDaoMemoryImpl alumnoDaoMemory;

    // plantear que el profesor es el que tenga aprobar Asignatura y luego agregarla la lista de asignaturas del alumno

    public void asignaturaExamen(Alumno alumno,Asignatura asignatura, int nota) {
        if (asignatura.getEstado() != CURSADO) {
            System.out.println("No se puede rendir la asignatura si la asignatura no esta cursada!");
            return;
        }

        if (nota < 6) {
            System.out.println("No se puede aprobar con menos de 6!");
            return;
        } else if (nota > 10) {
            System.out.println("No hay una nota mayora a 10!");
            return;
        }

        if (!chequearCorrelatividades(alumno,asignatura)) {
            System.out.println("Le faltan aprobar correlatividades!");
            return;
        }

        aprobarAsignatura(alumno,asignatura);
    }

    public void aprobarAsignatura(Alumno alumno, Asignatura asignatura) {
        alumno.agregarAsignaturas(asignatura);
    }

    public boolean chequearCorrelatividades(Alumno alumno, Asignatura asignatura) {
        String helper;
        Materia aux = asignatura.getMateria();
        boolean flag;

        for (Materia materia: aux.getCorrelatividades()) {
            flag = false;
            helper = materia.getNombre();
            for (Asignatura a: alumno.getAsignaturas()) {
                if (helper.equals(a.getMateria().getNombre())) {
                    flag = true;
                }
            }
            if (flag == false) {
                return false;
            }
        }

        return true;
    }
}
