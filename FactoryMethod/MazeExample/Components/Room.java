package FactoryMethod.MazeExample.Components;

/**
 * Created by Sam on 9/14/2016.
 */

public class Room extends MapSite {

    private int roomNum;
    private MapSite sides[];

    public Room(int roomNum){
        this.roomNum = roomNum;
        sides = new MapSite[4]; //each room has 4 sides
    }

    public MapSite getSide(Direction d){
        return sides[d.ordinal()];
    }

    public void setSide(Direction d, MapSite mapSite){
        sides[d.ordinal()] = mapSite;
    }
    @Override
    void enter() {

    }
}
