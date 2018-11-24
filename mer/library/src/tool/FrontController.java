package tool;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.StringUtil;

/**
 * Servlet implementation class FrontController
 * MVCモデルにおける唯一の入り口で、ここから全ての処理を割り振ります。
 *
 * hogehoge.actionと名付けられたようなURLを開くと、FrontControllerが実行される。
 *
 */


@WebServlet(urlPatterns={"*.action"})
public class FrontController extends HttpServlet {

	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
	ServletException, IOException {

		response.setCharacterEncoding(StringUtil.SET_ENCODING);
		response.setContentType(StringUtil.SET_ENCODING);
		PrintWriter out = response.getWriter();

		try{

			/**
			 * リクエストのURLに含まれるサーブレットのパスを取得します。
			 *  -> substringメソッドにより先頭の1文字を削除します。
			 *
			 *  URLを /hoge/hogehoge ->hoge.hogehoge の形に加工する処理を行います。
			 *
			*/

			String path = request.getServletPath().substring(1);

			String className =
					StringUtil.PACKAGE +
					path.replace(StringUtil.BEFORE_REPLACE_a,StringUtil.AFTER_REPLACE_A)
            .replace(StringUtil.SLASH,StringUtil.DOT);

			/**
			 * forNameメソッドにより、指定した名前のClassオブジェクトを返します。
			 * newInstanceメソッドにより、新しいインスタンスを作成します。
			 */
			Action action = (Action)Class.forName(className).newInstance();

			//作成したクラスオブジェクトのexcuteメソッドを実行する
			String url=action.execute(request, response);

			 RequestDispatcher dispatcher = request.getRequestDispatcher(url);
              dispatcher.forward(request, response);

		}catch(Exception error){

			error.printStackTrace(out);

		}
	}


	/**
	 *
	 * Getメソッドを用いていようと、内部的にはすべてPOSTとして処理をします。
	 *
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request,response);
	}


}
