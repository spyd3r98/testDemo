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
  }

private String getUrl() {
	// TODO Auto-generated method stub
	return null;
}
}
