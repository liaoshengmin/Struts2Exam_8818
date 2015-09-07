package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import com.film.Customer;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<script src=\"myjs.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"margin:0px;padding:0px\">\r\n");
      out.write("\t");

		ArrayList<Customer> list = new ArrayList();
		list = (ArrayList) session.getAttribute("list");
		ArrayList listname1 = new ArrayList();
		listname1 = (ArrayList) session.getAttribute("listname1");
	
      out.write("\r\n");
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
      out.write("\t\t\t\t<div id=\"index_right_head\">\r\n");
      out.write("\t\t\t\t\t<div style=\"float: left; width: 20%; margin: 0px; padding: 0px;\">\r\n");
      out.write("\t\t\t\t\t\t客户列表</div>\r\n");
      out.write("\t\t\t\t\t<div style=\"float: right; width: 80%; margin: 0px; padding: 0px;\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"getAddress.action\"><button type=\"button\" class=\"btn btn-info\">新建</button></a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<hr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"row\" id=\"index_right_info\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-1\">操作</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-1\">First Name</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-1\">Last Name</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-3\">Address</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-3\">Email</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-1\">CustomerId</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-2\">Last Update</div>\r\n");
      out.write("\t\t\t\t\t");

						for (int i = 0; i < list.size(); i++) {
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-1\">\r\n");
      out.write("\t\t\t\t\t<a id=\"aid\" href=\"delete.action?typeid=");
      out.print(list.get(i).getCustomer_id());
      out.write("\" >删除</a>\r\n");
      out.write("\t\t\t\t\t<a data-toggle=\"modal\" data-target=\"#exampleModal\">更新</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-1\">");
      out.print(list.get(i).getFirst_name());
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-1\">");
      out.print(list.get(i).getLast_name());
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-3\">");
      out.print(list.get(i).getAddress());
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-3\">");
      out.print(list.get(i).getEmail());
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-1\">");
      out.print(list.get(i).getCustomer_id());
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-2\">");
      out.print(list.get(i).getLast_update());
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t");

						}
					
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"modal fade\" id=\"exampleModal\" role=\"dialog\" tabindex=\"-1\"\r\n");
      out.write("\t\t\t\taria-labelledby=\"exampleModalLabel\">\r\n");
      out.write("\t\t\t\t<div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("\t\t\t\t\t<div class=\"modal-content\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"modal-body\">\r\n");
      out.write("\t\t\t\t\t\t\t<form action=\"add\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"row\" id=\"add_input\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tFirstName<a style=\"color: red\">*</a>：\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"fname\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tLastName<a style=\"color: red\">*</a>：\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"lname\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div>Email：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"email\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tAddress:<a style=\"color: red\">*</a>：&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<select name=\"addressname\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");

												for (int i = 0; i < listname1.size(); i++) {
											
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option>");
      out.print(listname1.get(i));
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");

												}
											
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"modal-footer\">\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\"\r\n");
      out.write("\t\t\t\t\t\t\t\tdata-dismiss=\"modal\">Close</button>\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-primary\">Send\r\n");
      out.write("\t\t\t\t\t\t\t\tmessage</button>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
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
