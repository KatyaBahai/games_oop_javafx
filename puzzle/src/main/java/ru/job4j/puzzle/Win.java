package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1 && (checkVertical(board, i) || checkHorizontal(board, i))) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static boolean checkHorizontal(int[][] board, int cell) {
        boolean rsl = true;
        for (int row = 0; row < board.length; row++) {
            if (board[row][cell] != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static boolean checkVertical(int[][] board, int row) {
        boolean rsl = true;
        for (int cell = 0; cell < board.length; cell++) {
            if (board[row][cell] != 1) {
                        rsl = false;
                        break;
                    }
                }
        return rsl;
        }

    }
