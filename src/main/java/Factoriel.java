import java.util.Scanner;

public class Factoriel {

    public static int calculeFactoriel(int nbr) {
        int resultat = nbr;

        while (nbr > 1) {
            resultat *= (nbr - 1);
            nbr--;
        }
        return resultat;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez saisir le nombre que vous souhaitez mettre en factorielle : ");

        int nbr = scanner.nextInt();
        int resultat = calculeFactoriel(nbr);

        System.out.println(nbr + " = " + resultat);
    }
}
