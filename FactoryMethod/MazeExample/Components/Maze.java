package FactoryMethod.MazeExample.Components;

import java.util.ArrayList;

/**
 * Created by Sam on 9/14/2016.
 */
public class Maze {

    private ArrayList<Room> rooms;

    public Maze(){
        rooms = new ArrayList<>(0);
    }

    public void addRoom(Room room){
        rooms.add(room);
    }

    public Room roomNo(int n){
        return rooms.get(n);
    }
}
