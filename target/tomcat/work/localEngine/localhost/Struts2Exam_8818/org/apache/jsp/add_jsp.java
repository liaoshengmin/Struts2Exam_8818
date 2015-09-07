package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"bootstrap.min.css\">\r\n");
      out.write("<link href=\"style.css\" type=\"text/css\" rel=\"stylesheet\" />\r\n");
      out.write("<script src=\"jquery-2.1.4.min.js\"></script>\r\n");
      out.write("<script src=\"bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");

		ArrayList listname1 = new ArrayList();
		listname1 = (ArrayList) session.getAttribute("listname1");
	
      out.write("\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<div id=\"index_head\">\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"btn btn-info\" id=\"index_head_btn\">Admin</button>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"index_left\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li><a href=\"index.jsp\"><h3>Customer管理</h3></a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\"><h3>Film设置</h3></a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"index_right\">\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<h1>客户管理</h1>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<hr>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<div id=\"add_right_head\">\r\n");
      out.write("\t\t\t\t\t<h3>创建Customer</h3>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<hr>\r\n");
      out.write("\t\t\t\t<form action=\"add\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t<div class=\"row\" id=\"add_input\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-1\">\r\n");
      out.write("\t\t\t\t\t\t\tFirstName<a style=\"color: red\">*</a>：\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-11\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"fname\" />\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-1\">\r\n");
      out.write("\t\t\t\t\t\t\tLastName<a style=\"color: red\">*</a>：\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-11\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"lname\" />\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-1\">Email：</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-11\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"email\" />\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-1\">\r\n");
      out.write("\t\t\t\t\t\t\tAddress<a style=\"color: red\">*</a>：\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-11\">\r\n");
      out.write("\t\t\t\t\t\t\t<select name=\"addressname\">\r\n");
      out.write("\t\t\t\t\t\t\t\t");

									for (int i = 0; i < listname1.size(); i++) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<option>");
      out.print(listname1.get(i));
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t");

									}
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-2\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" class=\"btn btn-info\" value=\"新建\"> <input\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"reset\" class=\"btn btn-info\" value=\"取消\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
