package org.example;

import org.example.model.*;
import org.example.model.enums.*;

public class Main {
    public static void main(String[] args) {
        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("West");

        Ceiling ceiling = new Ceiling(3, PaintColor.WHITE);
        Bed bed = new Bed("Modern", 2, 1, 1, 1);
        Lamp lamp = new Lamp(LampType.NEON, true, 60);
        Wardrobe wardrobe = new Wardrobe(100, 200, 80.5);
        Carpet carpet = new Carpet(300, 400, PaintColor.RED);

        Bedroom bedroom = new Bedroom("MyRoom", wall1, wall2, wall3, wall4, ceiling, bed, lamp, wardrobe, carpet);

        // Test metotları
        bedroom.getBed().make();
        bedroom.getLamp().turnOn();
        bedroom.getWardrobe().add();
        bedroom.getCarpet().lying();
        bedroom.getCeiling().create();
        bedroom.getWall1().create();
    }
}
