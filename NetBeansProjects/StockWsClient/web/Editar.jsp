<%-- 
    Document   : Editar
    Created on : 8/06/2016, 09:41:32 AM
    Author     : santiago.romero
--%>

<%@page import="co.edu.udea.arqsoft.services.Producto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        
            <%-- start web service invocation --%><hr/>
    <%
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
    %>
    <%-- end web service invocation --%><hr/>

        
        
    
     <form action = "Editar.jsp" method="POST">
        <table>
            <tr>
                <th>
                    Código:
                </th>
                <td>
                    <input type="text" name="codigo" required/>
                </td>
            </tr>
            <tr>
                <th>
                    Nombre:
                </th>
                <td>
                    <input type="text" name="nombre"/>
                </td>
            </tr>
            <tr>
                <th>
                    Precio:
                </th>
                <td>
                    <input type="text" name="precio"/>
                </td>
            </tr>
            <tr>
                <th>
                    Stock:
                </th>
                <td>
                    <input type="text" name="stock"/>
                </td>
            </tr>
            <tr>
                <th>
                    Descripcion:
                </th>
                <td>
                    <input type="text" name="descripcion"/>
                </td>
            </tr>
            
            <tr>
                <td colspan="2">
                    <input type="submit" name = "action" value="Editar Producto"/>
                </td>
                <td colspan="2">
                    <input type="submit" name = "action" value="Buscar Producto"/>
                </td>
            </tr>
        </table>
    </form>
    </body>
</html>
