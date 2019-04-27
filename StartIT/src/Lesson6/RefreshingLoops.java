package Lesson6;

public class RefreshingLoops {
    public int multiplicationOfNumber(int number) {
        int sum = 0;
        int sum2 = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
                System.out.println(i);
            } else {
                sum2 += i;
            }

        }
        return sum;
    }
}
