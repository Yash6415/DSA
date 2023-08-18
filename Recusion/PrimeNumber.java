package Recusion;
//18-08-2023
//check if a number is a prime number or not using recursion.
public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(5));
    }
    public static boolean isPrime(int x){
        if(x <= 1){
            return false;
        }
        if(x % 2 == 0){
            return false;
        }
        isPrime((int) Math.sqrt(x));
        return true;
    }
}
