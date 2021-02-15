package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class stest_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-6\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <h5 class=\"mb-3\">Billing address</h5>\n");
      out.write("                <form class=\"needs-validation\" novalidate>\n");
      out.write("                    <div class=\"row g-3\">\n");
      out.write("                        <div class=\"col-sm-4\">\n");
      out.write("                            <label for=\"name\" class=\"form-label\">Name</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"firstName\" placeholder=\"\" value=\"\" required>\n");
      out.write("                            <div class=\"invalid-feedback\">\n");
      out.write("                                Valid first name is required.\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-sm-4\">\n");
      out.write("                            <label for=\"Contact\" class=\"form-label\">Contact</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"lastName\" placeholder=\"\" value=\"\" required>\n");
      out.write("                            <div class=\"invalid-feedback\">\n");
      out.write("                                Valid last name is required.\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!--            <div class=\"col-12\">\n");
      out.write("                                      <label for=\"username\" class=\"form-label\">Username</label>\n");
      out.write("                                      <div class=\"input-group\">\n");
      out.write("                                        <span class=\"input-group-text\">@</span>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"username\" placeholder=\"Username\" required>\n");
      out.write("                                      <div class=\"invalid-feedback\">\n");
      out.write("                                          Your username is required.\n");
      out.write("                                        </div>\n");
      out.write("                                      </div>\n");
      out.write("                                    </div>-->\n");
      out.write("\n");
      out.write("                        <div class=\"col-4\">\n");
      out.write("                            <label for=\"email\" class=\"form-label\">Address <span class=\"text-muted\">(Optional)</span></label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"address\" placeholder=\"Address\">\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div><br>\n");
      out.write("\n");
      out.write("                    <table class=\"table table-hover\">\n");
      out.write("\n");
      out.write("                        <thead class=\"table-dark\">\n");
      out.write("                        <th>ID</th>\n");
      out.write("                        <th>Name</th>\n");
      out.write("                        <th>Price</th>\n");
      out.write("                        <th>Quantity</th>\n");
      out.write("\n");
      out.write("                        </thead>\n");
      out.write("                        <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${products}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"p\">\n");
      out.write("                            <tr>\n");
      out.write("                                <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("\n");
      out.write("                            </tr>\n");
      out.write("                        </c:forEach>\n");
      out.write("\n");
      out.write("                    </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-6\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <h4 class=\"d-flex justify-content-between align-items-center mb-3\">\n");
      out.write("                    <span class=\"text-muted\">Order No</span>\n");
      out.write("                    <span class=\"badge bg-secondary rounded-pill\">3</span>\n");
      out.write("                </h4>\n");
      out.write("                <ul class=\"list-group mb-3\">\n");
      out.write("                    <!--          <li class=\"list-group-item d-flex justify-content-between lh-sm\">\n");
      out.write("                                <div>\n");
      out.write("                                  <h6 class=\"my-0\">Customer name</h6>\n");
      out.write("                                  <small class=\"text-muted\">Brief description</small>\n");
      out.write("                                </div>\n");
      out.write("                                <span class=\"text-muted\">Abc</span>\n");
      out.write("                              </li>-->\n");
      out.write("                    <li class=\"list-group-item d-flex justify-content-between lh-sm\">\n");
      out.write("                        <div>\n");
      out.write("                            <h6 class=\"my-0\">Total</h6>\n");
      out.write("                            <!--<small class=\"text-muted\">Brief description</small>-->\n");
      out.write("                        </div>\n");
      out.write("                        <span class=\"text-muted\">$8</span>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"list-group-item d-flex justify-content-between lh-sm\">\n");
      out.write("                        <div>\n");
      out.write("                            <h6 class=\"my-0\">Return</h6>\n");
      out.write("                            <!--<small class=\"text-muted\">Brief description</small>-->\n");
      out.write("                        </div>\n");
      out.write("                        <span class=\"text-muted\">$5</span>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"list-group-item d-flex justify-content-between bg-light\">\n");
      out.write("                        <div class=\"text-success\">\n");
      out.write("                            <h6 class=\"my-0\">Due</h6>\n");
      out.write("                            <!--<small>EXAMPLECODE</small>-->\n");
      out.write("                        </div>\n");
      out.write("                        <span class=\"text-success\">?$5</span>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"list-group-item d-flex justify-content-between\">\n");
      out.write("                        <span>Payable Total</span>\n");
      out.write("                        <strong>$20</strong>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("                <!--<form class=\"card p-2\">-->\n");
      out.write("                <div class=\"input-group pull-right\">\n");
      out.write("\n");
      out.write("                    <div class=\"col-9\"></div>\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-secondary \">Save</button>\n");
      out.write("                </div>\n");
      out.write("                <!--</form>-->\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
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
