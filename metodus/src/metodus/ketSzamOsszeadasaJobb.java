package metodus;

public class ketSzamOsszeadasaJobb {

    public static void main3(String[] args) {
        int szam1;
        int szam2;
        szam1 = 4;
        szam2 = 2;
        int eredmeny = osszead(szam1, szam2);
        kettoSzamOsszegeKiir(szam1, szam2);
        kettoSzamOsszegeKiir(eredmeny, 2);
        kettoSzamOsszegeKiir(13, 8);

    }

    static int osszead(int x, int y) {
        return x + y;
    }

    static void kettoSzamOsszegeKiir(int x, int y) {
        System.out.println("--------------");
        System.out.printf("| %d + %d = %d | \n", x, y, osszead(x, y));
        System.out.println("--------------");
    }
}
