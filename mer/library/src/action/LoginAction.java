package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Menber;
import dao.MenberDAO;
import tool.Action;
import tool.Verify;
import util.StringQuery;
import util.StringUtil;

public class LoginAction  extends Action{

	/**
	 *
	 * 検証用クラスのインスタンス化
	 *
	 */
	Verify vr = new Verify();

	public String execute(
			HttpServletRequest request, HttpServletResponse response) throws Exception{

		HttpSession session=request.getSession();

		String userId = request.getParameter(StringQuery.USERID);
		String password = request.getParameter(StringQuery.PASS);

		if(vr.useidVerify(userId)==StringUtil.MOJHI_OK
				&& vr.passwordVeryfy(password)==StringUtil.MOJHI_OK){

			MenberDAO dao = new MenberDAO();
			Menber menber = dao.search(userId,password);

			try{

				if(menber.getUserId() != null){

					session.setAttribute(StringQuery.USERNAME, menber.getUserName());

				}
			}catch(NullPointerException nulpo){

				//何かしらのエラーが発生しているので、エラー表示後ログイン画面へ
				return StringUtil.VIEW_FOLDER + StringUtil.SLASH + StringUtil.PAGE_ERROR
						+ StringUtil.DOT + StringUtil.JSP_EXTENSION;

			}

			// /view/menu.jsp;
			return StringUtil.VIEW_FOLDER + StringUtil.SLASH + StringUtil.PAGE_MENU
					+ StringUtil.DOT + StringUtil.JSP_EXTENSION;

		}else{

			request.setAttribute(StringUtil.SCOPE_IDPASS_ERROR, StringUtil.MOJHI_ERROR);
			// /view/index.jsp
			return StringUtil.VIEW_FOLDER + StringUtil.SLASH;

		}


	}

}



