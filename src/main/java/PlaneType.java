public enum PlaneType {

    BOEING747(366, 183500),
    BOEING737(188, 41145),
    AIRBUSA380(555, 562000);


    private final int capacity;
    private final int weight;

    PlaneType(int capacity, int weight){
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity(){
        return capacity;
    }

    public int getWeight(){
        return weight;
    }

}
