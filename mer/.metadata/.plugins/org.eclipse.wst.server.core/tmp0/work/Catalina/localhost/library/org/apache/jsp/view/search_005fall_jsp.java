/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.53
 * Generated at: 2018-11-26 13:09:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import util.StringUtil;

public final class search_005fall_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("util.StringUtil");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"");
      out.print(StringUtil.SET_ENCODING );
      out.write("\">\n");
      out.write("<link href='");
      out.print(StringUtil.CONTEXTPATH + StringUtil.SEARCHALLCSS);
      out.write("'\n");
      out.write("\trel='stylesheet' type='text/css' />\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(StringUtil.SEARCHALLJS);
      out.write("\"></script>\n");
      out.write("<title>全件検索画面</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"info\">\n");
      out.write("\t\t\t<h1>Book Search</h1>\n");
      out.write("\t\t\t<div id=\"searchAll-form\">\n");
      out.write("\t\t\t\t<form action=\"searchAll.action\" method=\"get\">\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"booktitle\" id=\"form-userid\"\n");
      out.write("\t\t\t\t\t\tplaceholder=\"Enter BookTitle\" /> <input type=\"submit\"\n");
      out.write("\t\t\t\t\t\tname=\"submit\" value=\"Search\" />\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<!-- Normal Demo　ここから-->\n");
      out.write("\t\t<div class=\"column\">\n");
      out.write("\t\t\t<div class=\"demo-title\">\n");
      out.write("\t\t\t\tNew&#33;&#33;\n");
      out.write("\t\t\t\t<!--年・月を取得し、今年・今月ならばNEWを表示させる-->\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- Post-->\n");
      out.write("\t\t\t<div class=\"post-module\">\n");
      out.write("\t\t\t\t<!-- Thumbnail-->\n");
      out.write("\t\t\t\t<div class=\"thumbnail\">\n");
      out.write("\t\t\t\t\t<div class=\"date\">\n");
      out.write("\t\t\t\t\t\t<div class=\"day\">26</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"month\">Nov</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"year\">2018</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!-- 画像は、乱数を使ってランダムに変える -->\n");
      out.write("\t\t\t\t\t<img\n");
      out.write("\t\t\t\t\t\tsrc=\"https://s3-us-west-2.amazonaws.com/s.cdpn.io/169963/photo-1429043794791-eb8f26f44081.jpeg\" />\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- Post Content-->\n");
      out.write("\t\t\t\t<div class=\"post-content\">\n");
      out.write("\t\t\t\t\t<div class=\"category\">Category</div>\n");
      out.write("\t\t\t\t\t<h1 class=\"title\">Title</h1>\n");
      out.write("\t\t\t\t\t<h2 class=\"sub_title\">Author</h2>\n");
      out.write("\t\t\t\t\t<div class=\"post-meta\">\n");
      out.write("\t\t\t\t\t<!-- 詳細画面へのリンク -->\n");
      out.write("\t\t\t\t\t\t<span class=\"timestamp\"><i class=\"fa fa-clock-\">>></i>detail</span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- ここまでで1つのカード -->\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
