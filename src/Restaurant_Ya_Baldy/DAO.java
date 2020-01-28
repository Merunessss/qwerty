package Restaurant_Ya_Baldy;

import java.util.List;

public interface DAO<T> {
    boolean create(T newObj);
    boolean delete(int id);
    boolean update(T newObj);
   default T find(int id){
       return null;
   }
    List<T> getAll();

}
