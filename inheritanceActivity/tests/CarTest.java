import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    private Car fordCar = new Car("ford", "hatchback", 100);
    
    @org.junit.jupiter.api.Test
    void getBrand() {
        assertEquals("ford", fordCar.getBrand());
    }

    @org.junit.jupiter.api.Test
    void setBrand() {
//        Car.setBrand("buick");
//        assertEquals("buick", fordCar.getBrand());
    }

    @org.junit.jupiter.api.Test
    void getBodyStyle() {
        assertEquals("hatchback", fordCar.getBodyStyle());
    }

    @org.junit.jupiter.api.Test
    void setBodyStyle() {
    }

    @org.junit.jupiter.api.Test
    void getHorsepower() {
        assertEquals(100, fordCar.getHorsepower());
    }

    @org.junit.jupiter.api.Test
    void setHorsepower() {
    }
}