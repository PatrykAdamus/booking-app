package pl.adamus.patryk.java.app.booking.model;

public enum GenderType {
    MALE("male", 1),
    FEMALE("female", 2);

    private String name;
    private int code;

    GenderType(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }
}
