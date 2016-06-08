<%-- 
    Document   : Consulta
    Created on : 1/06/2016, 11:26:43 AM
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
    <%-- start web service invocation --%><hr/>
    <%
    try {
	co.edu.udea.arqsoft.services.Stockws_Service service = new co.edu.udea.arqsoft.services.Stockws_Service();
	co.edu.udea.arqsoft.services.Stockws port = service.getStockwsPort();
	 // TODO initialize WS operation arguments here
	java.lang.String codigo = request.getParameter("codigo");
	// TODO process result here
	java.lang.String result = port.buscarProducto(codigo);
	out.println("<font color='blue'>"+
                "Resultado de la consulta "+ result +"</font>");
    } catch (Exception ex) {
	out.println("<font color='red'>"+"Error en la consulta."+"</font>");
    }
    %>
    <%-- end web service invocation --%><hr/>

    <h1>
        Buscar Producto
    </h1>
    
    <form action = "Consulta.jsp" method="POST">
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
                <td colspan="2">
                    <input type="submit" value="Buscar"/>
                </td>
            </tr>
        </table>
    </form>
    
       
    </body>
</html>
