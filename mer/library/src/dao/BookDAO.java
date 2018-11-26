package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import util.StringQuery;

public class BookDAO extends DAO{

	public void regist(String booktitle, String author, String publisher, String publishday,
			String runame, String registday,int category) throws Exception {

		Connection con = getConnection();

		PreparedStatement st;

		st = con.prepareStatement(
				"insert into BOOK values (seq_bookId.nextval,?,?,?,?,?,"
						+ "?,?,?,?,?)");

		st.setString(1, booktitle);
		st.setString(2, author);
		st.setString(3, publisher);
		st.setString(4, publishday);
		st.setString(5, runame);
		st.setString(6, registday);
		st.setString(7, StringQuery.EMPTY);
		st.setString(8, StringQuery.EMPTY);
		st.setInt(9, StringQuery.FLAG_OFF);
		st.setInt(10, category);

		try {

			st.executeUpdate();

		}catch(Exception error) {

			error.printStackTrace();

		}finally {

			close(con);
			close(st);

		}

	}

}
