package org.example.model;
import org.example.model.enums.LampType;

// LampType enum’unu import et

public class Lamp {
    private LampType type;
    private boolean battery;
    private int globRating;

    // Constructor
    public Lamp(LampType type, boolean battery, int globRating) {
        this.type = type;
        this.battery = battery;
        this.globRating = globRating;
    }

    // Lambayı aç
    public void turnOn() {
        System.out.println("Lamp is turned on.");
    }

    // Lambayı kapat
    public void turnOff() {
        System.out.println("Lamp is turned off.");
    }

    // Getterlar
    public LampType getType() {
        return type;
    }

    public boolean hasBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }

    // toString() override
    @Override
    public String toString() {
        return "Lamp{" +
                "type=" + type +
                ", battery=" + battery +
                ", globRating=" + globRating +
                '}';
    }
}
