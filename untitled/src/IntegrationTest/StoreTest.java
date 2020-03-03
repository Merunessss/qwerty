package IntegrationTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class StoreTest {

    @org.junit.jupiter.api.Test
    void addFood() {

    }

    @org.junit.jupiter.api.Test
    void findFood33() {

        DAO<WholeFoods> daoMock = mock(DAO.class);

        WholeFoods buriak = new WholeFoods("bur", 21, 100);
        WholeFoods sushi = new WholeFoods("suh", 10, 12);
        WholeFoods rice = new WholeFoods("rice", 122, 143);

        List<WholeFoods> kusatb = new ArrayList<>();

        kusatb.add(buriak);
        kusatb.add(sushi);
        kusatb.add(rice);
  //      when(daoMock.findAll()).thenReturn(kusatb);
//        System.out.println(daoMock.findAll());
//        Store store = new Store(daoMock, "dsa");

    }
}