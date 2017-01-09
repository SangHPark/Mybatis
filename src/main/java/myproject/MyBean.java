package myproject;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class MyBean {
	private String message;
	private DataSource MyDataSource;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void startup() {
		System.out.println("+++++++++++++StartUp+++++++++++++++");
	}
	
	public void destroy() {
		System.out.println("+++++++++++++Destory+++++++++++++++");
	}
	

	
	
	public DataSource getMyDataSource() {
		return MyDataSource;
	}

	public void setMyDataSource(DataSource myDataSource) {
		MyDataSource = myDataSource;
	}

	public List<String> AllCityData() {

		String sql = "SELECT * FROM city";
		Connection conn = null;
		List<String> cities = new ArrayList<String>();
		try {
			conn = (Connection) this.MyDataSource.getConnection();
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				cities.add(rs.getString(2));
			}
			rs.close();
			ps.close();
		} catch (SQLException e) {
			System.out.println("Error ===: " + e.getMessage());
		}
		
		return cities;
	}


	
}
