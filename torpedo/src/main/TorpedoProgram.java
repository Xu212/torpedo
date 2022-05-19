package main;
public class TorpedoProgram {
    
    public static void main(String[] args) {    
        PalyaOsztaly palyaoszt = new PalyaOsztaly();
        
        String[] palya = palyaoszt.PalyaGeneralas();
        for (int i = 0; i < palya.length; i++) {
            System.out.print(palya[i]+" ");
        }
        
        System.out.println("");
        
        int[] Szamok = palyaoszt.SzamokPalya();
        for (int i = 0; i < Szamok.length; i++) {
            System.out.print(Szamok[i]+" ");
        }
    }
    
}
