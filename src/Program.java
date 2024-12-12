import java.util.Arrays;
    // Задание 1.
    public class Program {
        public static void printThreeWords() {

            System.out.print("Orange\nBanana\nApple\n");
        }

        // Задание 2.
        public static void summ() {
            int a = 20;
            int b = 5;
            int sum = a + b;
            if (sum >= 0) {
                System.out.println("Сумма положительная");
            } else {
                System.out.println("Сумма отрицательная");
            }
        }

        // Задание 3.
        public static void printColor() {
            int value = 5;
            if (value <= 0) {
                System.out.println("Красный");
            } else if (value <= 100)
                System.out.println("Желтый");
            else

                System.out.println("Зеленый");
        }

        // Задание 4.
        public static void compareNumbers() {
            int a = 5;
            int b = 15;
            if (a >= b) {
                System.out.println("a >= b");
            } else {
                System.out.println("a < b");
            }
        }

        // Задание 5.
        public static boolean checkSum(int a, int b) {
            int sum = a + b;
            if (sum >= 10 && sum <= 20) {
                return true;
            } else {
                return false;
            }
        }

        // Задание 6.
        public static void positiveOrNegative(int a) {
            if (a >= 0) {
                System.out.println("Число положительное");
            } else {
                System.out.println("Число отрицательное");
            }
        }

        // Задание 7.
        public static boolean methodTF(int a) {
            if (a < 0) {
                return true;
            } else {
                return false;
            }
        }

        // Задание 8.
        public static void writeName(String name, int num) {
            for (int i = 0; i < num; i++) {
                System.out.println(name);
            }
        }

        // Задание 9.
        public static boolean Leapyear(int a) {
            if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
                return true;
            } else {
                return false;
            }
        }

        // Задание 10.
        public static void newArray() {
            int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
            // int[] array = new int[10];
            System.out.println(Arrays.toString(array));
            for (int i = 0; i < array.length; i++)
                array[i] = (array[i] == 1) ? 0 : 1;
            System.out.println(Arrays.toString(array));
        }
        // Задание 11.
        public static void newArrayHundred(){
            int[] array = new int[100];
            for (int i = 0; i < array.length; i++){
                array[i] = i +1;
                System.out.print(array [i] + " ");
            }
        }
        // Задание 12.
        public static void newArraySix(){
            int [] mas = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i = 0; i < mas.length; i++) {
                if (mas [i] < 6) {
                    mas[i] = mas[i] * 2;

                    System.out.print(mas[i] + " ");
                }
            }
        }
        // Задание 13.
        public static void newArrayTwoDimensional() {
            int[][] mas = new int [5][5];
            for (int i = 0; i <mas.length; i++){
                for (int j = 0; j < mas.length; j++){
                    if (i==j) {
                        mas[i][j] = 1;
                    } else{
                        mas[i][j]=0;
                    }
                    System.out.print(mas[i][j] + " ");
                }
                System.out.println();
            }

        }
        // Задание 14.
        public static int [] newArrayLen(int len, int intialValue) {
            int[] newArrayLen = new int[len];
            for (int i = 0; i < newArrayLen.length; i++) {
                newArrayLen[i] = intialValue;
            }
            return newArrayLen;
        }










            }






