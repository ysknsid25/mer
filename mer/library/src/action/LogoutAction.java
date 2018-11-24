package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tool.Action;
import util.StringQuery;
import util.StringUtil;

public class LogoutAction extends Action{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

		HttpSession session = request.getSession();

		if(session.getAttribute(StringQuery.USERNAME) != null){

			session.removeAttribute(StringQuery.USERNAME);
			return StringUtil.VIEW_FOLDER + StringUtil.SLASH;

		}

		request.setAttribute(StringUtil.SCOPE_LOGOUT_ERROR, StringUtil.LOGOUT_ERROR);
		return StringUtil.VIEW_FOLDER + StringUtil.SLASH + StringUtil.PAGE_ERROR
				+ StringUtil.DOT + StringUtil.JSP_EXTENSION;
	}

}
