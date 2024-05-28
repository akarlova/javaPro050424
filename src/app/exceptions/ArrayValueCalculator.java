package app.exceptions;

public class ArrayValueCalculator {
    public static int doCalc(String[][] array) throws ArraySizeException, ArrayDataException {
        if (array.length != 4 || checkArrayRows(array)) {
            throw new ArraySizeException("Size of array must be 4x4");
        }
        int sum = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("Invalid data at the cell [" + i + "][" + j + "] :"
                            + array[i][j]);
                } catch (Exception e) {
                    throw new ArrayDataException("Unexpected exception at [" + i + "][" + j + "]");
                }
            }
        }
        return sum;
    }

    private static boolean checkArrayRows(String[][] array) {
        for (String[] row : array) {
            if (row.length != 4) {
                return true;
            }
        }
        return false;
    }
}

