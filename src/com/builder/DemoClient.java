package com.builder;

/**
 * Demo client class. Everything comes together here.
 */
public class DemoClient {

    public static void main(String[] args) {
        Director director = new Director();

        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        // build house
        HouseBuilder houserBuilder = new HouseBuilder();
        director.buildHouse(houserBuilder);
        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        House house = houserBuilder.getResult();
        System.out.println("Building Built:\n" + house.getType());
        BuildingMiniatureBuilder miniatureBuilder = new BuildingMiniatureBuilder();
        // Director may know several building recipes.
        director.buildHouse(miniatureBuilder);
        Miniature miniature = miniatureBuilder.getResult();
        System.out.println("\nMiniature House Built: \n" + miniature.print());      

        // build villa
        VillaBuilder villaBuilder = new VillaBuilder();
        director.buildVilla(villaBuilder);
        Villa villa = villaBuilder.getResult();
        System.out.println("Building Built:\n" + villa.getType());
        miniatureBuilder = new BuildingMiniatureBuilder();
        director.buildVilla(miniatureBuilder);
        miniature = miniatureBuilder.getResult();
        System.out.println("\nMiniature Villa Built: \n" + miniature.print());
        
        // build commercial tower
        CommercialTowerBuilder ctBuilder = new CommercialTowerBuilder();
        director.buildCommercialTower(ctBuilder);
        CommercialTower ct = ctBuilder.getResult();
        System.out.println("Building Built:\n" + ct.getType());
        miniatureBuilder = new BuildingMiniatureBuilder();
        director.buildCommercialTower(miniatureBuilder);
        miniature = miniatureBuilder.getResult();
        System.out.println("\nMiniature Villa Built: \n" + miniature.print());
    }

}