public class Main {
    public static void main(String[] args) {
        String[][] array = {
                {"1", "10", "15", "Собака"},
                {"2", "20", "25", "55"},
                {"3", "Кот", "35", "60"},
                {"4", "40", "$", "75"}
        };
        String[][] incorrectArray = {
                {"1", "2", "3"},
                {"10", "15", "20"}
        };

        checkArray(array);
        checkArray(incorrectArray);
    }

    public static void checkArray(String[][] array) {
        try {
            int sum = checkSumArray(array);
            System.out.println("Сумма элементов массива = " + sum + "\n");
        } catch (MyArraySizeException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }

    public static int checkSumArray(String[][] array) throws MyArraySizeException {
        if (array.length != 4) {
            throw new MyArraySizeException("Размер массива должен быть 4x4.");
        }
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException("Каждая строка массива должна содержать 4 элемента");
            }
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    System.err.println(" Невозможно преобразовать в число " + array[i][j]);
                }
            }
        }

        return sum;
    }
}