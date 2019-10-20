package controller;

import bo.Score;
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


@WebServlet( urlPatterns = {"/start"})
public class ScoreController extends HttpServlet {

    private static final String PAGE_LIST_JSP = "/WEB-INF/jsp/start.jsp";

    public ScoreController() {
    }

    @Override
    protected void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {

        HttpSession session = request.getSession( true );
        session.setAttribute( "scores", ScoreBean.allScore());
        request.getRequestDispatcher( PAGE_LIST_JSP ).forward( request, response );
       // response.sendRedirect( request.getContextPath()+PAGE_LIST_JSP );
    }
}