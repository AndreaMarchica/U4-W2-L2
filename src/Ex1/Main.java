package Ex1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INSERISCI IL NUMERO DI PAROLE CHE VUOI AGGIUNGERE");
        int numeroParole = scanner.nextInt();
        scanner.nextLine();
        Set<String> paroleSet = new HashSet<>();
        Set<String> paroleDoppieSet = new HashSet<>();
        for (int i = 0; i < numeroParole; i++) {
            System.out.println("INSERISCI LA PAROLA DESIDERATA");
            String parola = scanner.next();

        if (!paroleSet.add(parola)) {
            paroleDoppieSet.add(parola);
        } }
        scanner.close();
        System.out.println("Parole Duplicate: " + paroleDoppieSet.toString());
        System.out.println("Numero di Parole Distinte: " + paroleSet.size());
        System.out.println("Parole Distinte: " + paroleSet.toString());
    }
}