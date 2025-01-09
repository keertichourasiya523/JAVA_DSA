package Exception;

public class PrimeChecker {
    public static void primeCheck(int number) throws NonPrimeException {
        if (number <= 1) {
            throw new NonPrimeException("Numbers less than or equal to 1 are not prime.");
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                throw new NonPrimeException(number + " is not a prime number.");
            }
        }

        System.out.println(number + " is a prime number.");
    }

    public static void main(String[] args) {
        int yourNumber = 13; 
        try {
            primeCheck(yourNumber);
        } catch (NonPrimeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
class NonPrimeException extends Exception {
    public NonPrimeException(String message) {
        super(message);
    }
}
