package personal.app.model;


import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ProfesorTest {
    private static Profesor profesor;

    private static Materia materia1;

    private static Materia materia2;

    private static Materia materia3;

    @Test
    public void testNewProfesor() {
        profesor = new Profesor("Carlos","Streitemberg","Lic. en Ufologia", 22434343, materia1);
        assertEquals("Carlos",profesor.getNombre());
        assertEquals("Streitemberg",profesor.getApellido());
        assertEquals(22434343,profesor.getDni());
        assertEquals("Lic. en Ufologia",profesor.getTitulo());
        assertEquals(1,profesor.getMateriasDictadas().size());
        assertTrue(profesor.getMateriasDictadas().contains(materia1));
    }

    @Test
    public void testAgregarYSacarMaterias() {
        profesor = new Profesor("Carlos","Streitemberg","Lic. en Ufologia",2434343, materia1);
        profesor.agregarMateriaADictar(materia2);
        profesor.agregarMateriaADictar(materia3);
        assertEquals(3,profesor.getMateriasDictadas().size());
        profesor.sacarMateriaADictar(materia1);
        assertEquals(2,profesor.getMateriasDictadas().size());
        assertFalse(profesor.getMateriasDictadas().contains(materia1));
    }
}
