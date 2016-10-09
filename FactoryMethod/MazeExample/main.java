package FactoryMethod.MazeExample;

import FactoryMethod.MazeExample.Components.Maze;

/**
 * Created by Sam on 9/14/2016.
 */
public class main {

    public static void main(String[] args){
        MazeGame mazeCreator = new MazeGame();
        Maze maze = mazeCreator.createMaze();
    }
}
