// Checking for a Prime Number

public class check_prime_numbers {
    public static void main(String[] args) {
        int num = 29; // This is the number to be tested
        boolean isPrime = true;

        // Implementing for loop and some conditional statements to test is the number is a prime or not.
        for(int i = 2; i < num; i++) {
            if(num%i==0){
                isPrime = false;
                break;
            }
        }

        if(isPrime) {
            System.out.println("=============================================");
            System.out.println(num + " is a prime number.");
            System.out.println("=============================================");
        }
        else{
            System.out.println("=============================================");
            System.out.println(num + " is not a prime number.");
            System.out.println("=============================================");
        }
    }
}