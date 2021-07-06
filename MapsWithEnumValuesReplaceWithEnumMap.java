import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
public class MapsWithEnumValuesReplaceWithEnumMap {

  public enum COLOR {
    RED, GREEN, BLUE, ORANGE;
  }

  public void mapMood() {
	Map<Integer,String> map=new HashMap<Integer,String>();      
	// EMB-ISSUE: CodeIssueNames.MAPS_WITH_ENUM_VALUES_REPLACE_WITH_ENUMMAP
    Map<COLOR, String> moodMap = new HashMap<COLOR, String> ();
	 Connection conn = null;
    try {
      String url = "jdbc:sqlite:path-to-db/chinook/chinook.db";
      conn = DriverManager.getConnection(url);

      System.out.println("Got it!");

    } catch (SQLException throwables) {
        new SARDScannerException(throwables);
    }
  }
}
