package metodus;

public class ketSzamOsszeadasa {

    public static void main2(String[] args) {
        int numberOne;
        int numberTwo;
        numberOne = 2;
        numberTwo = 2;
        int result = sumXy(numberTwo, numberTwo);
        twoNumbersSumPrint(numberOne, numberTwo, result);
        twoNumbersSumPrint(result, 2, sumXy(result, 2));

    }

    static int sumXy(int x, int y) {
        return x + y;
    }

    static void twoNumbersSumPrint(int numberOne, int numberTwo, int result) {
        System.out.println("--------------");
        System.out.printf("| %d + %d = %d | \n", numberOne, numberTwo, result);
        System.out.println("--------------");
    }
}
