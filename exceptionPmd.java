import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.sun.jdi.connect.spi.Connection;

public class exceptionPmd{

Connection conn = null;
	try {
		conn = (Connection) DriverManager.getConnection(getUrl());
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    try {
    	PreparedStatement  ps = ((java.sql.Connection) conn).prepareStatement("");
    } catch (SQLException throwables) {
        new SARDScannerException(throwables);
    }
	private static List<Integer> integers = new ArrayList<Integer>();

	public static void addInteger(Integer value) throws IllegalArgumentException {
		if (integers.contains(value)) {
			 new IllegalArgumentException("Integer already added.");
		}
		integers.add(value);
	}
}
private String getUrl() {
	// TODO Auto-generated method stub
	return null;
}
}
