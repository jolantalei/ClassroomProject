package Lesson5;

public class FactorialTest {
    public static void main(String[] args) {
        int firstInput=4;
        int factorial=1;
        for (int i =1; i <=firstInput; i++) {
            factorial = factorial * i;
            System.out.println(factorial);
        }
    }
}
