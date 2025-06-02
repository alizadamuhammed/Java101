package main.java101.minesweeper;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    public static void main(String[] args) {

    }

    public void start() {
        int rowOfMatrix = 3;
        int columnOfMatrix = 4;
        int countOfTotalMines = 3;
        String[][] mineMap = new String[rowOfMatrix][columnOfMatrix];
        String[][] playerBoard = new String[rowOfMatrix][columnOfMatrix];
        fillMatrix(mineMap);
        fillMatrix(playerBoard);
        randomMine(mineMap, rowOfMatrix, columnOfMatrix);
        printMatrix(mineMap);

        Scanner input = new Scanner(System.in);
        boolean isGameOver = false;
        int totalSafeCells = rowOfMatrix * columnOfMatrix - countOfTotalMines;
        int openedSafeCells = 0;

        while (!isGameOver) {
            System.out.println("Enter row (1-3): ");
            int row = input.nextInt() - 1;
            System.out.println("Enter column (1-4): ");
            int col = input.nextInt() - 1;

            if (row < 0 || row >= rowOfMatrix || col < 0 || col >= columnOfMatrix) {
                System.out.println("Invalid row or column, try again.");
                continue;
            }

            if (mineMap[row][col].equals("*")) {
                System.out.println("You opened the mine cell. Game over!");
                revealMines(playerBoard, mineMap);
                printMatrix(playerBoard);
                isGameOver = true;
                break;
            }

            if (!playerBoard[row][col].equals("-")) {
                System.out.println("This cell is already opened. Try another one.");
                continue;
            }

            int count = findMinesAroundTheCell(mineMap, row, col);
            playerBoard[row][col] = String.valueOf(count);
            openedSafeCells++;
            printMatrix(playerBoard);

            if (openedSafeCells == totalSafeCells) {
                System.out.println("You won the game. Congratulations!");
                revealMines(playerBoard, mineMap);
                printMatrix(playerBoard);
                isGameOver = true;
            }
        }
    }

    static void revealMines(String[][] playerBoard, String[][] mineMap) {
        for (int i = 0; i < mineMap.length; i++) {
            for (int j = 0; j < mineMap[i].length; j++) {
                if (mineMap[i][j].equals("*")) {
                    playerBoard[i][j] = "*";
                }
            }
        }
    }


    static void randomMine(String[][] matrix, int rowOfMatrix, int columnOfMatrix) {
        Random random = new Random();
        int mineCounter = 0;
        while (mineCounter < matrix.length) {
            int row = random.nextInt(rowOfMatrix);
            int column = random.nextInt(columnOfMatrix);
            if (!checkMine(matrix, row, column)) {
                matrix[row][column] = "*";
                mineCounter++;
            }

        }
    }

    static boolean checkMine(String[][] matrix, int rowOfMatrix, int columnOfMatrix) {
        return matrix[rowOfMatrix][columnOfMatrix].equals("*");
    }


    static void printMatrix(String[][] matrix) {
        System.out.println("==========================");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void fillMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = "-";
            }
        }
    }


    static void fillCellWithStar(String[][] matrix, int row, int column) {
        matrix[row][column] = "*";
    }

    static void fillCellWithCount(String[][] matrix, int row, int column, int count) {
        matrix[row][column] = String.valueOf(count);
    }

    static int findMinesAroundTheCell(String[][] matrix, int row, int col) {
        int count = 0;
        int rowCount = matrix.length;
        int colCount = matrix[0].length;

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (i == 0 && j == 0) continue;

                int newRow = row + i;
                int newCol = col + j;

                if (newRow >= 0 && newRow < rowCount && newCol >= 0 && newCol < colCount) {
                    if (matrix[newRow][newCol].equals("*")) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
