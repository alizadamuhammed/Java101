package main.java101.arrays;

import java.util.Arrays;

public class LetterA {
    public static void main(String[] args) {
        String[][] letter = new String[6][4];

        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                if (i == 0 || i == 2 || j == 0 || j == 3) {
                    letter[i][j] = " * ";
                } else {
                    letter[i][j] = "   ";
                }
            }
        }

        for(String[] row : letter){
            for(String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
