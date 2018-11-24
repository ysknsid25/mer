package jdbc_sample;

import java.sql.Connection;

public class sample1 {

	public static void main(String[] args){

		Connection con = null;


		try{

			con = DBManager.getConnection();

		}catch(Exception e){

			e.printStackTrace();

		}finally{

			DBManager.close(con);

		}

	}

}
