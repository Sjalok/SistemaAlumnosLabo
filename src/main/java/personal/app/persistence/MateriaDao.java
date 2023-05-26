package personal.app.persistence;

import personal.app.model.Materia;

public interface MateriaDao {

    public void saveMateria(Materia materia);

    public Materia findMateria(String nombreMateria);
}
