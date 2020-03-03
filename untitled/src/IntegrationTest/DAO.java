package IntegrationTest;

import java.util.List;

public interface DAO<T> {

    T create(T object);
    boolean delete (T sd);
    boolean update (T ad);
    List<T> findAll();



}
