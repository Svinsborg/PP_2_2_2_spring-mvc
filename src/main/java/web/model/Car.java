package web.model;

public class Car {
    private Long id;
    private String brand;
    private String model;
    private Long vin;

    public Car(Long id, String brand, String model, Long vin) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.vin = vin;
    }

    public Car() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Long getVin() {
        return vin;
    }

    public void setVin(Long vin) {
        this.vin = vin;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", vin=" + vin +
                '}';
    }
}
