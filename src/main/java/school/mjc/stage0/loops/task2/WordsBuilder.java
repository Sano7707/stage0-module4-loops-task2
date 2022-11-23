package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        String s = "";
        int cont = 0;
        while (cont < chars.length){
            s+=chars[cont];
            cont++;
        }
        System.out.print(s);
    }
}
