package com.builder;

/**
 * Director defines the order of building steps. It works with a builder object
 * through common Builder interface. Therefore it may not know what product is
 * being built.
 */
public class Director {

    public void buildHouse(Builder builder) {
        builder.setFoundation(Foundation.SHALLOW);
        builder.setColumns(12);
        builder.setBeams(24);
        builder.setRoofing(Roofing.WOOD);
        builder.setBuildingType(BuildingType.HOUSE);
        builder.setWalls(20);
        builder.setNumberOfStories(1);
        builder.setRooms(3);
        builder.setDoors(3);
    }

    public void buildVilla(Builder builder) {
        builder.setFoundation(Foundation.SHALLOW);
        builder.setColumns(75);
        builder.setBeams(150);
        builder.setRoofing(Roofing.CLAY);
        builder.setBuildingType(BuildingType.VILLA);
        builder.setWalls(75);
        builder.setNumberOfStories(3);
        builder.setRooms(20);
        builder.setDoors(20);
    }

    public void buildCommercialTower(Builder builder) {
        builder.setFoundation(Foundation.DEEP);
        builder.setColumns(500);
        builder.setBeams(1000);
        builder.setRoofing(Roofing.METAL);
        builder.setBuildingType(BuildingType.COMMERCIAL_TOWER);
        builder.setWalls(2000);
        builder.setNumberOfStories(20);
        builder.setRooms(200);
        builder.setDoors(200);
    }
}
