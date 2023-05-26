package personal.app.model;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class AlumnoTest {
    private static Alumno alumno;
    private static Asignatura asignatura1;
    private static Asignatura asignatura2;

    @Test
    public void testNewAlumno() {
        alumno = new Alumno("Franco","Esparza",43553102);
        assertEquals("Franco",alumno.getNombre());
        assertEquals("Esparza",alumno.getApellido());
        assertEquals(43553102,alumno.getDni());
    }

    @Test
    public void testSetAlumnoAsignaturas(){
        ArrayList<Asignatura> asignaturas = new ArrayList<Asignatura>();
        asignaturas.add(asignatura1);
        asignaturas.add(asignatura2);
        alumno = new Alumno("Franco","Esparza",43553102);
        alumno.setAsignaturas(asignaturas);
        assertEquals(2, alumno.getAsignaturas().size());
    }
}
