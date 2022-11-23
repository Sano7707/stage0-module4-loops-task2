package school.mjc.stage0.loops.task2;

public class NaturalNumbers {
    public void naturalNumbersPrinter(int lastPrinted) {
        int count = 0;
        while (count < lastPrinted+1){
            System.out.println(count);
            count+=1;
        }
    }
}
