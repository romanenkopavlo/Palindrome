import clavier.In;

public class ForPalindrome {
    public static void main(String[] args) {
        String chaineSaisie = null, chaineApresTrim = null, chaineApresSupEsp = null;
        String premierePartie = null, deuxiemePartie = null, deuxiemePartieInverse = "";
        int i = 0, j = 0, laTaille = 0, laTailleDeDeuxiemePartie = 0, compteur = 0;

        System.out.print("Entrez votre phrase: ");
        chaineSaisie = In.readString();
        chaineApresTrim = chaineSaisie.toLowerCase().trim();
        chaineApresSupEsp = chaineSaisie.replaceAll(" ", "");

        System.out.println("Chaine au debut: " + chaineSaisie);
        System.out.println("Chain apres le methode trim: " + chaineApresTrim);
        System.out.println("Chaine apres supprimer d'escapes: " + chaineApresSupEsp);

        laTaille = chaineApresSupEsp.length();

        premierePartie = chaineApresSupEsp.substring(0, laTaille / 2);
        System.out.println("La premiere partie de votre phrase: " + premierePartie);
        premierePartie = premierePartie.toLowerCase();

        deuxiemePartie = chaineApresSupEsp.substring(laTaille / 2, laTaille);
        System.out.println("La deuxieme partie de votre phrase: " + deuxiemePartie);
        premierePartie = premierePartie.toLowerCase();

        laTailleDeDeuxiemePartie = deuxiemePartie.length();

        for (i = 0; i < laTailleDeDeuxiemePartie; i++) {
            deuxiemePartieInverse = deuxiemePartie.charAt(i) + deuxiemePartieInverse;
        }

        if (laTaille % 2 == 0) {
            deuxiemePartie = deuxiemePartieInverse;
        } else {
            deuxiemePartie = deuxiemePartieInverse.substring(0, laTailleDeDeuxiemePartie - 1);
        }
        laTailleDeDeuxiemePartie = deuxiemePartie.length();

        for (j = 0; j < laTailleDeDeuxiemePartie; j++) {
            if (premierePartie.charAt(j) == deuxiemePartie.charAt(j)) {
                if (j == 0) {
                    System.out.println("Le comparison est un cours:");
                }
                System.out.println(premierePartie.charAt(j) + " = " + deuxiemePartie.charAt(j));
                compteur++;
            } else {
                System.out.println(premierePartie.charAt(j) + " != " + deuxiemePartie.charAt(j));
            }
        }
        if (compteur == laTailleDeDeuxiemePartie) {
            System.out.print("La chaine de caracteres " + "'" + chaineSaisie + "'" + " est un palindrome.");
        } else {
            System.out.print("La chaine de caracteres " + "'" + chaineSaisie + "'" + " n'est pas un palindrome.");
        }
    }
}