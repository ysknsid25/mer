package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.StringUtil;


public class DAO {


	/**
	 *
	 * DBと接続する
	 *
	 */
	protected Connection getConnection() throws ClassNotFoundException, SQLException{

		//JavaドライバクラスをJVMに登録
		Class.forName(StringUtil.DRIVER_NAME);

		//DBに接続
		Connection conect
		= DriverManager.getConnection(StringUtil.DRIVER_URL,StringUtil.DRIVER_USER_NAME,StringUtil.DRIVER_PASSWORD);

		//DBコネクションを返す
		return conect;

	}


	/**
	 *
	 * DBの接続を切断する
	 */
	protected void close(Connection conect){

		if(conect != null){

			try{

				conect.close();

			}catch(SQLException errorSQLException){

				errorSQLException.printStackTrace();

			}

		}

	}


	/**
	 * PreparedStatementをクロースする
	 *
	 */
	protected void close(PreparedStatement preparedstatement){

		if(preparedstatement != null){

			try{

				preparedstatement.close();

			}catch(SQLException errorSQLException){

				errorSQLException.printStackTrace();

			}

		}

	}


	/**
	 *
	 * ResultSetをクローズする
	 *
	 */
	protected void close(ResultSet resultset){



		if(resultset != null){

			try{

			resultset.close();

		}catch(SQLException errorSQLException){

			errorSQLException.printStackTrace();

		}

	}
	}





}
