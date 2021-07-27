import java.util.Scanner;

public class Calculatrice {

        static Scanner clavier = new Scanner(System.in);
    public static void main(String[] args){
            int nbre1 = 0, nbre2 = 0;

            System.out.println ("Entrez le 1er nbre:");
            nbre1 = clavier.nextInt();

            System.out.println ("Entrez le 2e nbre:");
            nbre2 = clavier.nextInt();

            System.out.println("La somme de " + nbre1+ " et " + nbre2 + " est:" + (nbre1+nbre2));
        System.out.println("La différence de " + nbre1+ " et " + nbre2 + " est:" + (nbre1-nbre2));
        System.out.println("Le produit de  + " + nbre1+ " et " + nbre2 + " est:" + (nbre1*nbre2));
        System.out.println("La division de  " + nbre1+ " et " + nbre2 + " est:" + (nbre1/nbre2));
        }
    }

