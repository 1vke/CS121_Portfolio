public class Car {
    protected String brand = "";
    protected String bodyStyle = "";
    protected int horsepower = 0;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBodyStyle() {
        return bodyStyle;
    }

    public void setBodyStyle(String bodyStyle) {
        this.bodyStyle = bodyStyle;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    Car(String brand, String bodyStyle, int horsepower) {
        this.brand = brand;
        this.bodyStyle = bodyStyle;
        this.horsepower = horsepower;
    }
}




