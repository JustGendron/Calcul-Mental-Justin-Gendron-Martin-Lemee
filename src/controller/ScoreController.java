package controller;


import model.ScoreBean;

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

@WebServlet( urlPatterns = {"/start"} )

public class ScoreController extends HttpServlet {

    private static final String PAGE_START_JSP = "/WEB-INF/jsp/start.jsp";
    private static final String PAGE_HOME_JSP = "/start";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {


        ScoreBean model = (ScoreBean) request.getAttribute("scoreBean");
        if ( model != null ) {
            response.sendRedirect( request.getContextPath()+PAGE_START_JSP );
        } else {
            request.getRequestDispatcher( PAGE_HOME_JSP ).forward( request, response );
        }
    }

    @Override
    protected void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {

        ScoreBean model = new ScoreBean();
        model.allScore();
        request.setAttribute( "scoreBean", model );
        doGet( request, response );
    }

}
