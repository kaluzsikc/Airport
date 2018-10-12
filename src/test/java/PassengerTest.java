import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        this.passenger = new Passenger("Bob");
    }

    @Test
    public void hasName() {
        assertEquals("Bob", passenger.getName());
    }
}
