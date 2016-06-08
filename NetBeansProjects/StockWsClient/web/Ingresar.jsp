<%-- 
    Document   : Ingresar
    Created on : 1/06/2016, 11:42:59 AM
    Author     : maria.gomez26
--%>

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
    <%-- start web service invocation --%><hr/>
    <%
    try {
	co.edu.udea.arqsoft.services.Stockws_Service service = new co.edu.udea.arqsoft.services.Stockws_Service();
	co.edu.udea.arqsoft.services.Stockws port = service.getStockwsPort();
	 // TODO initialize WS operation arguments here
	java.lang.String codigo =  request.getParameter("codigo");
	java.lang.String nombre = request.getParameter("nombre");
	double precio =  Double.parseDouble(request.getParameter("precio"));
	int stock = Integer.parseInt(request.getParameter("stock"));
	java.lang.String descripcion =  request.getParameter("descripcion");
	// TODO process result here
	java.lang.String result = port.ingresarProducto(codigo, nombre, precio, stock, descripcion);
	out.println("<font color='blue'>"+
                "Resultado de la consulta "+ result +"</font>");
    } catch (Exception ex) {
	out.println("<font color='red'>"+"Error en la consulta."+"</font>");
    }
    %>
    <%-- end web service invocation --%><hr/>

    
     <form action = "Ingresar.jsp" method="post">
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
                    <input type="text" name="nombre" required/>
                </td>
            </tr>
            <tr>
                <th>
                    Precio:
                </th>
                <td>
                    <input type="text" name="precio" required/>
                </td>
            </tr>
            <tr>
                <th>
                    Stock:
                </th>
                <td>
                    <input type="text" name="stock" required/>
                </td>
            </tr>
            <tr>
                <th>
                    Descripcion:
                </th>
                <td>
                    <input type="text" name="descripcion" required/>
                </td>
            </tr>
            
            <tr>
                <td colspan="2">
                    <input type="submit" value="IngresarProducto"/>
                </td>
            </tr>
        </table>
    </form>
    </body>
</html>
