package com.company;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MazeSolverTest {

    @Test
    @DisplayName("Test to move right (possible), expected ok")
    void testValidMoveToRight() {
        // arrange
        char[][] maze = new char[][]
                {{'S', '0', '1'},
                {'1', '0', '1'},
                {'1', '0', 'E'}};
        boolean[][] isVisited = new boolean[maze.length][maze[0].length];
        isVisited[0][0] = true;

        // act & assert
        assertEquals(true, MazeSolver.isValidMove(maze, isVisited, 0, 1));
    }

    @Test
    @DisplayName("Test to move right (not possible), expected ok")
    void testInvalidMoveToRight() {
        // arrange
        char[][] maze = new char[][]
                {{'S', '1', '1'},
                {'0', '0', '1'},
                {'1', '0', 'E'}};
        boolean[][] isVisited = new boolean[maze.length][maze[0].length];
        isVisited[0][0] = true;

        // act & assert
        assertEquals(false, MazeSolver.isValidMove(maze, isVisited, 0, 1));
    }

    @Test
    @DisplayName("Test to move down (possible), expected ok")
    void testValidMoveToDownSide() {
        // arrange
        char[][] maze = new char[][]
                        {{'S', '1', '1'},
                        {'0', '0', '1'},
                        {'1', '0', 'E'}};
        boolean[][] isVisited = new boolean[maze.length][maze[0].length];
        isVisited[0][0] = true;

        // act & assert
        assertEquals(true, MazeSolver.isValidMove(maze, isVisited, 1, 0));
    }

    @Test
    @DisplayName("Test to move down (not possible), expected ok")
    void testInvalidMoveToDownSide() {
        // arrange
        char[][] maze = new char[][]
                        {{'S', '0', '1'},
                        {'1', '0', '1'},
                        {'1', '0', 'E'}};
        boolean[][] isVisited = new boolean[maze.length][maze[0].length];
        isVisited[0][0] = true;

        // act & assert
        assertEquals(false, MazeSolver.isValidMove(maze, isVisited, 1, 0));
    }

    @Test
    @DisplayName("Test to move beyond upside border, expected ok")
    void testInvalidMoveToBeyondUpsideBorder() {
        // arrange
        char[][] maze = new char[][]
                        {{'S', '0', '1'},
                        {'1', '0', '1'},
                        {'1', '0', 'E'}};
        boolean[][] isVisited = new boolean[maze.length][maze[0].length];
        isVisited[0][0] = true;

        // act & assert
        assertEquals(false, MazeSolver.isValidMove(maze, isVisited, -1, 0));
    }

    @Test
    @DisplayName("Test to move beyond border on left side, expected ok")
    void testInvalidMoveToBeyondBorderOnLeftSide() {
        // arrange
        char[][] maze = new char[][]
                        {{'S', '0', '1'},
                        {'1', '0', '1'},
                        {'1', '0', 'E'}};
        boolean[][] isVisited = new boolean[maze.length][maze[0].length];
        isVisited[0][0] = true;

        // act & assert
        assertEquals(false, MazeSolver.isValidMove(maze, isVisited, 0, -1));
    }

    @Test
    @DisplayName("Test a solvable 3x3 maze, expected ok")
    void testSolvableThreeByThreeMaze() {
        // arrange
        char[][] maze = new char[][]
                {{'S', '0', '1'},
                        {'1', '0', '1'},
                        {'1', '0', 'E'}};
        boolean[][] isVisited = new boolean[maze.length][maze[0].length];
        isVisited[0][0] = true;

        // act & assert
        assertEquals(true, MazeSolver.findTheWay(maze, isVisited, 0, 0));
    }

    @Test
    @DisplayName("Test an unsolvable 3x3 maze, expected ok")
    void testUnsolvableThreeByThreeMaze() {
        // arrange
        char[][] maze = new char[][]
                        {{'S', '0', '1'},
                        {'1', '0', '1'},
                        {'1', '1', 'E'}};
        boolean[][] isVisited = new boolean[maze.length][maze[0].length];
        isVisited[0][0] = true;

        // act & assert
        assertEquals(false, MazeSolver.findTheWay(maze, isVisited, 0, 0));
    }

    @Test
    @DisplayName("Test a solvable 4x4 maze, expected ok")
    void testSolvableFourByFourMaze() {
        // arrange
        char[][] maze = new char[][]
                {{'S', '0', '1', '0'},
                {'0', '1', 'E', '1'},
                {'0', '0', '0', '0'},
                {'1', '1', '0', '1'}};
        boolean[][] isVisited = new boolean[maze.length][maze[0].length];
        isVisited[0][0] = true;

        // act & assert
        assertEquals(true, MazeSolver.findTheWay(maze, isVisited, 0, 0));
    }

    @Test
    @DisplayName("Test an unsolvable 4x4 maze, expected ok")
    void testUnsolvableFourByFourMaze() {
        // arrange
        char[][] maze = new char[][]
                        {{'S', '0', '1', '0'},
                        {'0', '1', 'E', '0'},
                        {'0', '0', '1', '0'},
                        {'1', '1', '0', '1'}};
        boolean[][] isVisited = new boolean[maze.length][maze[0].length];
        isVisited[0][0] = true;

        // act & assert
        assertEquals(false, MazeSolver.findTheWay(maze, isVisited, 0, 0));
    }

    @Test
    @DisplayName("Test a solvable 5x5 maze, expected ok")
    void testSolvableFiveByFiveMaze() {
        // arrange
        char[][] maze = new char[][]
                        {{'S', '0', '1', '1', '1'},
                        {'0', '1', '1', '0', 'E'},
                        {'0', '0', '1', '0', '1'},
                        {'1', '0', '0', '0', '1'},
                        {'0', '1', '0', '1', '1'}};
        boolean[][] isVisited = new boolean[maze.length][maze[0].length];
        isVisited[0][0] = true;

        // act & assert
        assertEquals(true, MazeSolver.findTheWay(maze, isVisited, 0, 0));
    }

    @Test
    @DisplayName("Test an unsolvable 5x5 maze, expected ok")
    void testUnsolvableFiveByFiveMaze() {
        // arrange
        char[][] maze;
        maze = new char[][]
                        {{'S', '0', '0', '1', '1'},
                        {'0', '1', '1', '0', 'E'},
                        {'0', '0', '1', '0', '1'},
                        {'1', '0', '0', '1', '0'},
                        {'0', '1', '0', '1', '1'}};
        boolean[][] isVisited = new boolean[maze.length][maze[0].length];
        isVisited[0][0] = true;

        // act & assert
        assertEquals(false, MazeSolver.findTheWay(maze, isVisited, 0, 0));
    }
}