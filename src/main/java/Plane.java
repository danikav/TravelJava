public class Plane {
    private PlaneType type;
    private int capacity;
    private double totalWeight;

    public Plane(PlaneType type) {
        this.type = type;
        this.capacity = type.getCapacity();
        this.totalWeight = type.getTotalWeight();
}

    public PlaneType getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public double getReservedWeightForBaggage(){
        return this.getTotalWeight() / 2.0;
    }
}
