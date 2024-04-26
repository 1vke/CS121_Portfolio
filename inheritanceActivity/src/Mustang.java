public class Mustang extends Car {
    private Boolean modified;

    public Boolean getModified() {
        return modified;
    }

    public void setModified(Boolean modified) {
        this.modified = modified;
    }

    Mustang(String brand, int horsepower, boolean isModified) {
        super(brand, "coupe", horsepower);
        modified = isModified;
    }
}