package day13_practice_tasks.phone_task;

public class Phone {

    private String brand, model, size;
    private double price;
    private String color;

    public Phone(String brand, String model, String size, double price, String color) {
        setBrand(brand);
        setModel(model);
        setSize(size);
        setPrice(price);
        setColor(color);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isBlank() || brand.isEmpty()) {
            throw new RuntimeException("The brand name cannot be empty or blank");
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.isBlank() || model.isEmpty()) {
            throw new RuntimeException("The model name cannot be empty or blank");
        }
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new RuntimeException("The price name cannot be empty or blank");
        }
        this.price = price;
    }

    public String getColor() {
        if (color == null || color.isBlank() || color.isEmpty()) {
            throw new RuntimeException("The color name cannot be empty or blank");
        }
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void call(int phoneNumber) {
        System.out.println("Calling the number " + phoneNumber);
    }

    public void text(int phoneNumber) {
        System.out.println("Texting the number " + phoneNumber);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}