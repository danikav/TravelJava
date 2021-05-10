import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {
        FlightManager flightManager;
        Flight flight;

        @Before
        public void setUp(){
            flightManager = new FlightManager();
            Plane plane = new Plane(PlaneType.BOEING747);
            Passenger passenger1 = new Passenger("Ryan");
            Passenger passenger2 = new Passenger("Jo");
            ArrayList<Passenger> passengers = new ArrayList<>();
            passengers.add(passenger1);
            passengers.add(passenger2);
            flight = new Flight(
                    passengers,
                    plane,
                    "100",
                    "HAV",
                    "EDI",
                    "20:00");
        }

        @Test
        public void canCalculateWeightForBaggage(){
            double weightReservedForBags = flight.getPlane().getReservedWeightForBaggage();
            double weightOfBagPerPerson = weightReservedForBags / flight.getPlane().getCapacity();

            double expectedValue = weightOfBagPerPerson;
            double actualValue = flightManager.calculateWeightForBaggage(flight);
            assertEquals(expectedValue, actualValue, 0.1);

        }
        @Test
        public void canCalculateWeightOfFlight(){
            double actualValue= flightManager.calculateBaggageWeightOfFlight(flight);
            assertEquals(40, actualValue, 0.1);

        }
    }

