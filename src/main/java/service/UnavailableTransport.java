package service;

public class UnavailableTransport implements Transport {

    @Override
    public String deliver() {
        return "Unknown transport!";
    }
}
