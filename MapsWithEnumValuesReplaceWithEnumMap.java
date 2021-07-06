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
}
