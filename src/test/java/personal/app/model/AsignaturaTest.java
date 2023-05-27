package personal.app.model;

import org.junit.Test;

import static org.junit.Assert.*;
import static personal.app.model.Asignatura.Estado.CURSADO;
import static personal.app.model.Asignatura.Estado.NO_CURSADO;

public class AsignaturaTest {
    private static Materia materia;

    private static Asignatura asignatura;

    @Test
    public void testNewAsignatura() {
        asignatura = new Asignatura(materia);
        assertEquals(NO_CURSADO,asignatura.getEstado());
        assertEquals(null,asignatura.getNota());
    }

    @Test
    public void testCursarAsignatura() {
        asignatura = new Asignatura(materia);
        asignatura.cursarAsignatura();
        assertEquals(CURSADO,asignatura.getEstado());
    }
}
