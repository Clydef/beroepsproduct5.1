package service;

import entity.Bus;
import entity.Customer;
import entity.Plane;

public class TransportFactory {

    public Transport getInstance(Customer customer) {
        if (!customer.getDistrict().isEmpty()) {
            if ("Nickerie".equals(customer.getDistrict())) {
                return new Plane();
            } else {
                return new Bus();
            }
        } else {
            return new UnavailableTransport();
        }
    }
}
