package org.example.poo.datastructure;

public abstract class Engine {

    private static int count;
    protected String name;
    protected int id;

    protected int nbreRoue;
    protected String couleur;

    public abstract String test();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNbreRoue() {
        return nbreRoue;
    }

    public void setNbreRoue(int nbreRoue) {
        this.nbreRoue = nbreRoue;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", nbreRoue=" + nbreRoue +
                ", couleur='" + couleur + '\'' +
                '}';
    }
}