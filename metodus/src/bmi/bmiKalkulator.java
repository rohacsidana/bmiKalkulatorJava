package bmi;

import java.util.Locale;
import java.util.Scanner;

public class bmiKalkulator {

    public static void main(String[] args) {
        kiir("BMI index kiszámítása");
        int tomeg = beker("Testtömeg (kg) [40, 150]: ", 40, 150);
        int magas = beker("Testmagasság (cm) [100, 200]: ", 100, 200);
        double bmiIndex = bmiSzamitas(tomeg, magas);
        ertekeles(bmiIndex, tomeg, magas);
    }

    static void kiir(String szoveg) {
        System.out.println(szoveg);
    }

    static int beker(String szoveg, int alsoHatar, int felsoHatar) {
        Scanner sc = new Scanner(System.in);
        System.out.print(szoveg);
        int bekertSzam = sc.nextInt();
        while (!(bekertSzam >= alsoHatar && bekertSzam <= felsoHatar)) {
            System.out.print("Újra: ");
            bekertSzam = sc.nextInt();
        }
        return bekertSzam;
    }

    private static double bmiSzamitas(int tomeg, int magas) {
        return tomeg / ((magas / 100.0) * (magas / 100.0));

    }

    private static void ertekeles(double bmiIndex, int tomeg, int magas) {
        System.out.printf("Ön %d kg súlyú, %d cm magasságú,\n", tomeg, magas);
        System.out.printf(Locale.ENGLISH, "Így BMI indexe %.1f,\n", bmiIndex);
        String alkat = "túlsúlyos";
        System.out.printf("Tehát ön %s testalkatú.\n", alkat);
    }
}
