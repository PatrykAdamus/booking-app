package pl.adamus.patryk.java.app.booking.dao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.adamus.patryk.java.app.booking.model.Address;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AddressDaoTest {

    @Test
    void list() {
        // given
        AddressDao addressDao = new AddressDao();

        // when
        List<Address> addresses = addressDao.list();
        System.out.println("Addresses :" + addresses);

        // then
        Assertions.assertNotNull(addresses,"Addresses is null");
    }
}