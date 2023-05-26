package personal.app.model;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MateriaTest {
    private static Profesor profesor;

    private static Materia materia;

    private static Materia materiaux;

    private static Materia materiaux2;

    private static Materia materiaux3;

    @Test
    public void testNewMateria() {
        ArrayList<Materia> materias = new ArrayList<Materia>();
        materias.add(materiaux);
        materias.add(materiaux2);
        materia = new Materia("Matematicas",2,1,profesor,materias);
        assertEquals("Matematicas",materia.getNombre());
        assertEquals(2,materia.getAnio());
        assertEquals(1,materia.getCuatrimestre());
        assertEquals(profesor,materia.getProfesor());
        assertEquals(materias,materia.getCorrelatividades());
        assertEquals(2,materia.getCorrelatividades().size());
    }

    @Test
    public void testSetCorrelatividades() {
        ArrayList<Materia> materias = new ArrayList<Materia>();
        materias.add(materiaux);
        materias.add(materiaux2);
        materia = new Materia("Matematicas",2,1,profesor,materias);
        assertEquals(2, materia.getCorrelatividades().size());
        materias.add(materiaux3);
        materia.setCorrelatividades(materias);
        assertEquals(3,materia.getCorrelatividades().size());
    }
}
