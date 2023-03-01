package Section6.Challenges;

import java.util.Scanner;

public class ThePrimeNumberChallenge {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int result = input.nextInt();

        //System.out.println(counter(result, (isPrime(result))));
        counter(result);
    }
    public static boolean isPrime(int wholeNumber) {

        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static int counter (int register) {

        int i1 = 1;
        for (int i = register; i1 <= 3; i++) {
            if (isPrime(i)) {
                i1++;
                System.out.println(i + " is a prime number.");
            }
        }
        return i1;
    }
}
