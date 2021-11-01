import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CustomListTest {
    private CustomList list;

    @BeforeEach
    public void createList(){
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    void testAdd() {
        list.addCity(new City("edmonon", "alberta"));

        assertEquals(1, list.getCount());
    }

    @Test
    void testHasCity() {
        City city = new City("edmonon", "alberta");
        list.addCity(city);

        assertTrue(list.hasCity(city));
    }

    @Test
    void testDeleteCity() {
        City city = new City("edmonon", "alberta");
        list.addCity(city);
        list.deleteCity(city);

        assertEquals(0, list.getCount());
    }




}

