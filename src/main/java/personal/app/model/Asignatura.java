package personal.app.model;

public class Asignatura {
    private final Materia materia;
    private Estado estado;

    private Integer nota;

    public Asignatura(Materia materia) {
        this.materia = materia;
        this.estado = Estado.NO_CURSADO;
        this.nota = null;
    }

    public Materia getMateria() {
        return materia;
    }

    public Estado getEstado() {
        return estado;
    }

    public Integer getNota() {
        return nota;
    }

    public void cursarAsignatura() {
        this.estado = Estado.CURSADO;
    }

    enum Estado {APROBADO, CURSADO, NO_CURSADO}
}
