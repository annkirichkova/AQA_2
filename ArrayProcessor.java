public class ArrayProcessor {
    public int processArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4) {
            throw new MyArraySizeException();
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException();
            }
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        ArrayProcessor processor = new ArrayProcessor();
        String[][] array = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int result = processor.processArray(array);
            System.out.println(result);
        } catch (MyArraySizeException e) {
            System.out.println("MyArraySizeException");
        } catch (MyArrayDataException e) {
            System.out.println("MyArrayDataException " + e.getRow() + " " + e.getCol());
        }
    }
}

class MyArraySizeException extends Exception {
}

class MyArrayDataException extends Exception {
    private int row;
    private int col;

    public MyArrayDataException(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() { return row; }
    public int getCol() { return col; }
}