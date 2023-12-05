package Ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.util.Collections.reverse;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> randomNumbersList = new ArrayList<>();
        System.out.println("INSERISCI IL NUMERO DI NUMERRI CASUALI CHE VUOI AGGIUNGERE");
        int numeroDeiNumeri = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < numeroDeiNumeri; i++) {
            Random rndm = new Random();
            randomNumbersList.add(rndm.nextInt(1,101));
        }
        System.out.println("Lista randomica: " + randomNumbersList.toString());
        randomNumbersListReverse(randomNumbersList);
        System.out.println("Lista randomica invertita: " + randomNumbersList.toString());
        stampaPariDispari(randomNumbersList, true);
        scanner.close();
    }
    public static ArrayList randomNumbersListReverse(ArrayList list) {
        reverse(list);
        return list;
    }
    public static void stampaPariDispari(ArrayList<Integer> list, boolean dispari) {
        System.out.println("Valori in posizioni " + (dispari ? "dispari:" : "pari:"));
        for (int i = dispari ? 0 : 1; i < list.size(); i += 2) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}

