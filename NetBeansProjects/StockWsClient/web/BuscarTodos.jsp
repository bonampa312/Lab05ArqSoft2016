<%-- 
    Document   : BuscarTodos
    Created on : 1/06/2016, 11:44:09 AM
    Author     : maria.gomez26
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
         <ul class="nav nav-tabs">
            <li><a href="index.html">Inicio</a></li>
            <li><a href="BuscarTodos.jsp">Buscar todos</a></li>
            <li><a href="Consultar.jsp">Consultar</a></li>
            <li><a href="Editar.jsp">Editar</a></li>
            <li><a href="Eliminar.jsp">Eliminar</a></li>
            <li><a href="Ingresar.jsp">Ingresar</a></li>
        </ul>
    <%
    try {
	co.edu.udea.arqsoft.services.Stockws_Service service = new co.edu.udea.arqsoft.services.Stockws_Service();
	co.edu.udea.arqsoft.services.Stockws port = service.getStockwsPort();
	// TODO process result here
	java.util.List<co.edu.udea.arqsoft.services.Producto> result = port.consultarProductos();
        out.println("<ol>");
	for(Producto p: result){
            out.println("<li>");
            out.println("Codigo: "+p.getCodigo()+
                    " Nombre: "+p.getNombre() + 
                    " Precio: "+p.getPrecio()+
                    " Cantidad existente: "+p.getStock()+
                    " Descripcion: "+p.getDescripcion());
            out.println("</li>");
            out.print("<br>");
        }
        out.println("</ol>");
    } catch (Exception ex) {
	out.print("<font color='red'>"+"Error en la consulta."+"</font>");
    }
    %>
    <%-- end web service invocation --%><hr/>
    </body>
</html>
