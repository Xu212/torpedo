package main;
public class TorpedoProgram {
    public static void main(String[] args) {
        HajoOsztaly hajopeldany = new HajoOsztaly();
        int[] hajo = hajopeldany.hajogen();
        for (int i = 0; i < hajo.length; i++) {
            System.out.print(hajo[i]);
        }
    }
    
}
