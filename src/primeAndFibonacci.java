import java.util.Scanner;
public class primeAndFibonacci {
    // method that takes arguments  and returns true ar false if it is a prime number or not
    public static boolean isPrime(int digit){
        if(digit<=1){
            return false;
        }
        for (int digitArray = 2; digitArray <=Math.sqrt(digit); digitArray++){
            if (digit % digitArray == 0){
                return false;
            }
        }
        return true;
    }
    //method for finding out if a number is prime or not
    static  void PrimeNumbers(int num){
        int count=0;
        for (int digitArray=1; digitArray<=num; digitArray++){
            if (num % digitArray==0){
                count++;
            }
        }
        if (count==2){
            System.out.println("It is a prime number");
        }
        else {
            System.out.println("Not a prime number");
        }
    }

    public static void main(String[] args) {
        //prompts the user to enter a number and checks if it is a prime number or not
        System.out.println("Enter number");
        Scanner myScanner=new Scanner(System.in);
        int digitArray=myScanner.nextInt();
        PrimeNumbers(digitArray);

        //method of finding and printing out prime numbers from 1 to 500
        System.out.println("Prime numbers between 1 and 500 are:");
        for (int intagerArray = 2; intagerArray <= 500; intagerArray ++){
            if (isPrime(intagerArray )){
                System.out.printf( intagerArray  + " " );
            }
        }


        System.out.println("\n");
        // declaration of fibonacci sequence integers
        int sum = 0;
        int fibonacci1 = 1;
        int fibonacci2 = 2;

        // method of computing the fibonacci sequence
        while (fibonacci2 <= 4000000){
            if (fibonacci2 % 2 == 0){
                sum += fibonacci2;
            }
            int temp = fibonacci1;
            fibonacci1 = fibonacci2;
            fibonacci2 += temp;
        }
        //prints out the sum  of even-valued terms in fibonacci sequence up to 4 million
        System.out.println("Sum of even-valued terms in fibonacci sequence up to 4 million is " + sum);
    }
}