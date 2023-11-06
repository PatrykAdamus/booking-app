package pl.adamus.patryk.java.app.booking.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AgencyTest {

    @Test
    void add() {
        // given - tworzenie obiektu klasy testowanej oraz parametrów metody testowanej
        Agency agency = new Agency(null, null);
        Service service = new Service();

        // when - wywolanie metody klasy testowanej
        boolean added = agency.addService(service);

        // then - sprawdzenie wartosci zwracanej z metody testowanej
        Assertions.assertTrue(added, "Service not added");
    }

    // TODO: 19.10.2023 praca domowa
//    przecwiczyc kolekcje
//    poczytac o warstwach i crud
//    dodac metode do dowolnej klasy model
//    stworzyc test jednostkowy dla nowej metody
}