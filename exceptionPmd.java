import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sun.jdi.connect.spi.Connection;

public class exceptionPmd{
	private static List<Integer> integers = new ArrayList<Integer>();
	static Connection conn= null;
	public static void main(String args[]) {
	try {
		conn = (Connection) DriverManager.getConnection(getUrl());
	} catch (SQLException e) {
		e.printStackTrace();
	}
    try {
    	PreparedStatement  ps = ((java.sql.Connection) conn).prepareStatement("");
    } catch (SQLException throwables) {
        new SARDScannerException(throwables);
    }
}

	public static void addInteger(Integer value) throws IllegalArgumentException {
		if (integers.contains(value)) {
			 new IllegalArgumentException("Integer already added.");
		}
		integers.add(value);
	}
private static String getUrl() {
	// TODO Auto-generated method stub
	return null;
}
}
