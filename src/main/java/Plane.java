public class Plane {
    private PlaneType type;
    private int capacity;

    public Plane(PlaneType type) {
        this.type = type;
        this.capacity = type.getCapacity();
}

    public PlaneType getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }
}
