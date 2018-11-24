package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tool.Action;
import util.StringUtil;


public class ReturnCheckAction extends Action{

	public String execute(
			HttpServletRequest request, HttpServletResponse response) throws Exception{

		return StringUtil.VIEW_FOLDER + StringUtil.SLASH + StringUtil.PAGE_RETURN_COMPLETE
				+ StringUtil.DOT + StringUtil.JSP_EXTENSION;

	}

}