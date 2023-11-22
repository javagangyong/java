package phonebook3;

import java.sql.ResultSet;
import java.sql.SQLException;

@FunctionalInterface
public interface RowMapper <T> {
	
	T mapper(ResultSet rs) throws SQLException;
}
