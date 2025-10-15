package org.example;
import org.example.model.enums.LampType;

import org.example.model.*;
import org.example.model.enums.PaintColor; // PaintColor import edildi

public class Main {
    public static void main(String[] args) {

        // Lamp oluştur ve aç
        Lamp lamp = new Lamp( LampType.NEON,true, 100);
        lamp.turnOn();

        // Tavan oluştur
        Ceiling ceiling = new Ceiling(2, PaintColor.RED);
        ceiling.create();

        // Yatak oluştur
        Bed bed = new Bed("double", 2, 2, 2, 2);
        System.out.println(bed.toString());

        // Duvarlar
        Wall northWall = new Wall("North");
        Wall eastWall = new Wall("East");
        Wall westWall = new Wall("West");
        Wall southWall = new Wall("South");

        Wall[] walls = {northWall, eastWall, westWall, southWall};

        // Oda oluştur
        Bedroom bedroom = new Bedroom(
                northWall,
                eastWall,
                westWall,
                southWall,
                ceiling,
                bed,                   // doğru sırada Bed
                lamp,                  // doğru sırada Lamp
                new Wardrobe(1, 2, 12),// doğru sırada Wardrobe
                new Carpet(100, 200, PaintColor.WHITE) // doğru sırada Carpet
        );


        // Oda bilgilerini ekrana yaz
        System.out.println(bedroom.toString());

        // Odayı oluştur
        bedroom.createBedroom();
    }
}
