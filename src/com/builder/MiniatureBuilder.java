package com.builder;

/**
 * Unlike other creational patterns, Builder can construct unrelated products,
 * which don't have the common interface.
 *
 * In this case we build a miniature for a building, using the same steps as we
 * built any building, house, villa or commercial tower. 
 */
public class MiniatureBuilder implements Builder {
	private int colCount;
	private int beamCount;
	private int wallCount;
	private int doorCount;
	private BuildingType type;
	private int storyCount;
	private int roomCount;
	private MiniatureMaterial miniatureMaterial;
	
	public Miniature getResult() {		
		return new Miniature(miniatureMaterial, colCount, beamCount, wallCount, type, storyCount, roomCount, doorCount);
	}

	public void setMiniatureMaterial(MiniatureMaterial miniatureMaterial) {
		this.miniatureMaterial = miniatureMaterial;
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