import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Flight flight;

    @Before
    public void setUp() {
        Passenger passenger = new Passenger("John");
        Plane plane = new Plane(PlaneType.BOEING747);

        ArrayList<Passenger> passengers = new ArrayList<>();
        passengers.add(passenger);
        flight = new Flight(
                passengers,
                plane,
                "100",
                "HAV",
                "EDI",
                "20:00");
    }


    @Test
    public void getAvailableSeats() {
        assertEquals(99, flight.getAvailableSeats());
    }


    @Test
    public void canBookPassenger(){
        Passenger passenger = new Passenger("Mary");
        int numOfPassengers = flight.getPassengers().size();
        flight.bookPassenger(passenger);
        assertEquals(numOfPassengers + 1, flight.getPassengers().size());
    }


}
