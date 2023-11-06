package pl.adamus.patryk.java.app.booking.model;

import java.time.LocalTime;
import java.util.Date;

public class Visit {

    private Client client;
    // TODO: 26.10.2023 zastapic date i godzine odpowiednimi typami javowywi  
    private Date date;
    private LocalTime hour;
    private Service service;

//    public Visit() {
//    }

    public Visit(Client client, Date date, LocalTime hour, Service service) {
        this.client = client;
        this.date = date;
        this.hour = hour;
        this.service = service;
    }

    public boolean book() {
//        System.out.println("Booking a visit");
        return true;
    }

    // TODO: 26.10.2023 dodac nowa metode do odwolania wizyty + testy jednostkowe
    public boolean cancelVisit(Client client, Date date, LocalTime hour, Service service) {
        System.out.println("Canceling visit");
        if (service == null) {
            this.client = client;
            this.date = date;
            this.hour = hour;
            this.service = service;
            return true;
        }
        return false;
    }

    public boolean change(Date date, LocalTime hour, Service service) {
        System.out.println("Changing visit");
        if (service != null) {
            this.service = service;
            this.date = date;
            this.hour = hour;
            return true;
        }
        return false;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public LocalTime getHour() {
        return hour;
    }

    public void setHour(LocalTime hour) {
        this.hour = hour;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    @Override
    public String toString() {
        return "Visit{" +
                "client=" + client +
                ", date='" + date + '\'' +
                ", hour='" + hour + '\'' +
                ", service=" + service +
                '}';
    }
}
