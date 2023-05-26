package personal.app.persistence;

import personal.app.model.Profesor;

public interface ProfesorDao {

    void saveProfesor(Profesor profesor);

    Profesor findProfesor(Long i);
}