package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import co.edu.udea.arqsoft.services.Producto;

public final class Editar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("            ");
      out.write("<hr/>\n");
      out.write("    ");

    try {
            co.edu.udea.arqsoft.services.Stockws_Service service = new co.edu.udea.arqsoft.services.Stockws_Service();
            co.edu.udea.arqsoft.services.Stockws port = service.getStockwsPort();
            java.lang.String codigo = request.getParameter("codigo");
            Producto p = null;
            String nose = "que caja";
            // TODO initialize WS operation arguments here
            String action = request.getParameter("action");
            if (action.equalsIgnoreCase("Buscar Producto")) {
                System.out.print("@@@@ he entrado a un nuevo lugar");
                p = port.buscarProductoCompleto(codigo);
                java.lang.String result = port.buscarProducto(codigo);
                out.println("<font color='blue'>"
                        + "Resultado de la consulta " + result + "</font>");
            } else if (action.equalsIgnoreCase("Editar Producto")) {
                System.out.print("@@@@ he entrado a otro lugar");
                java.lang.String nombre = request.getParameter("nombre");
                if (nombre.isEmpty()) {
                        nombre = p.getNombre();
                }
                double precio = 0.0;
                try{
                    precio = Double.parseDouble(request.getParameter("precio"));
                }catch (Exception e){
                    precio = p.getPrecio();
                }
                int stock=-1; 
                try{
                    stock = Integer.parseInt(request.getParameter("stock"));
                }catch(Exception e){
                    stock = p.getStock();
                }
                java.lang.String descripcion = request.getParameter("descripcion");
                if (descripcion.isEmpty()) {
                        descripcion = p.getDescripcion();
                }
                java.lang.String result = port.editarProducto(codigo, nombre, precio, stock, descripcion);
                    out.println("<font color='blue'>"
                        + "Resultado de la consulta " + result + "</font>");
                // TODO process result here
                
            }

        } catch (Exception ex) {
            out.println("<font color='red'>" + "Error en la consulta." + "</font>");
        }
    
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    \n");
      out.write("     <form action = \"Editar.jsp\" method=\"POST\">\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <th>\n");
      out.write("                    Código:\n");
      out.write("                </th>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"text\" name=\"codigo\" required value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${nose}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <th>\n");
      out.write("                    Nombre:\n");
      out.write("                </th>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"text\" name=\"nombre\"/>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <th>\n");
      out.write("                    Precio:\n");
      out.write("                </th>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"text\" name=\"precio\"/>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <th>\n");
      out.write("                    Stock:\n");
      out.write("                </th>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"text\" name=\"stock\"/>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <th>\n");
      out.write("                    Descripcion:\n");
      out.write("                </th>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"text\" name=\"descripcion\"/>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <td colspan=\"2\">\n");
      out.write("                    <input type=\"submit\" name = \"action\" value=\"Editar Producto\"/>\n");
      out.write("                </td>\n");
      out.write("                <td colspan=\"2\">\n");
      out.write("                    <input type=\"submit\" name = \"action\" value=\"Buscar Producto\"/>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("    </form>\n");
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
