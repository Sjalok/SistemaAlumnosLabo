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
        assertEquals(0,alumno.getAsignaturas().size());
    }

    @Test
    public void testAgregarAlumnoAsignaturas() {
        alumno = new Alumno("Franco","Esparza",43553102);
        alumno.agregarAsignaturas(asignatura1);
        alumno.agregarAsignaturas(asignatura2);
        assertEquals(2, alumno.getAsignaturas().size());
    }
}
