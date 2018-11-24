package jdbc_sample;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class sample2 {

	public static void main(String[] args){

		select();

	}

	public static void select(){

		Connection con = null;

		PreparedStatement st = null;

		ResultSet rs = null;

		try{

			con = DBManager.getConnection();

			String sql = "SELECT * FROM employee where emp_name LIKE ?";

			st = con.prepareStatement(sql);

			st.setString(1, "%田%");

			rs = st.executeQuery();

			while(rs.next()){

				System.out.println(rs.getString("emp_id") + "\t");
				System.out.println(rs.getString("emp_name") + "\t");
				System.out.println(rs.getString("gender") + "\t");
				System.out.println(rs.getString("birthday"));


			}

		}catch(Exception e){

			e.printStackTrace();

		}finally{

			DBManager.close(rs);
			DBManager.close(st);
			DBManager.close(con);

		}

	}

}
