package com.builder;

/**
 * Miniature is another product. Note that it does not have the same ancestor
 * as a Building. They are not related.
 */
public class Miniature {
	private Foundation foundation;
	private int colCount;
	private int beamCount;
	private int wallCount;
	private Roofing roofing;
	private BuildingType type;
	private int storyCount;   
	private int roomCount;
	private int doorCount;

	public Miniature(Foundation foundation, int colCount, int beamCount, int wallCount, 
    		Roofing roofing, BuildingType type, int storyCount, int roomCount, int doorCount) {
        this.foundation = foundation;
        this.colCount = colCount;
        this.beamCount = beamCount;
        this.wallCount = wallCount;
        this.roofing = roofing;
        this.type = type;
        this.storyCount = storyCount;
        this.roomCount = roomCount;
        this.doorCount = doorCount;
    }

	public String print() {
        String info = "";
        info += "Type of Miniature: " + type + "\n";
        info += "Foundation Type: " + foundation + "\n";
        info += "Column Count: " + colCount + "\n";
        info += "Beam Count: " + beamCount + "\n";
        info += "Wall Count: " + wallCount + "\n";
        info += "Roofing Type: " + roofing + "\n";
        info += "Story Count: " + storyCount + "\n";
        info += "Room Count: " + roomCount + "\n";
        info += "Door Count: " + doorCount + "\n";
        
        return info;
    }
}