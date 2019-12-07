package Restaurant_Ya_Baldy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class RestaurantTest {

    @Test
    void testConstructor() {
        Restaurant restaurant=new Restaurant("qwe",20,10,24);
        assertEquals(restaurant.adress,"qwe");

    }
    @ParameterizedTest
    @ValueSource(ints= { 1,2,3,4,5 })
    void testCountTable(int par){
        Restaurant restaurant=new Restaurant("qwe",par,10,24);

       // int countTable=restaurant.getCountTable();
        //assertEquals(par,countTable);
    }
}