package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BookDAO;
import tool.Action;
import util.StringQuery;
import util.StringUtil;

public class RegistCompleteAction extends Action{

	public String execute(
			HttpServletRequest request, HttpServletResponse response) throws Exception{

		try {

			response.setContentType("text/html; charset=UTF-8");
			request.setCharacterEncoding("UTF-8");


			String booktitle = request.getParameter(StringQuery.BOOKTITLE);
			String author = request.getParameter(StringQuery.AUTHOR);
			String publisher = request.getParameter(StringQuery.PUBLISHER);
			String publishday = request.getParameter(StringQuery.PUBLISHDAY);
			String runame = request.getParameter(StringQuery.RUNAME);
			String registday = request.getParameter(StringQuery.REGISTDAY);
			int category = Integer.parseInt(request.getParameter(StringQuery.CATEGORY));

			BookDAO dao = new BookDAO();
			dao.regist(booktitle,author,publisher,publishday,runame,registday,category);

			return StringUtil.VIEW_FOLDER + StringUtil.SLASH + StringUtil.PAGE_REGIST_COMPLETE
					+ StringUtil.DOT + StringUtil.JSP_EXTENSION;

		}catch(Exception error) {

			//何かしらのエラーが発生しているので、エラー表示後ログイン画面へ
			return StringUtil.VIEW_FOLDER + StringUtil.SLASH + StringUtil.PAGE_ERROR
					+ StringUtil.DOT + StringUtil.JSP_EXTENSION;

		}
	}
}