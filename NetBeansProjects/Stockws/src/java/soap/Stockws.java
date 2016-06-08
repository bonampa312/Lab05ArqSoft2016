/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soap;

import dao.ProductoDAO;
import dto.Producto;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
//NOTA: recordar añadir la libreria mysql
@WebService(serviceName = "Stockws")
public class Stockws {

    
    /**
     * Web service operation
     * @param codigo
     * @param nombre
     * @param precio
     * @param token
     * @param descripcion
     * @return "Producto ingresado"
     */
    //Se va a ir o reacionar immediatamente, con la exposicion de ese metodo en descriptor
    @WebMethod(operationName = "ingresarProducto")
    //Webparam va al descriptor que esta en 
    public String ingresarProducto(@WebParam(name = "codigo") String codigo, @WebParam(name = "nombre") String nombre, @WebParam(name = "precio") double precio, @WebParam(name = "stock") int stock, @WebParam(name = "descripcion") String descripcion) {
        //TODO write your implementation code here:
        Producto p = new Producto(codigo,nombre,precio,stock,descripcion);
        ProductoDAO productoDAO = new ProductoDAO();
        productoDAO.ingresarProducto(p);
        return "Producto ingresado";
    }

    /**
     * Web service operation
     * @param codigo
     * @return el producto con el codigo respectivo
     */
    @WebMethod(operationName = "buscarProducto")
    public String buscarProducto(@WebParam(name = "codigo") String codigo) {
        ProductoDAO productoDAO = new ProductoDAO();
        return productoDAO.consultarProducto(codigo);
    }

    /**
     * 
     * @param codigo
     * @return 
     */
    @WebMethod(operationName = "buscarProductoCompleto")
    public Producto buscarProductoCompleto(@WebParam(name = "codigo") String codigo) {
        ProductoDAO productoDAO = new ProductoDAO();
        return productoDAO.consultarProductoCompleto(codigo);
    }
    /**
     * Web service operation
     * @return La lista de los productos en la BD
     */
    @WebMethod(operationName = "consultarProductos")
    public List<Producto> consultarProductos() {
        ProductoDAO productoDAO = new ProductoDAO();
        return productoDAO.verProductos();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "editarProducto")
    public String editarProducto(
            @WebParam(name = "codigo") String codigo, 
            @WebParam(name = "nombre") String nombre, 
            @WebParam(name = "precio") double precio, 
            @WebParam(name = "stock") int stock, 
            @WebParam(name = "descripcion") String descripcion) {
        ProductoDAO productoDAO = new ProductoDAO();
        Producto p = new Producto(codigo, nombre, precio, stock, descripcion);
        productoDAO.editarProducto(p);
        return "Se ha editado correctamente el producto con el codigo "+p.getCodigo();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "eliminarProducto")
    public String eliminarProducto(@WebParam(name = "codigo") String codigo) {
        ProductoDAO productoDAO = new ProductoDAO();
        productoDAO.eliminarProducto(codigo);
        return "Se ha eliminado el producto correctamente";
    }
}
