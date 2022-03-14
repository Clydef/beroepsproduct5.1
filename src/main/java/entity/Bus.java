package entity;

import service.Transport;

public class Bus implements Transport {

    public Bus() {
    }

    public String getName() {
        return "Bus";
    }

    public Double getDeliveryFee() {
        return 100.00;
    }

    @Override
    public String deliver() {
        return "Delivers by " + getName() + " with a delivery fee of " + getDeliveryFee();
    }
}
