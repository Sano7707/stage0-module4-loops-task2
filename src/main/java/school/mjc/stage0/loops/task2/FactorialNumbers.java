package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int count = 0;
        while(count <= printToInclusive){
            int k = 1;
            int mat = 1;
            while (k <= count){
                mat = mat * k;
                k++;
            }
            System.out.println(mat);
            count++;
        }
    }

}
