public class FizzBuzz {

    private static int START = 1;

    public static int fizzBuzz(int n) {
        // if start = 1,
        if (START > n) {
            return 0;
        } else {
            if (START % 3 == 0 && START % 5 == 0)
                System.out.println("FizzBuzz");
            else if (START % 3 == 0)
                System.out.println("Fizz");
            else if (START % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(START);
            START++;
            return fizzBuzz(n);
        }
    }

    public static void main(String[] args) {
        System.out.print(fizzBuzz(15));
        // System.out.print(fizzBuzz(30));
    }
}