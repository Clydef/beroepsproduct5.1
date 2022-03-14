package entity;

import service.Transport;

public class Plane implements Transport {

    public Plane() {
    }

    public String getName() {
        return "Plane";
    }

    public Double getDeliveryFee() {
        return 400.00;
    }

    @Override
    public String deliver() {
        return "Delivers by " + getName() + " with a delivery fee of " + getDeliveryFee();
    }
}
