package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int count = 0;
        int mat = 1;
        while(count <= printToInclusive){
            System.out.println(mat);
            mat = mat * (mat + 1);
        }
    }
}
