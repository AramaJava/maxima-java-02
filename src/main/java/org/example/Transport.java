package org.example;

abstract class Transport implements Repairable{
    private String name;
    private int capacity;
    private int speed;
    private float costOfKm;

    private boolean isRepairing;

    public Transport(String name, int capacity, int speed, float costOfKm) {
        this.name = name;
        this.capacity = capacity;
        this.speed = speed;
        this.costOfKm = costOfKm;
        isRepairing = false;
    }

    public String getName() {return name;};

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public float getCostOfKm() {
        return costOfKm;
    }

    public void setCostOfKm(float costOfKm) {
        this.costOfKm = costOfKm;
    }

    public abstract float getPrice(City city);

    @Override
    public void startRepair() {
        isRepairing = true;
    }

    public void setRepairing(boolean repairing) {
        isRepairing = repairing;
    }

    @Override
    public void finishRepair() {
      isRepairing = false;
    }

    @Override
    public boolean isRepairing() {
       return isRepairing;
    }


}
