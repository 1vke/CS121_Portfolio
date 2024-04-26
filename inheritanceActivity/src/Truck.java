public class Truck extends Car {
    private String cabType;

    public String getCabType() {
        return cabType;
    }

    public void setCabType(String cabType) {
        this.cabType = cabType;
    }

    public Truck(String brand, int horsepower, String cabType) {
        super(brand, "truck", horsepower);
        this.cabType = cabType;
    }
}
