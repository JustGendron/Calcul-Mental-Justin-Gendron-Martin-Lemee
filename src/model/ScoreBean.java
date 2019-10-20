package model;

import bo.Score;
import dal.DAOFactory;
import dal.ScoreDAOJDBC;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ScoreBean implements Serializable {


    public ScoreBean() {
    }

    public static List<Score> allScore() {
        ScoreDAOJDBC dao = (ScoreDAOJDBC) DAOFactory.getScoreDAO();
        List<Score> score = new ArrayList<>();
        try {
            score = dao.allScore();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return score;
    }
}