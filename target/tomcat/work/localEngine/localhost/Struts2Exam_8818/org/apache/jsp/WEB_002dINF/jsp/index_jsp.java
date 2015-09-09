package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"bootstrap.min.css\">\r\n");
      out.write("<link href=\"style.css\" type=\"text/css\" rel=\"stylesheet\" />\r\n");
      out.write("<script src=\"jquery-2.1.4.min.js\"></script>\r\n");
      out.write("<script src=\"bootstrap.js\"></script>\r\n");
      out.write("<script src=\"bootstrap-paginator.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("$(document).ready(\r\n");
      out.write("\tfunction() {\r\n");
      out.write("\t\tvar arr;\r\n");
      out.write("\t\tfunction ajaxForData() {\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\tmethod : \"Post\",\r\n");
      out.write("\t\t\t\turl : \"/Struts2Exam_8818/show\",\r\n");
      out.write("\t\t\t\tasync : true,\r\n");
      out.write("\t\t\t\tdata : \"\",\r\n");
      out.write("\t\t\t\tdataType : 'json',\r\n");
      out.write("\t\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\t\t//alert(\"Data Getted: \" + data);\r\n");
      out.write("\t\t\t\t\tarr = data;\r\n");
      out.write("\t\t\t\t\tvar tr = '';\r\n");
      out.write("\t                for(var index=0;index<10;index++){\r\n");
      out.write("\t                \tvar str = \"确定要删除此记录？\";\r\n");
      out.write("\t                    tr = \"<tr><td height='40px' width='80px'>\"+\r\n");
      out.write("\t                    \"<a href='Delete_delete?id=\"+arr[index].customer_id+\"' onclick='return confirm()'>删除</a>\"\r\n");
      out.write("\t                    \t\t+\"|<a href='javascript:void(0)' onclick='update(this);'>编辑</a>\"\r\n");
      out.write("\t                    \t\t+ \"</td><td>\"\r\n");
      out.write("\t                            + arr[index].customer_id + \"</td><td>\"\r\n");
      out.write("\t                            + arr[index].first_name + \"</td><td>\"\r\n");
      out.write("\t                            + arr[index].last_name + \"</td><td>\"\r\n");
      out.write("\t                            + arr[index].address + \"</td><td>\"\r\n");
      out.write("\t                            + arr[index].email + \"</td><td>\"\r\n");
      out.write("\t                            + arr[index].last_update.toString().substring(0,9) + \"</td></tr>\";\r\n");
      out.write("\t                    $(\"#table\").append(tr);\r\n");
      out.write("\t                }\r\n");
      out.write("\t                var sign = false;\r\n");
      out.write("\t                var pages = Math.floor(arr.length/10);\r\n");
      out.write("\t                var num = arr.length%10;\r\n");
      out.write("\t                if(num!=0){\r\n");
      out.write("\t                \tsign = true;\r\n");
      out.write("\t                \tpages = pages + 1;\r\n");
      out.write("\t                }\r\n");
      out.write("\t                //alert(pages+\" \"+num+\" \"+arr.length+\" \"+arr.length/10);\r\n");
      out.write("\t\t\t\t\tvar options = {\r\n");
      out.write("\t\t\t\t            bootstrapMajorVersion:3,\r\n");
      out.write("\t\t\t\t            size:\"normal\",\r\n");
      out.write("\t\t\t\t            alignment:\"center\",\r\n");
      out.write("\t\t\t\t            currentPage: 1,\r\n");
      out.write("\t\t\t\t            totalPages: pages,\r\n");
      out.write("\t\t\t\t            numberOfPages:5,\r\n");
      out.write("\t\t\t\t            itemTexts: function (type, page, current) {\r\n");
      out.write("\t\t\t\t                switch (type) {\r\n");
      out.write("\t\t\t\t                    case \"first\":\r\n");
      out.write("\t\t\t\t                        return \"首页\";\r\n");
      out.write("\t\t\t\t                    case \"prev\":\r\n");
      out.write("\t\t\t\t                        return \"上一页\";\r\n");
      out.write("\t\t\t\t                    case \"next\":\r\n");
      out.write("\t\t\t\t                        return \"下一页\";\r\n");
      out.write("\t\t\t\t                    case \"last\":\r\n");
      out.write("\t\t\t\t                        return \"末页\";\r\n");
      out.write("\t\t\t\t                    case \"page\":\r\n");
      out.write("\t\t\t\t                        return page;\r\n");
      out.write("\t\t\t\t                }\r\n");
      out.write("\t\t\t\t            },\r\n");
      out.write("\t\t\t\t            itemContainerClass: function (type, page, current) {\r\n");
      out.write("\t\t\t\t                return (page === current) ? \"active\" : \"pointer-cursor\";\r\n");
      out.write("\t\t\t\t            },\r\n");
      out.write("\t\t\t\t            useBootstrapTooltip:true,\r\n");
      out.write("\t\t\t\t            bootstrapTooltipOptions: {\r\n");
      out.write("\t\t\t\t                html: true,\r\n");
      out.write("\t\t\t\t                placement: 'bottom'\r\n");
      out.write("\t\t\t\t            },\r\n");
      out.write("\t\t\t\t            onPageClicked: function(e,originalEvent,type,page){\r\n");
      out.write("\t\t\t\t                $(\"#table\").empty();\r\n");
      out.write("\t\t\t\t                var tr = '';\r\n");
      out.write("\t\t\t\t                var temp = page*10;\r\n");
      out.write("\t\t\t\t                if(sign&&page==pages){\r\n");
      out.write("\t\t\t\t                \ttemp = temp + num;\r\n");
      out.write("\t\t\t\t                }\r\n");
      out.write("\t\t\t\t                for(var index=(page-1)*10;index<temp;index++){\r\n");
      out.write("\t\t\t\t                \tvar str = \"确定要删除此记录？\";\r\n");
      out.write("\t\t\t\t                    tr = \"<tr><td height='40px' width='80px'>\"\r\n");
      out.write("\t\t\t\t                    +\"<a href='Delete_delete?id=\"+arr[index].customer_id+\"' onclick='return confirm()'>删除</a>\" \r\n");
      out.write("\t\t\t\t                    +\"|<a href='javascript:void(0)' onclick='update(this);'>编辑</a>\"\r\n");
      out.write("\t\t\t\t                    \t\t+ \"</td><td>\"\r\n");
      out.write("\t\t\t\t                    \t\t+ arr[index].customer_id + \"</td><td>\"\r\n");
      out.write("\t\t\t\t                            + arr[index].first_name + \"</td><td>\"\r\n");
      out.write("\t\t\t\t                            + arr[index].last_name + \"</td><td>\"\r\n");
      out.write("\t\t\t\t                            + arr[index].address + \"</td><td>\"\r\n");
      out.write("\t\t\t\t                            + arr[index].email + \"</td><td>\"\r\n");
      out.write("\t\t\t\t                            + arr[index].last_update.toString().substring(0,9) + \"</td></tr>\";\r\n");
      out.write("\t\t\t\t                    $(\"#table\").append(tr);\r\n");
      out.write("\t\t\t\t                }\r\n");
      out.write("\t\t\t\t            }\r\n");
      out.write("\t\t\t\t        }\r\n");
      out.write("\t\t\t\t        $('#page').bootstrapPaginator(options);\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\ttimeout : 800,\r\n");
      out.write("\t\t\t\terror : function(info, status, error) {\r\n");
      out.write("\t\t\t\t\talert('Error: ' + info.status + ' - ' + error);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t;\r\n");
      out.write("\t\t");

		if(session.getAttribute("user")!=null){
			
      out.write("\r\n");
      out.write("\t\t\tajaxForData();\r\n");
      out.write("\t\t\t");

		}
		
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t});\r\n");
      out.write("function ajaxForAddressData() {\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t\tmethod : \"Post\",\r\n");
      out.write("\t\turl : \"/Struts2Exam_8818/getAddress\",\r\n");
      out.write("\t\tasync : true,\r\n");
      out.write("\t\tdata : \"\",\r\n");
      out.write("\t\tdataType : 'json',\r\n");
      out.write("\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t//alert(\"Data Getted: \" + data);\r\n");
      out.write("\t\t\t//arr = data;\r\n");
      out.write("\t\t\tvar op = '';\r\n");
      out.write("               for(var index=0;index<data.length;index++){\r\n");
      out.write("                   op = \"<option>\"+ data[index] + \"</option>\";\r\n");
      out.write("                   $(\"#input_fours\").append(op);\r\n");
      out.write("               }\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\ttimeout : 800,\r\n");
      out.write("\t\terror : function(info, status, error) {\r\n");
      out.write("\t\t\talert('Error: ' + info.status + ' - ' + error);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function update(obj){\r\n");
      out.write("\tajaxForAddressData();\r\n");
      out.write("\tvar tds=$(obj).parent().parent().find('td');\r\n");
      out.write("\t$('#input_o').val(tds.eq(1).text());\r\n");
      out.write("\t$('#input_ones').val(tds.eq(2).text());\r\n");
      out.write("\t$('#input_twos').val(tds.eq(3).text());\r\n");
      out.write("\t$('#input_threes').val(tds.eq(5).text());\r\n");
      out.write("\t$('#exampleModal').modal();\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div>\r\n");
      out.write("\t<div id=\"index_head\">\r\n");
      out.write("\t\t<button type=\"button\" class=\"btn btn-info\" id=\"index_head_btn\">Admin</button>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"col-lg-2\" id=\"index_left\">\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<li><a href=\"index.jsp\"><h3>Customer管理</h3></a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\"><h3>Film设置</h3></a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"col-lg-10 table-bordered\">\r\n");
      out.write("\t\t<div><h1>客户管理</h1></div>\r\n");
      out.write("\t\t<hr>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<div id=\"index_right_head\">\r\n");
      out.write("\t\t\t\t<div style=\"float: left; width: 20%; margin: 0px; padding: 0px;\">\r\n");
      out.write("\t\t\t\t\t客户列表</div>\r\n");
      out.write("\t\t\t\t<div style=\"float: right; width: 80%; margin: 0px; padding: 0px;\">\r\n");
      out.write("\t\t\t\t\t<a href=\"/WEB-INF/jsp/add.jsp\"><button type=\"button\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"btn btn-info\">新建</button></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<hr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<table class=\"table table-bordered table-striped table-hover\">\r\n");
      out.write("\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<th>操作</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>customerId</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>first name</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>last name</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>address</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>email</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>lastUpdate</th>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t<tbody id=\"table\"></tbody>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-9 text-center\">\r\n");
      out.write("\t\t\t\t\t<ul id=\"page\" class=\"pagination\"></ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\">\r\n");
      out.write("    <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\"\r\n");
      out.write("\t\t\t\t\t\taria-label=\"Close\">\r\n");
      out.write("\t\t\t\t\t\t<span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t<h4 class=\"modal-title\" id=\"exampleModalLabel\">基本信息</h4>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"modal-body\">\r\n");
      out.write("\t\t\t\t\t<!--创建客户-->\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-9\">\r\n");
      out.write("\t\t\t\t\t\t\t<form class=\"form-horizontal col-lg-9\" name=\"LoginForm\"\r\n");
      out.write("\t\t\t\t\t\t\t\tmethod=\"POST\" action=\"Update_update\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group form-group-md hide\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"col-md-2 control-label\" for=\"input_o\">CustomerId<span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tstyle=\"color: red\">*</span></label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-md-8 col-md-offset-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input class=\"form-control\" type=\"text\" id=\"input_o\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tname=\"customerId\" placeholder=\"CustomerId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group form-group-md\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"col-md-2 control-label\" for=\"input_ones\">FirstName<span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tstyle=\"color: red\">*</span></label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-md-8 col-md-offset-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input class=\"form-control\" type=\"text\" id=\"input_ones\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tname=\"fname\" placeholder=\"FirstName\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group form-group-md\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"col-md-2 control-label\" for=\"input_twos\">LastName<span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tstyle=\"color: red\">*</span></label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-md-8 col-md-offset-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input class=\"form-control\" type=\"text\" id=\"input_twos\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tname=\"lname\" placeholder=\"LastName\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group form-group-md\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"col-md-2 control-label\" for=\"input_threes\">Email</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-md-8 col-md-offset-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input class=\"form-control\" type=\"email\" id=\"input_threes\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tname=\"email\" placeholder=\"Email\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group form-group-md\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"col-md-2 control-label\" for=\"input_fours\">Address<span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tstyle=\"color: red\">*</span></label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-md-8 col-md-offset-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<select class=\"form-control input-lg\" id=\"input_fours\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tname=\"addressname\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group form-group-md\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-md-10 text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button class=\"btn btn-info\" onclick=\"check()\">提交</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button type=\"reset\" class=\"btn\">取消</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
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
