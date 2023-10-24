import java.sql.*;
import java.util.Enumeration;
import java.util.stream.*;

public class DbHandler {

    private static final String CONNECTION_STRING = "jdbc:sqlite:my_db.db";
    private static DbHandler instance = null;

    private DbHandler() {
    }

    public static synchronized DbHandler getInstance() throws SQLException {
	if (instance == null) {
	    instance = new DbHandler();
	    instance.createTable();
	}
	return instance;
    }

    public void createTable() throws SQLException {
	try (Connection connection = DriverManager.getConnection(CONNECTION_STRING)) {
		String sql = "create table if not exists registration_info(first_name varchar(20), " +
				  "last_name varchar(20), " +
				  "organization varchar(100), " +
				  "report_theme varchar(300), " +
				  "email varchar(20));";
		connection.createStatement().execute(sql);
		}
	}

    public void addParticipant(RegistrationInfo participant) throws SQLException {
	    try (Connection connection = DriverManager.getConnection(CONNECTION_STRING)) {
		String statement = "insert into registration_info "
		    + "(first_name, last_name, organization, "
		    + "report_theme, email) "
		    + "values (?, ?, ?, ?, ?)";
		try (PreparedStatement st = connection.prepareStatement(statement)) {
		    st.setString(1, participant.getFirstName());
		    st.setString(2, participant.getLastName());
		    st.setString(3, participant.getOrganization());
		    st.setString(4, participant.getReportTheme());
		    st.setString(5, participant.getEmail());
		    st.executeUpdate();
		}
	    }
	    System.out.println("Добавлен новый участник");
	}
    public int getParticipantCount() throws SQLException {
	    try (Connection connection = DriverManager.getConnection(CONNECTION_STRING)) {
		try (Statement statement = connection.createStatement()) {
		    int count = 0;
		    ResultSet rs = statement.executeQuery("Select count(*) from registration_info");
		    if (rs.next()) {
		    	count = rs.getInt(1);
		    }
		    return count;
		}
	    }
    }
}
