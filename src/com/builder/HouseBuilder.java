package com.builder;

/**
 * Concrete builders implement steps defined in the common interface.
 */
public class HouseBuilder implements Builder { 
	private Foundation foundation;
	private int colCount;
	private int beamCount;
	private int wallCount;
	private Roofing roofing;
	private int doorCount;
	private BuildingType type;
	private int storyCount;   
	private int roomCount;

	public House getResult() {
		return new House(foundation, colCount, beamCount, wallCount, roofing, type, storyCount, roomCount, doorCount);
	}

	public void setFoundation(Foundation foundation) {
		this.foundation = foundation;		
	}

	public void setRoofing(Roofing roofing) {
		this.roofing = roofing;	
	}
	
	@Override
	public void setColumns(int colCount) {
		this.colCount = colCount;
	}

	@Override
	public void setBeams(int beamCount) {
		this.beamCount = beamCount;		
	}

	@Override
	public void setWalls(int wallCount) {
		this.wallCount = wallCount;
	}	

	@Override
	public void setRooms(int roomCount) {
		this.roomCount = roomCount;		
	}

	@Override
	public void setDoors(int doorCount) {
		this.doorCount = doorCount;
	}

	@Override
	public void setBuildingType(BuildingType type) {
		this.type = type;	
	}

	@Override
	public void setNumberOfStories(int storyCount) {
		this.storyCount = storyCount;
	}	
}