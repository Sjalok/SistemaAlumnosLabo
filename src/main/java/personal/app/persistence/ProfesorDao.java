package personal.app.persistence;

import personal.app.model.Profesor;

public interface ProfesorDao {

    void saveProfesor(Profesor profesor);

    void findProfesor(String nombre, String apellido);

}