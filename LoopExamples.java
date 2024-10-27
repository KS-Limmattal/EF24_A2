public class LoopExamples { 

    static int countDigits(int n) {
        int digits = 0;
        while (n != 0) {
            digits++; // fancy way to say "digits = digits + 1;"
            n = n / 10;
        }
        return digits;
    }

    static int power(int base, int n) {
        int power = 1;
        for (int i = 0; i < n; i++) {
            power = power * base;
        }
        return power;
    }

    public static void main(String[] args) {
        int x = 10432;
        int y = -234;
        System.out.println(x + " has " + countDigits(x) + " digits.");
        System.out.println(y + " has " + countDigits(y) + " digits.");
        int a = 2;
        int b = 4;
        System.out.println("The " + b + "-th power of " + a + " is " + power(a,b));
    }
}
