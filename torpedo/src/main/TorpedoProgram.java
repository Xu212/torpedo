package main;
public class TorpedoProgram {
    
    public static void main(String[] args) {    
        PalyaOsztaly palyaoszt = new PalyaOsztaly();
        String[] palya = palyaoszt.PalyaGeneralas();
        HajoOsztaly hajoosztaly = new HajoOsztaly();
        int[] hajo = hajoosztaly.hajogen();
        for (int i = 0; i < palya.length; i++) {
            System.out.print(palya[i]+" ");
        }
<<<<<<< HEAD
        
        System.out.println("");
        
        int[] Szamok = palyaoszt.SzamokPalya();
        for (int i = 0; i < Szamok.length; i++) {
            System.out.print(Szamok[i]+" ");
        }
=======
>>>>>>> 261460f43ffaaaec7d112893f84881a63b1ee496
    }
    
}
