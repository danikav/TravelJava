public class FlightManager {
    public FlightManager() {
    }

    public double calculateWeightForBaggage(Flight flight) {
        double weightReservedForBags = flight.getPlane().getReservedWeightForBaggage();
        double weightOfBagPerPerson = weightReservedForBags / flight.getPlane().getCapacity();
        return weightOfBagPerPerson;
    }

    public double calculateBaggageWeightOfFlight(Flight flight){
        double weightOfBagPerPerson = this.calculateWeightForBaggage(flight);
        int numBags = 0;

        for (Passenger passenger : flight.getPassengers()){
            numBags += passenger.getNumBags();
        }
        return weightOfBagPerPerson * numBags;
    }

    public double calculateRemainingWeight(Flight flight){
        return flight.getPlane().getReservedWeightForBaggage() - calculateBaggageWeightOfFlight(flight);

    }
}

