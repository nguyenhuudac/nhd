package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class paymentConfirm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"NewPayment\">\n");
      out.write("            <h1><span>NEW</span><lable>Payment</lable></h1>\n");
      out.write("            <div class=\"inset\">\n");
      out.write("                <input type=\"hidden\" value=\"");
      out.print(request.getParameter("id"));
      out.write("\" name=\"id\"/>\n");
      out.write("                <div>Partner ID: ");
      out.print(request.getParameter("partnerId"));
      out.write(" </div><br>\n");
      out.write("                <input type=\"hidden\" value=\"");
      out.print(request.getParameter("partnerId"));
      out.write("\" name=\"partnerId\"/>\n");
      out.write("\n");
      out.write("                <div>Bill ID: ");
      out.print(request.getParameter("biillId"));
      out.write("</div><br>\n");
      out.write("                <input type=\"hidden\" value=\"");
      out.print(request.getParameter("biillId"));
      out.write("\" name=\"biillId\"/>\n");
      out.write("\n");
      out.write("                <div>Account ID: ");
      out.print(request.getParameter("accountId"));
      out.write("</div><br>\n");
      out.write("                <input type=\"hidden\" value=\"");
      out.print(request.getParameter("accountId"));
      out.write("\" name=\"accountId\"/>\n");
      out.write("\n");
      out.write("                <div>Partner's PIN Code: ");
      out.print(request.getParameter("accountPin"));
      out.write("</div><br>\n");
      out.write("                \n");
      out.write("                <input type=\"hidden\" value=\"");
      out.print(request.getParameter("accountPin"));
      out.write("\" name=\"accountPin\"/>\n");
      out.write("                <div>Transaction Name: ");
      out.print(request.getParameter("transactionName"));
      out.write("</div><br>\n");
      out.write("                \n");
      out.write("                <input type=\"hidden\" value=\"");
      out.print(request.getParameter("transactionName"));
      out.write("\" name=\"name\"/>\n");
      out.write("                <div>Payment Amount: ");
      out.print(request.getParameter("transactionAmount"));
      out.write(" (VND)</div><br>\n");
      out.write("                \n");
      out.write("                <input type=\"hidden\" value=\"");
      out.print(request.getParameter("transactionAmount"));
      out.write("\" name=\"transactionAmount\"/>\n");
      out.write("                <div>Fee Payer: ");
      out.print(request.getParameter("feePayer"));
      out.write("</div><br>\n");
      out.write("                \n");
      out.write("                ");

                    int transactionAmount = Integer.parseInt(request.getParameter("transactionAmount"));
                    int fee;
                    if (transactionAmount > 5000000) {
                        fee = transactionAmount / 200;
                    } else if (transactionAmount > 1000000) {
                        fee = transactionAmount / 100;
                    } else if (transactionAmount > 500000) {
                        fee = transactionAmount / 67;
                    } else if (transactionAmount > 100000) {
                        fee = transactionAmount / 50;
                    } else {
                        fee = 10000;
                    }
                    String finalFee = Integer.toString(fee);
                
      out.write("\n");
      out.write("                \n");
      out.write("                <div>Payment Fee: ");
      out.print(finalFee);
      out.write("</div><br>\n");
      out.write("                <input type=\"hidden\" value=\"");
      out.print(finalFee);
      out.write("\" name=\"fee\"/>\n");
      out.write("                \n");
      out.write("                ");

                    String receiveAmount;
                    String sendAmount;
                    String feePayer = request.getParameter("feePayer");
                    if (feePayer.equals("2")) {
                        receiveAmount = Integer.toString(transactionAmount - fee);
                        sendAmount = Integer.toString(transactionAmount);
                    } else {
                        receiveAmount = Integer.toString(transactionAmount);
                        sendAmount = Integer.toString(transactionAmount + fee);

                    }
                
      out.write("\n");
      out.write("                \n");
      out.write("                <div>Receive Amount: ");
      out.print(receiveAmount);
      out.write("</div><br>\n");
      out.write("                <input type=\"hidden\" value=\"");
      out.print(receiveAmount);
      out.write("\" name=\"receiveAmount\"/>\n");
      out.write("                <div>Send Amount: ");
      out.print(sendAmount);
      out.write("</div><br>\n");
      out.write("                <input type=\"hidden\" value=\"");
      out.print(sendAmount);
      out.write("\" name=\"sendAmount\"/>\n");
      out.write("                <input type=\"submit\" value=\"Submit\"/>\n");
      out.write("            </div><br>\n");
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
