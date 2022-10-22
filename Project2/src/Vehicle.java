public class Vehicle {
    private String make;
    private String model;
    private String color;
    private int odometer;

    public Vehicle(String make, String model, String color) {
        this.make = make;
        this.model = model;
        setColor(color);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getOdometer() {
        return odometer;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public void setOdometer() {
        if (odometer < 0) {
            this.odometer = 0;
        } else {
            this.odometer = odometer;
        }
    }
}