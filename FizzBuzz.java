public class FizzBuzz {

    public static void fizzBuzz(int n) {
        // Count up from the base case
        // this way basically ignores the call stack
        // no recursive case.
        if (n >= 1) {

            fizzBuzz(n - 1);
            if (n % 3 == 0 && n % 5 == 0)
                System.out.println("FizzBuzz");
            else if (n % 3 == 0)
                System.out.println("Fizz");
            else if (n % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(n);
            return;
        }
    }

    public static void main(String[] args) {
        fizzBuzz(15);
        // System.out.print(fizzBuzz(30));
    }
}