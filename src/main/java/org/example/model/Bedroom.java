package org.example.model;

public class Bedroom extends Room {
    private Bed bed;

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4,
                   Ceiling ceiling, Lamp lamp, Wardrobe wardrobe, Carpet carpet,
                   Bed bed) {
        super(name, wall1, wall2, wall3, wall4, ceiling, lamp, wardrobe, carpet);
        this.bed = bed;
    }

    public Bed getBed() {
        return bed;
    }
}
