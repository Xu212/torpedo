package main;

public class HajoOsztaly {

    private int hajomeret;

    public HajoOsztaly() {
        this(3);
    }

    public HajoOsztaly(int hajomeret) {
        this.hajomeret = hajomeret;
    }

    public int[] hajogen() {
        int[] hajo = new int[hajomeret];
        int i = 1;
        int elozo;
        hajo[0] = (int) (Math.random() * 7);
        while (i < hajo.length) {
            int hajohelye = (int) (Math.random() * 7);
            if (hajo[i - 1] + 1 == hajohelye || hajo[i - 1] - 1 == hajohelye) {
                int hasonlo = 0;
                for (int j = 0; j < hajo.length; j++) {
                    if (hajo[j] == hajohelye) {
                        hasonlo++;
                    }
                }
                if(hasonlo<hajo.length-2){
                    hajo[i] = hajohelye;
                        i++;
                }
            }
        }
        return hajo;
    }
}
