package FactoryMethod.MazeExample.Components;

/**
 * Created by Sam on 9/14/2016.
 */
public class Door extends MapSite {

    private Room room1,room2;
    private boolean isOpen;

    public Door(Room room1 , Room room2){
        this.room1 = room1;
        this.room2 = room2;
    }

    public Room otherSideFrom(Room room){
        if (room == room1) return room2;
        if (room == room2) return room1;
        return null;
    }
    @Override
    void enter() {

    }
}
