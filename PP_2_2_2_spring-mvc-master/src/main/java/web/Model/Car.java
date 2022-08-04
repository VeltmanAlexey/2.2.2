package web.Model;

public class Car {
    private int carSpeed;
    private int carWeight;
    private int carCapacity;

    public Car(int carSpeed, int carWeight, int carCapacity) {
        this.carSpeed = carSpeed;
        this.carWeight = carWeight;
        this.carCapacity = carCapacity;
    }

    public int getCarSpeed() {
        return carSpeed;
    }

    public void setCarSpeed(int carSpeed) {
        this.carSpeed = carSpeed;
    }

    public int getCarWeight() {
        return carWeight;
    }

    public void setCarWeight(int carWeight) {
        this.carWeight = carWeight;
    }

    public int getCarCapacity() {
        return carCapacity;
    }

    public void setCarCapacity(int carCapacity) {
        this.carCapacity = carCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carSpeed=" + carSpeed +
                ", carWeight=" + carWeight +
                ", carCapacity=" + carCapacity +
                '}';
    }
}
