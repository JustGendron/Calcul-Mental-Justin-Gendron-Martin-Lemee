package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
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
    }

    @Override
    public void destroy() {
        LOGGER.log ( Level.INFO, "Je suis dans le destroy !");
        super.destroy();
    }
}
