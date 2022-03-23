package com.company;

public class MazeSolver {

    public static void printMaze(char[][] maze) {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                if (j == maze[i].length-1) {
                    System.out.print(maze[i][j]);
                } else {
                    System.out.print(maze[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static boolean isValidMove(char[][] maze, boolean[][] isVisited, int newPosX, int newPosY) {
        if (newPosX < 0 || newPosX > maze.length-1) {
            return false;
        }
        if (newPosY < 0 || newPosY > maze[newPosX].length-1) {
            return false;
        }
        if (maze[newPosX][newPosY] == '1') {
            return false;
        }
        if (isVisited[newPosX][newPosY]) {
            return false;
        }
        return true;
    }

    public static boolean findTheWay(char[][] maze, boolean[][] isVisited, int x, int y) {
//        printMaze(maze);
//        System.out.println("--------------------------------------------------------------------------");
//        System.out.println("--------------------------------------------------------------------------");
//        System.out.print("x: " + x + ",   y: " + y);
//        System.out.println();
//        System.out.println();
        if (maze[x][y] == 'E') {
            return true;
        }
        boolean found = false;

        // move to the downside available?
        if (isValidMove(maze, isVisited, x+1, y)) {
            isVisited[x+1][y] = true;
            found = findTheWay(maze, isVisited, x+1, y);
            if (found) {
                maze[x+1][y] = 'x';
            }
        }
        // move to the right side available?
        if (!found && isValidMove(maze, isVisited, x, y+1)) {
            isVisited[x][y+1] = true;
            found = findTheWay(maze, isVisited, x, y+1);
            if (found) {
                maze[x][y+1] = 'x';
            }
        }
        // move to the left side available?
        if (!found && isValidMove(maze, isVisited, x, y-1)) {
            isVisited[x][y-1] = true;
            found = findTheWay(maze, isVisited, x, y-1);
            if (found) {
                maze[x][y-1] = 'x';
            }
        }
        // move to the upside available?
        if (!found && isValidMove(maze, isVisited, x-1, y)) {
            isVisited[x-1][y] = true;
            found = findTheWay(maze, isVisited, x-1, y);
            if (found) {
                maze[x-1][y] = 'x';
            }
        }
        if (found && maze[x][y] == 'S') {
            maze[x][y] = 'x';
        }
        return found;
    }
}
