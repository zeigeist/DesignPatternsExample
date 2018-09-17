package com.builder;



/**
 * Unlike other creational patterns, Builder can construct unrelated products,
 * which don't have the common interface.
 *
 * In this case we build a miniature for a building, using the same steps as we
 * built any building, house, villa or commercial tower. 
 */
public class BuildingMiniatureBuilder implements Builder {
	private Foundation foundation;
	private int colCount;
	private int beamCount;
	private int wallCount;
	private Roofing roofing;
	private int doorCount;
	private BuildingType type;
	private int storyCount;   
	private int roomCount;
	
	public Miniature getResult() {		
		return new Miniature(foundation, colCount, beamCount, wallCount, roofing, type, storyCount, roomCount, doorCount);
	}

	@Override
	public void setFoundation(Foundation foundation) {
		this.foundation = foundation;		
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
	public void setRoofing(Roofing roofing) {
		this.roofing = roofing;	
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