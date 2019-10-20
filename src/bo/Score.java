package bo;

import java.io.Serializable;

public class Score implements Serializable {

    private int id;
    private int score;
    private String nom;

    public Score() {}

    public Score(int id,int score) {
        this.id = id;
        this.score = score;
    }

    public Score(int id, int score, String nom) {
        this.id = id;
        this.score = score;
        this.nom = nom;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
