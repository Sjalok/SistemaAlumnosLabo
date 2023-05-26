package personal.app.model;


import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ProfesorTest {
    private static Profesor profesor;

    private static Materia materia1;

    private static Materia materia2;

    private static Materia materia3;

    @Test
    public void testNewProfesor() {
        ArrayList<Materia> materias = new ArrayList<Materia>();
        materias.add(materia1);
        materias.add(materia2);
        profesor = new Profesor("Carlos","Streitemberg","Lic. en Ufologia", 22434343, materias);
        assertEquals("Carlos",profesor.getNombre());
        assertEquals("Streitemberg",profesor.getApellido());
        assertEquals(22434343,profesor.getDni());
        assertEquals("Lic. en Ufologia",profesor.getTitulo());
        assertEquals(materias,profesor.getMateriasDictadas());
        assertEquals(2,profesor.getMateriasDictadas().size());
    }

    @Test
    public void testProfesorSetMateriasDictadas() {
        ArrayList<Materia> materias = new ArrayList<Materia>();
        materias.add(materia1);
        materias.add(materia2);
        profesor = new Profesor("Carlos","Streitemberg","Lic. en Ufologia",2434343, materias);
        assertEquals(2,profesor.getMateriasDictadas().size());
        materias.add(materia3);
        profesor.setMateriasDictadas(materias);
        assertEquals(3,profesor.getMateriasDictadas().size());
    }
}
