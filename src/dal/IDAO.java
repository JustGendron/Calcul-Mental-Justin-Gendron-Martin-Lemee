package dal;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface IDAO<E> {
	
	public void create(E objet) throws SQLException, IOException, ClassNotFoundException;
	public List<E> findAll();
}
