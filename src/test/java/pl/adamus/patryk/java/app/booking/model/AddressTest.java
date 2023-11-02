package pl.adamus.patryk.java.app.booking.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddressTest {

    @Test
    void modifyStreet() {
        // given
        Address address = new Address(null,null,null,null,null);

        // when
        boolean newStreet = address.modifyStreet("Zimowa");

        // then
        Assertions.assertTrue(newStreet, "Ulica nie zostala zmieniona");

    }
}