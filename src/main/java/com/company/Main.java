package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        char[][] firstMaze = new char[][]{{'S', '0', '1'},
                {'1', '0', '1'},
                {'1', '0', 'E'}};
        char[][] secondMaze = new char[][]{{'S', '0', '1', '0'},
                {'0', '1', 'E', '1'},
                {'0', '0', '0', '0'},
                {'1', '1', '0', '1'}};
        char[][] thirdMaze = new char[][]{{'S', '0', '0', '1'},
                {'0', '1', '0', '0'},
                {'1', '0', '1', '0'},
                {'E', '0', '0', '0'}};
        int x = 0;
        int y = 0;
        boolean[][] isVisitedFirstMaze = new boolean[firstMaze.length][firstMaze[0].length];
        isVisitedFirstMaze[x][y] = true;
        boolean[][] isVisitedSecondMaze = new boolean[secondMaze.length][secondMaze[0].length];
        isVisitedSecondMaze[x][y] = true;
        boolean[][] isVisitedThirdMaze = new boolean[thirdMaze.length][thirdMaze[0].length];
        isVisitedThirdMaze[x][y] = true;

        System.out.println(MazeSolver.findTheWay(firstMaze, isVisitedFirstMaze, x, y));
//        System.out.println("-----------------------------------------------------------------");
        System.out.println(MazeSolver.findTheWay(secondMaze, isVisitedSecondMaze, x, y));
//        System.out.println("-----------------------------------------------------------------");
        System.out.println(MazeSolver.findTheWay(thirdMaze, isVisitedThirdMaze, x, y));
    }
}

