package ru.geekbrains.lesson_2_home_work.math;

public class Matrix {

    public static class MyArraySizeException extends RuntimeException {

        private MyArraySizeException() {
            super("Некорректное количество строк");
        }

        private MyArraySizeException(int row) {
            super("Некорректное количество столбцов в строке " + row);
        }
    }

    public static class MyArrayDataException extends RuntimeException {

        private MyArrayDataException(String cellValue, int row, int col) {
            super("Cell [" + row + ", " + col + "] = " + cellValue);
        }
    }

    public static int sumMatrix(String[][] mat) {
        return sumMatrix(mat, 4, 4);
    }

    private static int sumMatrix(String[][] mat, int rowCount, int colCount){
        if(mat.length != rowCount) throw new MyArraySizeException();
        int sum = 0;
        for (int i = 0; i < rowCount; i++) {
            String[] row = mat[i];
            if(row.length != colCount) throw new MyArraySizeException(i);
            for (int j = 0; j < colCount; j++) {
                try {
                    sum += Integer.parseInt(mat[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(mat[i][j], i, j);
                }
            }
        }
        return sum;
    }
}
