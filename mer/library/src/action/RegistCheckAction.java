package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tool.Action;
import tool.Verify;
import util.StringQuery;
import util.StringUtil;


public class RegistCheckAction extends Action{

	/**
	 *
	 * 検証用クラスのインスタンス化
	 *
	 */
	Verify vr = new Verify();

	public String execute(
			HttpServletRequest request, HttpServletResponse response) throws Exception{

		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");

		String booktitle = request.getParameter(StringQuery.BOOKTITLE);
		String author = request.getParameter(StringQuery.AUTHOR);
		String publisher = request.getParameter(StringQuery.PUBLISHER);
		String publishday = request.getParameter(StringQuery.PUBLISHDAY);
		String category = request.getParameter(StringQuery.CATEGORY);

		int btcheck = vr.booktitleVerify(booktitle);
		int aucheck = vr.authorVerify(author);
		int yearcheck = vr.publishedYearVerify(publishday);

		if(btcheck==StringUtil.MOJHI_OK && aucheck==StringUtil.MOJHI_OK
				&& yearcheck==StringUtil.MOJHI_OK){

			setBookInformation(booktitle,author,publisher,publishday,category,request);

			return StringUtil.VIEW_FOLDER + StringUtil.SLASH + StringUtil.PAGE_REGIST_CHECK
					+ StringUtil.DOT + StringUtil.JSP_EXTENSION;

		}else{

			setBookInformation(booktitle,author,publisher,publishday,category,request);

			request.setAttribute(StringQuery.BOOKTITLE_CK, btcheck);
			request.setAttribute(StringQuery.AUTHOR_CK, aucheck);
			request.setAttribute(StringQuery.PUBLISHDAY_CK, yearcheck);

			return StringUtil.VIEW_FOLDER + StringUtil.SLASH + StringUtil.PAGE_REGIST
					+ StringUtil.DOT + StringUtil.JSP_EXTENSION;

		}

	}




	private void setBookInformation(String booktitle, String author, String publisher, String publishday
			,String category,HttpServletRequest request) {

		request.setAttribute(StringQuery.BOOKTITLE, booktitle);
		request.setAttribute(StringQuery.AUTHOR, author);
		request.setAttribute(StringQuery.PUBLISHER, publisher);
		request.setAttribute(StringQuery.PUBLISHDAY, publishday);
		request.setAttribute(StringQuery.CATEGORY, category);

	}



}