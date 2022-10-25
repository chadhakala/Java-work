public class Vehicle {
    private String make;
    private String model;
    private String color;
    private int odometer;
    private int kmDrive;
    private boolean drive;

    public Vehicle(String make, String model, String color, boolean drive, int kmDrive) {
        this.make = make;
        this.model = model;
        setColor(color);
        this.odometer = 0;
        this.kmDrive = kmDrive;
        this.drive = drive;
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

    public boolean isDrive(int drive) {  //How many miles we want to drive. EricsCar.drive(100)
        odometer += drive;
        return true;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

        }

