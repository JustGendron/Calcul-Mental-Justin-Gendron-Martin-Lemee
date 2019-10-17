package controller;

import bo.Expression;
import bo.Question;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@WebServlet( name = "questionController", urlPatterns = {"/questions"}, loadOnStartup = 1)
public class QuestionController extends HttpServlet {

    private static final String PAGE_QUESTIONS_JSP = "/WEB-INF/jsp/questions.jsp";
    private static final Logger LOGGER = Logger.getLogger( QuestionController.class.getName());

    public QuestionController() {
    }

    @Override
    public void init() throws ServletException {
        LOGGER.log ( Level.INFO, "Je suis dans le init !");
        super.init();
        Expression expression = new Expression();
        expression.generateExpression();
    }

    @Override
    public void destroy() {
        LOGGER.log ( Level.INFO, "Je suis dans le destroy !");
        super.destroy();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LOGGER.log ( Level.INFO, "Je suis dans le GET !");

        HttpSession session = req.getSession(true);

        List<Question> dataSession = ( List<Question> ) session.getAttribute("questions");

        if ( null == dataSession ) {
            dataSession = new ArrayList<>();
            dataSession.add(new Question(0,"Question 1", "reponse 1"));
            dataSession.add(new Question(1,"Question 2", "reponse 2"));
            session.setAttribute("questions", dataSession);
        }

        String action = req.getParameter("action");
        if ( null == action ) {
            req.getRequestDispatcher( PAGE_QUESTIONS_JSP ).forward( req, resp);
        }
    }
}
