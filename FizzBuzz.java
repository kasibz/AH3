public class FizzBuzz {

    public static int fizzBuzz(int n) {
        if (n == 1) {
            return 1;
        } else {
            if (n % 3 == 0 && n % 5 == 0)
                System.out.println("FizzBuzz");
            else if (n % 3 == 0)
                System.out.println("Fizz");
            else if (n % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(n);
            n--;
            return fizzBuzz(n);
        }
    }

    public static void main(String[] args) {
        System.out.print(fizzBuzz(15));
        // System.out.print(fizzBuzz(30));
    }
}