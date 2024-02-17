package day14_practice_tasks.car_task;

public abstract class Car {

    private final String make, model;
    private final int year;
    private double price;
    private String color;


    protected Car(String make, String model, int year, double price, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        setPrice(price);
        setColor(color);

        if (make == null || make.isBlank() || make.isEmpty()) {
            throw new RuntimeException("Make cannot be null, blank, or empty");
        }
        if (model == null || model.isBlank() || model.isEmpty()) {
            throw new RuntimeException("Model cannot be null, blank, or empty");
        }
        if (year < 1886) {
            throw new RuntimeException("Year cannot be before 1886");
        }

    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new RuntimeException("Price cannot be negative");
        }
        this.price = price;
    }

    public String getColor() {
        if (color == null || color.isEmpty() || color.isBlank()) {
            throw new RuntimeException("Color cannot be null, empty, or blank");
        }
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void start();

    public abstract void drive();

    public void stop() {
        System.out.println(model + " stopped.");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}

/*
1. Create an Abstract Class Named 'Car':
    - Variables:
        - final make
        - final model
        - final year
        - price
        - color
    - Encapsulate all fields.
    - Constructor: Initializes all fields.
    - Conditions for setting fields:
        - make, model, color must not be null or empty.
        - year must not be less than 1886.
        - price must not be negative.
    - Abstract Methods:
        - start()
        - drive()
    - Non-Abstract Methods:
        - stop()
        - toString()
 */