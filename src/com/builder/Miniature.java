package com.builder;

/**
 * Miniature is another product. Note that it does not have the same ancestor
 * as a Building. They are not related (MiniatureMaterial can b card-board or plastic).
 */
public class Miniature {
	private int colCount;
	private int beamCount;
	private int wallCount;
	private BuildingType type;
	private int storyCount;   
	private int roomCount;
	private int doorCount;
	private MiniatureMaterial miniatureMaterial;
	
	public Miniature(MiniatureMaterial miniatureMaterial, int colCount, int beamCount, int wallCount, 
    		BuildingType type, int storyCount, int roomCount, int doorCount) {
		this.miniatureMaterial = miniatureMaterial;
        this.colCount = colCount;
        this.beamCount = beamCount;
        this.wallCount = wallCount;        
        this.type = type;
        this.storyCount = storyCount;
        this.roomCount = roomCount;
        this.doorCount = doorCount;
    }

	public String print() {
        String info = "";
        info += "Type of Miniature: " + type + "\n";
        info += "Miniature Material: " + miniatureMaterial + "\n";
        info += "Column Count: " + colCount + "\n";
        info += "Beam Count: " + beamCount + "\n";
        info += "Wall Count: " + wallCount + "\n";
        info += "Story Count: " + storyCount + "\n";
        info += "Room Count: " + roomCount + "\n";
        info += "Door Count: " + doorCount + "\n";
        
        return info;
    }
}