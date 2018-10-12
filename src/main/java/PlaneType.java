public enum PlaneType {

    AIRBUS319(5),
    AIRBUS320(10),
    AIRBUS321(12),
    AIRBUS330(15),
    BOEING747(20);

    private final int capacity;

    PlaneType(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}
