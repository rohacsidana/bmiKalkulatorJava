package metodus;

public class ketSzamOsszeadasaMajdnemLegjobb {

    static int szam1 = 4;
    static int szam2 = 2;

    public static void main3(String[] args) {
        //int szam1 = 4;
        //int szam2 = 2;
        int eredmeny = kettoSzamOsszege();
        szam1 = 8;
        szam2 = 2;
        kettoSzamOsszegeKiir();
        szam1 = kettoSzamOsszege();
        szam2 = 4;
        kettoSzamOsszegeKiir();

    }

    static int kettoSzamOsszege() {
        return szam1 + szam2;
    }

    // void kettoSzamOsszegeKiir(int x, int y) {
    static void kettoSzamOsszegeKiir() {
        System.out.println("--------------");
        System.out.printf("| %d + %d = %d | \n", szam1, szam2, kettoSzamOsszege());
        System.out.println("--------------");
    }
}
