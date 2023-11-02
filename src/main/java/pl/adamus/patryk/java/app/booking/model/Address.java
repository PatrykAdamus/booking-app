package pl.adamus.patryk.java.app.booking.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    //    @Setter
//    @Getter
    private String street;
    private String flatNumber;
    private String city;
    private String postCode;
    private String country;

    @Deprecated
    public boolean modifyStreet(String street) {
        if (!street.equals(this.street)) {
            this.street = street;
            return true;
        }
        return false;
    }

//    public Address() {
//    }
//
//    public Address(String street, String flatNumber, String city, String postCode, String country) {
//        this.street = street;
//        this.flatNumber = flatNumber;
//        this.city = city;
//        this.postCode = postCode;
//        this.country = country;
//    }
//
//    public String getStreet() {
//        return street;
//    }
//
//    public void setStreet(String street) {
//        this.street = street;
//    }
//
//    public String getFlatNumber() {
//        return flatNumber;
//    }
//
//    public void setFlatNumber(String flatNumber) {
//        this.flatNumber = flatNumber;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }
//
//    public String getPostCode() {
//        return postCode;
//    }
//
//    public void setPostCode(String postCode) {
//        this.postCode = postCode;
//    }
//
//    public String getCountry() {
//        return country;
//    }
//
//    public void setCountry(String country) {
//        this.country = country;
//    }
//
//    @Override
//    public String toString() {
//        return "Address{" +
//                "street='" + street + '\'' +
//                ", flatNumber='" + flatNumber + '\'' +
//                ", city='" + city + '\'' +
//                ", postCode='" + postCode + '\'' +
//                ", country='" + country + '\'' +
//                '}';
//    }
}
