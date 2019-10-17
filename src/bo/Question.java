package bo;

import java.io.Serializable;

public class Question implements Serializable {

    private int id = -1;
    private String question;
    private String reponse;

    public Question() { }

    public Question(int id, String question, String reponse) {
        this.id = id;
        this.question = question;
        this.reponse = reponse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) { this.id = id; }

    public String getQuestion() { return question; }

    public void setQuestion(String question) { this.question = question; }

    public String getReponse() { return reponse; }

    public void setReponse(String reponse) { this.reponse = reponse; }
}
