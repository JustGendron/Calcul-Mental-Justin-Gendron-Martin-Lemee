package model;

import bo.Question;

import javax.servlet.http.HttpServletRequest;

public class QuestionBean {

    private Question question;

    public QuestionBean() { }

    public Question getQuestion() { return question; }

    public void setQuestion ( Question question ) { this.question = question; }

    public void setQuestionFromForm( HttpServletRequest request ) {
        int id;
        try {
            id = Integer.parseInt( request.getParameter("form-id") );
        } catch ( Exception e ) {
            id = -1;
        }
        String calcul = request.getParameter("form-calcul");
    }

}
