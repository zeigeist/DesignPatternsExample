package com.builder;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {    
    public void setColumns(int colCount);
    public void setBeams(int beamCount);
    public void setWalls(int wallCount);
    public void setRooms(int i);   
    public void setDoors(int doorCount);
    public void setBuildingType(BuildingType type);
    public void setNumberOfStories(int storyCount);
}