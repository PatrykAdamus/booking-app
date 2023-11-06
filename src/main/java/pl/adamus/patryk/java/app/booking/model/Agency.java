package pl.adamus.patryk.java.app.booking.model;

import java.util.List;

public class Agency {

    private String name;
    // kompozycja, zamiast dziedziczenia
    private Address address;
    //    private String street;
//    private String flatNumber;
//    private String city;
//    private String postCode;
//    private String country;
    private List<Service> services;

    public Agency(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public boolean addService(Service service) {
        if (service == null){
            return false;
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Agency{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
