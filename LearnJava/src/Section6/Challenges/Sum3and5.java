package Section6.Challenges;

import java.util.Scanner;

public class Sum3and5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result = input.nextInt();

        int count = 0;
        int sum = 0;
        for (int i = result; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 ==0)) {
                count ++;
                sum = sum + i;
                System.out.println(i);
                if (count == 5) {
                    break;
                }
            }
        }
        System.out.println("Sum = " + sum);
    }
}
