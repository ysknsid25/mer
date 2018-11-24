package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bean.Menber;
import util.StringQuery;

public class MenberDAO extends DAO {

	/**
	 *
	 * ページの先頭に使用するクエリを記載します
	 *
	 * @Query ID,Password検索クエリ
	 *
	 * @param userId
	 * @param password
	 * @return
	 * @throws Exception
	 */


	public Menber search(String userId, String password) throws Exception{

		Menber menber = null;

		Connection con = getConnection();

		PreparedStatement st;

		// SELECT * FROM menber WHERE userid = ? AND password = ?
		st=con.prepareStatement(
				StringQuery.SELECT_SIGNAL + StringQuery.KOME
				+ StringQuery.FROM_SIGNAL + StringQuery.MENBER + StringQuery.SPACE
				+ StringQuery.WHERE_SIGNAL + StringQuery.USERID + StringQuery.SPACE + StringQuery.EQUAL + StringQuery.HATENA
				+ StringQuery.AND
				+ StringQuery.PASS + StringQuery.SPACE + StringQuery.EQUAL + StringQuery.HATENA
				);

		st.setString(1, userId);
		st.setString(2, password);
		ResultSet rs=st.executeQuery();

		while (rs.next()){

			menber = new Menber();
			menber.setUserId(rs.getString(StringQuery.USERID));
			menber.setPassword(rs.getString(StringQuery.PASS));
			menber.setUserName(rs.getString(StringQuery.USERNAME));

		}

		close(rs);
		close(st);
		close(con);

		return menber;

	}



}
