package pl.adamus.patryk.java.app.booking.model;

import java.time.LocalTime;
import java.util.Date;

public class Application {
    public static void main(String[] args) {

        Address paLashesAddress = new Address("Zwaluwstraat", "29", "Tiel", "4005EP", "Holandia");
        Agency paLashes = new Agency("Paulina", paLashesAddress);
        System.out.println("Paulina lashes : " + paLashes);

        paLashesAddress.modifyStreet("Zimowa");
        System.out.println("Paulina lashes : " + paLashes);

        Client patrykClient = new Client("Patryk", "Adamus", "patrykadamus123@gmail.com", "0658746782");
        System.out.println("Client Patryk : " + patrykClient);

        Service hennaPudrowaService = new Service();

        Visit patrykVisit = new Visit(patrykClient, new Date(1-11-2023), LocalTime.now(), hennaPudrowaService);
        System.out.println("Wizyta Patryka : " + patrykVisit);
        patrykVisit.book();

    }
}

// testy jednostkowe umozliwaja automatyzacje procesow weryfikacji pomprawnosci dzialania kodu w szczegolnosci metody

