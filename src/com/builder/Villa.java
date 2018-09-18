package com.builder;

/**
 * Villa is a product class.
 */
public class Villa {
    private Foundation foundation;
	private int colCount;
	private int beamCount;
	private int wallCount;
	private Roofing roofing;
	private BuildingType type;
	private int storyCount;   
	private int roomCount;
	private int doorCount;

    public Villa(Foundation foundation, int colCount, int beamCount, int wallCount, 
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

    public void setFoundation(Foundation foundation) {
		this.foundation = foundation;
	}
    
	public Foundation getFoundation() {
		return foundation;
	}

	public Roofing getRoofing() {
		return roofing;
	}

    public void setRoofing(Roofing roofing) {
		this.roofing = roofing;
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