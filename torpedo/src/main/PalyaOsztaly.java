
package main;

public class PalyaOsztaly {
    private int meret;
    private String szin;
    public static final String KEK = "\u001B[44m";
    
    
    public PalyaOsztaly() {
        this(7, KEK);
        
    
    }

    public PalyaOsztaly(int meret, String szin) {
        this.meret = meret;
        this.szin = szin;
    }
    
   
    public String[] PalyaGeneralas(){
    String[] palya = new String[meret];
        for (int i = 0; i < palya.length; i++) {
            palya[i] = KEK + "_";
        }
        return palya;
 
    }
    public int[] SzamokPalya(){
    int[] Szamok = new int[7];
    int szam = 1;
        for (int i = 0; i < Szamok.length; i++) {
            Szamok[i] += szam;
            szam++;
        }
        return Szamok;
    }
}
