package org.example.exercice.poo.heritage.exercice3;

public class TestCouleursPrimaires {

    public static void main(String[] args) {
        Couleur[] couleurs = Couleur.values();

        System.out.println("Mélange des couleurs primaires :");
        for (int i = 0; i < couleurs.length; i++) {
            for (int j = i + 1; j < couleurs.length; j++) {
                Resultat melange = melanger(couleurs[i], couleurs[j]);
                System.out.println(couleurs[i] + " + " + couleurs[j] + " = " + melange);
            }
        }
    }

    public static Resultat melanger(Couleur couleur1, Couleur couleur2) {
        if (couleur1 == Couleur.ROUGE && couleur2 == Couleur.JAUNE ||
                couleur1 == Couleur.JAUNE && couleur2 == Couleur.ROUGE) {
            return Resultat.ORANGE;
        } else if (couleur1 == Couleur.ROUGE && couleur2 == Couleur.BLEU ||
                couleur1 == Couleur.BLEU && couleur2 == Couleur.ROUGE) {
            return Resultat.VIOLET;
        } else if (couleur1 == Couleur.JAUNE && couleur2 == Couleur.BLEU ||
                couleur1 == Couleur.BLEU && couleur2 == Couleur.JAUNE) {
            return Resultat.VERT;
        } else {
            return null;
        }
    }
}
