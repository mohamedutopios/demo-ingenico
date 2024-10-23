package org.example.exercice.poo.tpCompte;

public class ComptePayant extends Account {

    private final double TAUX = 0.05;

    public ComptePayant(double solde) {
        super(solde);

    }

    @Override
    public double retrait(double montant) {
        if ((montant + TAUX * montant) > solde) System.out.println("Pas assez d'argent sur le compte");
        else solde = solde - (montant + montant * TAUX ); return solde;
    }

    @Override
    public double depot(double montant) {
        solde = solde + (montant - montant * TAUX);
        return solde;
    }

    @Override
    public String toString() {
        return "ComptePayant{code=" +
                code +
                ", solde=" + solde +
                '}';
    }

}

