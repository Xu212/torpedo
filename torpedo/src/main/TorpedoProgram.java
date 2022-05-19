package main;
public class TorpedoProgram {
    public static void main(String[] args) {
        PalyaOsztaly palyaoszt = new PalyaOsztaly();
        
        String[] palya = palyaoszt.PalyaGeneralas();
        for (int i = 0; i < palya.length; i++) {
            System.out.print(palya[i]+" ");
        }
        
    }
    
}
