package org.example.exercice.poo.tpCompte;

public class Account implements ICompte, IExemple{

    private static long nbComptes = 0;
    protected double solde;
    protected long code;

    public Account(double solde) {
        this.solde = solde;
        this.code = ++Account.nbComptes;
    }

    public long getCode() {
        return code;
    }

    public static long getNbComptes() {
        return nbComptes;
    }


    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }


    @Override
    public double depot(double montant) {
        solde=solde+montant;
        return solde;
    }

    @Override
    public double retrait(double montant) {
        if (montant> solde){
            System.out.println("Pas assez d'argent sur le compte");
        } else {
            solde=solde-montant;
        }
        return solde;
    }

    @Override
    public void test() {
        System.out.println("test");
    }
}
