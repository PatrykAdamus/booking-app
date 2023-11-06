package pl.adamus.patryk.java.app.booking.model;

public enum DurationType {
    MINUTE("Minute"),
    HOUR("Hour");

    private String name;
//    private int time;
    DurationType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
