package YaAllah;

import java.util.Scanner;

public class cobaanhidup {
    public static void main(String[] args) {
       
       int angka[] = { 4, 6, 1, 3, 5 };

       System.out.print("\n genap = ");
        for (int a = 0; a < 5; a++) {
            if (angka[a] % 2 == 0) {
                System.out.print(angka[a] + ", ");
            }
        }
        System.out.print("\n ganjil = ");
        for (int b = 0; b < 5; b++) {
            if (angka[b] % 2 != 0) {
                System.out.print(angka[b] + ", ");
            }
        }
    }
}
