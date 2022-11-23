package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
     int count = 2;
     while (count < printToInclusive){
         if(isPrime(count)){
             System.out.println(count);
         }
         count++;
     }}



    public boolean isPrime(int n){
        double k = (int)Math.sqrt(n);
        int count = 2;
        while (count <= k){
            if(n % count == 0)
                return false;
            else
                count++;
        }
        return true;
    }
}
