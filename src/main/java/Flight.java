import java.time.LocalDateTime;
import java.util.ArrayList;

public class Flight {
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destinationAirport;
    private String departureAirport;
    private String departureTime;

    public Flight(ArrayList<Passenger> passengers,
                  Plane plane, String flightNumber, String destinationAirport,
                  String departureAirport, String departureTime) {

        this.passengers = passengers;
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destinationAirport = destinationAirport;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }


    public int getAvailableSeats() {
        return plane.getCapacity() - passengers.size();
    }

    public void bookPassenger(Passenger passenger) {
        if (plane.getCapacity() > passengers.size()) {
            passenger.setFlight(this.flightNumber);
            passengers.add(passenger);
        }
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public Plane getPlane() {
        return plane;
    }
}
