package jdbc_sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBManager {

	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";

	private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";

	private static final String USER_NAME  = "jdbc_user";

	private static final String PASSWORD = "systemsss";


	public static Connection getConnection() throws ClassNotFoundException, SQLException{

		Class.forName(DRIVER);

		Connection con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);

		System.out.println("繋がった");

		return con;

	}

	public static void close(Connection connection){

		if(connection != null){

			try{

			connection.close();

			System.out.println("切った");

			}catch(SQLException e){

				e.printStackTrace();

			}

		}

	}

	public static void close(PreparedStatement st){

		if(st != null){

			try{

				st.close();

			}catch(SQLException e){

				e.printStackTrace();

			}

		}

	}

	public static void close(ResultSet rs){

		if(rs != null){

			try{

				rs.close();

			}catch(SQLException e){

				e.printStackTrace();

			}

		}

	}
}
