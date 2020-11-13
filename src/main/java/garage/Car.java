package garage;

public abstract class  Car  {
    String brand;
    String model;
    String color;
    int yearManufacture;
    String registrationNumber;

    public Car (String brand, String model, String color, int yearManufacture, String registrationNumber) {
        this.brand = brand;
        this.model = model;
        this. color = color;
        this.yearManufacture = yearManufacture;
        this.registrationNumber = registrationNumber;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYearManufacture() {
        return yearManufacture;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }
    
    @Override
    public int hashCode () {
        return brand.hashCode() - model.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Car car = (Car) obj;
        return (brand == car.brand &&  model == car.getModel());

    }


    @Override
    public String toString () {
        return "Brand:" + brand + " Model:" + model + " Color:" + color + " YearManufacture:" + yearManufacture + " RegistrationNumber:" + registrationNumber;
    }
}
