package personal.app.model;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MateriaTest {
    private static Profesor profesor;

    private static Profesor porosor;

    private static Materia materia;

    private static Materia materiaux;

    private static Materia materiaux2;

    @Test
    public void testNewMateria() {
        materia = new Materia("Matematicas",2,1,profesor);
        assertEquals("Matematicas",materia.getNombre());
        assertEquals(2,materia.getAnio());
        assertEquals(1,materia.getCuatrimestre());
        assertEquals(profesor,materia.getProfesor());
        assertEquals(0,materia.getCorrelatividades().size());
    }

    @Test
    public void testSetProfesor() {
        materia = new Materia("Matematicas",2,1,profesor);
        materia.setProfesor(porosor);
        assertEquals(porosor,materia.getProfesor());
    }

    @Test
    public void testAgregarCorrelatividades() {
        materia = new Materia("Matematicas",2,1,profesor);
        materia.agregarCorrelatividades(materiaux);
        assertEquals(1,materia.getCorrelatividades().size());
        materia.agregarCorrelatividades(materiaux2);
        assertEquals(2,materia.getCorrelatividades().size());
    }
}
