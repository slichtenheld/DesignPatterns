package FactoryMethod.MazeExample;

import FactoryMethod.MazeExample.Components.*;

/**
 * Created by Sam on 9/14/2016.
 */

//classes can then extend from this to specialize parts of the maze

public abstract class MazeGame {

    public Maze createMaze(){
        Maze aMaze = makeMaze();

        Room r1 = makeRoom(1);
        Room r2 = makeRoom(2);
        Door door1 = makeDoor(r1,r2);

        aMaze.addRoom(r1);
        aMaze.addRoom(r2);

        r1.setSide(Direction.NORTH, makeWall());
        r1.setSide(Direction.EAST, door1);
        r1.setSide(Direction.SOUTH, makeWall());
        r1.setSide(Direction.WEST, makeWall());

        r2.setSide(Direction.NORTH, makeWall());
        r2.setSide(Direction.EAST, makeWall());
        r2.setSide(Direction.SOUTH, makeWall());
        r2.setSide(Direction.WEST, door1);

        return aMaze;
    }

    //factory methods

    protected Maze makeMaze(){
        return new Maze();
    }

    protected Room makeRoom(int n){
        return new Room(n);
    }

    protected Wall makeWall(){
        return new Wall();
    }

    protected Door makeDoor(Room room1, Room room2){
        return new Door(room1, room2);
    }


}
