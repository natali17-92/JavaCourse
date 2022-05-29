public class BasicStructures {
    public static void main(String[] args) {
        System.out.println(summInt(5,6));
        positiveNum(-2);
        System.out.println(positiveNumBoolRezult(-1));
        PrintString("Вывести эту строку %d раз",5);

    }
    public static boolean summInt(int a, int b) {
        if ((a + b) >= 10 && (a + b) <= 20) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void positiveNum(int a) {
        if (a >= 0 ) {
            System.out.println("Положительное");
        }
        else {
            System.out.println("Отрицательное");
        }
    }
    public static boolean positiveNumBoolRezult(int a) {
        if (a < 0 ) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void PrintString(String word, int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.printf(word, amount);
            System.out.println();
        }
    }

}
