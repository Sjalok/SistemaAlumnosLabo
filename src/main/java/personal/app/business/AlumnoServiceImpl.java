package personal.app.business;

import personal.app.model.Alumno;
import personal.app.model.Asignatura;
import personal.app.model.Materia;
import personal.app.persistence.AlumnoDaoMemoryImpl;

import static personal.app.model.Asignatura.Estado.CURSADO;

public class AlumnoServiceImpl {
    private static final AlumnoDaoMemoryImpl alumnoDaoMemory = new AlumnoDaoMemoryImpl();

    // plantear que el profesor es el que tenga aprobar Asignatura y luego agregarla la lista de asignaturas del alumno

    public void aprobarAsignatura(Alumno alumno, Asignatura asignatura, int nota) {
        if (!chequearCorrelatividades(alumno,asignatura)) {
            System.out.println("Le faltan aprobar correlatividades!");
            return;
        }

        asignatura.setNota(nota);
        alumno.agregarAsignaturas(asignatura);
        alumnoDaoMemory.loadAlumno(alumno);
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
