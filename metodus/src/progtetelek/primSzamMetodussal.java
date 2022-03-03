package progtetelek;

import java.util.Random;

public class primSzamMetodussal {

    static int szam = 10001;
    static int[] sorozat = {10001, 2, 1, 10007, new Random().nextInt(10000 - 10) + 10};

    public static void main5(String[] args) {
        //primszam_eKiirva();
        int sorozatbanPrimek = 0;
        for (int i = 0; i < sorozat.length; i++) {
            szam = sorozat[i];
            //primszam_eKiirva();
            if (primszam_e()) {
                sorozatbanPrimek++;
            }
        }
        System.out.println("1. A sorozatban ennyi prím van: " + sorozatbanPrimek);
        System.out.println("----------------");
        //2. van benne prím?
        int i = 0;
        szam = sorozat[i];
        while (i < sorozat.length && !(primszam_e())) {
            szam = sorozat[i];
            i++;
        }
        boolean vanEPrimASoriban = i < sorozat.length;
        System.out.println("2. Van-e prím a sorozatban: " + (vanEPrimASoriban ? "igen" : "nem"));
        System.out.println("----------------");
        //3. az összes prím?
        i = 0;
        szam = sorozat[i];

        while (i < sorozat.length && (primszam_e())) {
            szam = sorozat[i];
            i++;
        }
        boolean azOsszesPrim = i >= sorozat.length;
        System.out.println("3. Az összes szám prím a sorozatban: " + (azOsszesPrim ? "igen" : "nem"));
        System.out.println("----------------");
        // lin keresés
        i = 0;

        szam = sorozat[i];
        while (i < sorozat.length && !(primszam_e())) {
            i++;
            szam = sorozat[i];
        }
        boolean vanLegalabbEgyPrim = i < sorozat.length;
        System.out.println(vanLegalabbEgyPrim ? "4. Az első prím: " + sorozat[i] : "4. Nincs prím.");
        System.out.println("----------------");
    }

    static boolean primszam_e() {
        if (szam < 2) {
            return false;
        } else {
            int i = 2;
            while (i <= Math.sqrt(szam) && !(szam % i == 0)) {
                i++;
            }
            return i > Math.sqrt(szam);
        }

    }

    static void primszam_eKiirva() {
        System.out.println(szam + " prím-e: " + (primszam_e() ? "igen" : "nem"));
    }

    static void sorozatotKiir(int[] sorozat) {
        for (int i = 0; i < sorozat.length; i++) {
            System.out.print(sorozat[i] + ", ");
        }
        System.out.println("");
    }
}
