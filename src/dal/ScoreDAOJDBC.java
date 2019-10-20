package dal;

import bo.Score;
import bo.User;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ScoreDAOJDBC extends DataAccessObjectJDBC<Score> {

    private static final String INSERT_QUERY = "INSERT INTO score (idjoueur,score) VALUES(?,?)";
    private static final String FIND_MAX = "select MAX(score) as score from score where idjoueur = ?";
    private static final String FIND_SCORE = "select max(score), login from score, user where score.idjoueur = user.id group by login order by max(score) desc limit 0,10 ";


    public ScoreDAOJDBC(String dbUrl, String dbLogin, String dbPwd ) {
        super( dbUrl, dbLogin, dbPwd );
    }


    @Override
    public void create(Score score) throws SQLException, IOException, ClassNotFoundException {

        try (Connection connection = DriverManager.getConnection(dbUrl, dbLogin, dbPwd);
             PreparedStatement ps = connection.prepareStatement(INSERT_QUERY, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
            ps.setInt(1, score.getId());
            ps.setInt(2, score.getScore());
            ps.executeUpdate();
        }
    }

    @Override
    public List<Score> findAll() {

        return null;
    }

    public int BestScore(int id) throws SQLException, IOException, ClassNotFoundException {
        int i = 0;
        try (Connection connection = DriverManager.getConnection(dbUrl, dbLogin, dbPwd);
             PreparedStatement ps = connection.prepareStatement(FIND_MAX, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    i = rs.getInt("score");
                }
            }
        }
        return i;
    }

    public List<Score> allScore() throws SQLException, IOException, ClassNotFoundException {
        List<Score> list = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(dbUrl, dbLogin, dbPwd);
             PreparedStatement ps = connection.prepareStatement(FIND_SCORE, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
            try (ResultSet rs = ps.executeQuery()) {
                while ( rs.next() ) {
                    Score score = new Score();
                    score.setScore( rs.getInt( "score" ) );
                    score.setNom( rs.getString( "login" ) );
                    list.add( score );
                }
            }
        }
        return list;
}

}

