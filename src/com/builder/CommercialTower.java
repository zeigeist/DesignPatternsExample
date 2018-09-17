package com.builder;

/**
 * CommercialTower is a product class.
 */
public class CommercialTower {
    private Foundation foundation;
	private int colCount;
	private int beamCount;
	private int wallCount;
	private Roofing roofing;
	private BuildingType type;
	private int storyCount;   
	private int roomCount;
	private int doorCount;

    public CommercialTower(Foundation foundation, int colCount, int beamCount, int wallCount, 
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

	public Foundation getFoundation() {
		return foundation;
	}

	public int getColCount() {
		return colCount;
	}

	public int getBeamCount() {
		return beamCount;
	}

	public int getWallCount() {
		return wallCount;
	}

	public Roofing getRoofing() {
		return roofing;
	}

	public BuildingType getType() {
		return type;
	}

	public int getStoryCount() {
		return storyCount;
	}

	public int getRoomCount() {
		return roomCount;
	}
	
	public int getDoorCount() {
		return doorCount;
	}
}