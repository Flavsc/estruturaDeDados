package beecrowd;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // vars
        Scanner scanner = new Scanner(System.in);
        int[] evens = new int[100000];
        int[] odds = new int[100000];
        int nEvens = 0, nOdds = 0, n;
        // sysin
        n = scanner.nextInt();
        for (int i = 0; i < n-1; i++) {
            int x = scanner.nextInt();
            if (x%2==0) {
                evens[nEvens] = x;
            }
            else {
                odds[nOdds] = x;
            }
        }
        scanner.close();
        // ord evens
        for (int j = 1; j < nEvens; j++) {
            int x = evens[j];
            int i;
            for (i = j-1; i >= 0 && evens[i] > x; --i) {
                evens[i+1] = evens[i];
            }
            evens[i+1] = x;
        }
        //ord odds
        for (int j = 1; j < nOdds; j++) {
            int x = odds[j];
            int i;
            for (i = j-1; i >= 0 && odds[i] < x; --i) {
                odds[i+1] = odds[i];
            }
            odds[i+1] = x;
        }
        //sysout
        for (int i = 0; i < nEvens; i++) {
            System.out.println(evens[i]);
        }
        for (int i = 0; i < nOdds; i++) {
            System.out.println(odds[i]);
        }
    }
}
