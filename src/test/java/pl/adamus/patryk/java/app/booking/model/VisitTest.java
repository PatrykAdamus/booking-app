package pl.adamus.patryk.java.app.booking.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

class VisitTest {

    @Test
    void book() {
        // given
        Client client = new Client("Patryk", "Adamus", "patrykadamus123@gmail.com", "695004690");
        Visit visit = new Visit(client, null, null, null);

        // when
        boolean booked = visit.book();

        // then
        Assertions.assertTrue(booked, "Visit not booked");
    }

    @Test
    void bookWithClient() {
        // given

        // when

        // then

    }

    @Test
    void change() {
        // given
        Visit visit = new Visit(null, null, null, null);
        String date = "26.10.2023";
        String hour = "10:00";
        Service service = new Service();

        // when
        boolean visitChanged = visit.change(null, LocalTime.now(), service);

        // then
        Assertions.assertTrue(visitChanged, "Visit not changed");

        //TDD - test driven development

    }
// robiac test jednostkowy musialem stworzyc obiekt klasy visit
// aby utworzyc obiekt klasy visit musialem utworzyc obiekt client i service
// poniewaz jak rozmawialismy trzeba nadawac argumenty parametra podczas testow jak na przykladzie powyzej
//    ZAPYTAJ O WHEN!!!
//    najpierw wywolac testowana metode czyli cancelVisit z klasy visit
//    przypisac jej wartosc do atrybutu
//    przetestowac ten atrybut
//    test zostal przeprowadzony w przypadku gdy zostanie podana data badz service
//    gdy wpisze null null null jest git :D
    @Test
    void cancelVisit() {
        // given
        Service service = new Service();
        Client client = new Client("Patryk", "Adamus","patrykadamus123@gmail.com", "0658746782");
        Visit visit = new Visit(client, null, LocalTime.now(),service);
        // when

        boolean visitCancelled = visit.cancelVisit(client, null,LocalTime.now(),service);

        // then

        Assertions.assertTrue(visitCancelled, "Visit not cancelled");

    }
}