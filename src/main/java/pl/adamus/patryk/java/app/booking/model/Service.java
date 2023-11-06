package pl.adamus.patryk.java.app.booking.model;

import java.math.BigDecimal;

public class Service {

    private String name;
    private int duration;
    //  27.09.2023 zamienic String durationType na nowy wlasny enum. analogicznie do GenderType
    private DurationType durationType;
    private BigDecimal price;


    @Override
    public String toString() {
        return "Service{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", durationType='" + durationType + '\'' +
                ", price=" + price +
                '}';
    }
}

// 19.09.2023 praca domowa
// zaproponowac i wprowadzic atrybuty dla klasy service i zrobic POJO

