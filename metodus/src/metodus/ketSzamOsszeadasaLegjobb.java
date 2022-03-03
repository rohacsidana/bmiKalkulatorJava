package metodus;

public class ketSzamOsszeadasaLegjobb {

    static int szam1 = 4, szam2 = 2;

    public static void main4(String[] args) {
        //int szam1 = 4;
        //int szam2 = 2;
        ketSzamOsszeadasaLegjobb ofl = new ketSzamOsszeadasaLegjobb();
        int eredmeny = ofl.kettoSzamOsszege();
        szam1 = 8;
        szam2 = 2;
        ofl.kettoSzamOsszegeKiir();
        szam1 = ofl.kettoSzamOsszege();
        szam2 = 4;
        ofl.kettoSzamOsszegeKiir();

        ofl.kettoSzamOsszege();
        ofl.kettoSzamOsszegeKiir();
    }

    int kettoSzamOsszege() {
        return szam1 + szam2;
    }

    // void kettoSzamOsszegeKiir(int x, int y) {
    void kettoSzamOsszegeKiir() {
        System.out.println("--------------");
        System.out.printf("| %d + %d = %d | \n", szam1, szam2, kettoSzamOsszege());
        System.out.println("--------------");
    }
    /*
    static int kettoSzamOsszege() {
        return szam1 + szam2;
    }

    // void kettoSzamOsszegeKiir(int x, int y) {
    static void kettoSzamOsszegeKiir() {
        System.out.println("--------------");
        System.out.printf("| %d + %d = %d | \n", szam1, szam2, kettoSzamOsszege());
        System.out.println("--------------");
    }*/
}
