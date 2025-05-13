package org.example;

import org.example.model.*;
import org.example.model.enums.*;

public class Main {
    public static void main(String[] args) {
        // Ortak oda parçaları
        Wall n = new Wall("North");
        Wall s = new Wall("South");
        Wall e = new Wall("East");
        Wall w = new Wall("West");
        Ceiling ceiling = new Ceiling(3, PaintColor.WHITE);
        Lamp lamp = new Lamp(LampType.NEON, true, 60);
        Wardrobe wardrobe = new Wardrobe(100, 200, 80.5);
        Carpet carpet = new Carpet(300, 400, PaintColor.RED);

        // Yatak odasına özel
        Bed bed = new Bed("Modern", 2, 1, 1, 1);

        // Bedroom nesnesi (Room üzerinden türetilmiş)
        Bedroom bedroom = new Bedroom(
                "MyRoom", n, s, e, w,
                ceiling, lamp, wardrobe, carpet,
                bed
        );

        // Test çağrıları
        bedroom.getBed().make();
        bedroom.getLamp().turnOn();
        bedroom.getWardrobe().add();
        bedroom.getCarpet().lying();
        bedroom.getCeiling().create();
        bedroom.getWall1().create();

        System.out.println("Room name: " + bedroom.getName());
    }
}
