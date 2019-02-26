package hu.me;

class Car {
    private String brand = null;
    private int doors = 0;

    String getBrand() {
        return this.brand;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    int getDoors() {
        return this.doors;
    }

    void setDoors(int doors) {
        this.doors = doors;
    }
}