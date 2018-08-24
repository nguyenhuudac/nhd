package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class payment_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>New Payment</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"paymentConfirm.jsp\" method=\"GET\">\n");
      out.write("            <h1><span>NEW</span><lable> Payment </lable></h1>\n");
      out.write("            <input type=\"hidden\" value=\"");
      out.print(request.getParameter("id"));
      out.write("\" name=\"id\"/>\n");
      out.write("\n");
      out.write("            <label for=\"id\">Partner ID:</label>\n");
      out.write("            <input type=\"text\" name=\"partnerId\" placeholder=\"\" maxlength=\"20\" required/><br>\n");
      out.write("            \n");
      out.write("            <label for=\"biillId\">Bill ID:</label>\n");
      out.write("            <input type=\"text\" placeholder=\"\" name=\"biillId\" maxlength=\"20\" required/><br>\n");
      out.write("            \n");
      out.write("            <label for=\"accountId\">Account ID:</label>\n");
      out.write("            <input type=\"text\" name=\"accountId\" placeholder=\"\" maxlength=\"20\" required/><br>\n");
      out.write("            \n");
      out.write("            <label for=\"accountPin\">Partner's PIN Code:</label>\n");
      out.write("            <input type=\"text\" name=\"accountPin\" placeholder=\"\" maxlength=\"20\" required/><br>\n");
      out.write("            \n");
      out.write("            <label for=\"id\">Transaction Name:</label>\n");
      out.write("            <input type=\"text\" name=\"transactionName\" placeholder=\"\" maxlength=\"20\" required/><br>\n");
      out.write("            \n");
      out.write("            <label for=\"transactionAmount\">Payment Amount:</label>\n");
      out.write("            <input type=\"text\" name=\"transactionAmount\" placeholder=\"\" required/><br>\n");
      out.write("            \n");
      out.write("            <label for=\"feePayer\">Fee Payer:</label>\n");
      out.write("            <select name=\"feePayer\">\n");
      out.write("                <option value=\"1\">sender(partner)</option>\n");
      out.write("                <option value=\"2\">receiver(you)</option>\n");
      out.write("            </select><br>\n");
      out.write("            \n");
      out.write("            ");

                String id = request.getParameter("id");
                request.setAttribute("id", request.getParameter("id"));
            
      out.write("\n");
      out.write("            \n");
      out.write("            <input type=\"submit\" value=\"Next step\"/>\n");
      out.write("            <a href=\"menu.jsp?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&name=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Cancel</a>\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
