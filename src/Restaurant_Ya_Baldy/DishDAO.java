package Restaurant_Ya_Baldy;

import java.util.List;

public class DishDAO implements DAO<Dish>{
    @Override
    public boolean create(Dish newObj) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public boolean update(Dish newObj) {
        return false;
    }

    @Override
    public List<Dish> getAll() {
        return null;
    }
}
