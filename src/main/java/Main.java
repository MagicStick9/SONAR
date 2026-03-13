public class Main {

    public static void main(String[] args) {

        String text = "Hello";

        if (text == "Hello") {   // ❌ Sonar: неправильное сравнение строк
            System.out.println("Greeting detected");
        }

        int unusedVariable = 10; // ❌ Sonar: неиспользуемая переменная

        try {
            int result = divide(10, 0);
            System.out.println(result);
        } catch (Exception e) {
            // ❌ Sonar: пустой catch
        }

        printNumbers();
        printNumbers(); // ❌ Sonar: дублирование кода
    }

    public static int divide(int a, int b) {
        return a / b; // ❌ возможное деление на 0
    }

    public static void printNumbers() {

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Even: " + i);
            } else {
                System.out.println("Odd: " + i);
            }
        }

    }
}
