
package co.edu.udea.arqsoft.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.edu.udea.arqsoft.services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EditarProducto_QNAME = new QName("http://soap/", "editarProducto");
    private final static QName _ConsultarProductosResponse_QNAME = new QName("http://soap/", "consultarProductosResponse");
    private final static QName _ConsultarProductos_QNAME = new QName("http://soap/", "consultarProductos");
    private final static QName _IngresarProducto_QNAME = new QName("http://soap/", "ingresarProducto");
    private final static QName _IngresarProductoResponse_QNAME = new QName("http://soap/", "ingresarProductoResponse");
    private final static QName _BuscarProducto_QNAME = new QName("http://soap/", "buscarProducto");
    private final static QName _BuscarProductoCompletoResponse_QNAME = new QName("http://soap/", "buscarProductoCompletoResponse");
    private final static QName _BuscarProductoCompleto_QNAME = new QName("http://soap/", "buscarProductoCompleto");
    private final static QName _BuscarProductoResponse_QNAME = new QName("http://soap/", "buscarProductoResponse");
    private final static QName _EliminarProducto_QNAME = new QName("http://soap/", "eliminarProducto");
    private final static QName _EliminarProductoResponse_QNAME = new QName("http://soap/", "eliminarProductoResponse");
    private final static QName _EditarProductoResponse_QNAME = new QName("http://soap/", "editarProductoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.edu.udea.arqsoft.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EditarProductoResponse }
     * 
     */
    public EditarProductoResponse createEditarProductoResponse() {
        return new EditarProductoResponse();
    }

    /**
     * Create an instance of {@link EliminarProducto }
     * 
     */
    public EliminarProducto createEliminarProducto() {
        return new EliminarProducto();
    }

    /**
     * Create an instance of {@link EliminarProductoResponse }
     * 
     */
    public EliminarProductoResponse createEliminarProductoResponse() {
        return new EliminarProductoResponse();
    }

    /**
     * Create an instance of {@link BuscarProductoCompleto }
     * 
     */
    public BuscarProductoCompleto createBuscarProductoCompleto() {
        return new BuscarProductoCompleto();
    }

    /**
     * Create an instance of {@link BuscarProductoResponse }
     * 
     */
    public BuscarProductoResponse createBuscarProductoResponse() {
        return new BuscarProductoResponse();
    }

    /**
     * Create an instance of {@link IngresarProductoResponse }
     * 
     */
    public IngresarProductoResponse createIngresarProductoResponse() {
        return new IngresarProductoResponse();
    }

    /**
     * Create an instance of {@link ConsultarProductos }
     * 
     */
    public ConsultarProductos createConsultarProductos() {
        return new ConsultarProductos();
    }

    /**
     * Create an instance of {@link IngresarProducto }
     * 
     */
    public IngresarProducto createIngresarProducto() {
        return new IngresarProducto();
    }

    /**
     * Create an instance of {@link ConsultarProductosResponse }
     * 
     */
    public ConsultarProductosResponse createConsultarProductosResponse() {
        return new ConsultarProductosResponse();
    }

    /**
     * Create an instance of {@link EditarProducto }
     * 
     */
    public EditarProducto createEditarProducto() {
        return new EditarProducto();
    }

    /**
     * Create an instance of {@link BuscarProductoCompletoResponse }
     * 
     */
    public BuscarProductoCompletoResponse createBuscarProductoCompletoResponse() {
        return new BuscarProductoCompletoResponse();
    }

    /**
     * Create an instance of {@link BuscarProducto }
     * 
     */
    public BuscarProducto createBuscarProducto() {
        return new BuscarProducto();
    }

    /**
     * Create an instance of {@link Producto }
     * 
     */
    public Producto createProducto() {
        return new Producto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditarProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "editarProducto")
    public JAXBElement<EditarProducto> createEditarProducto(EditarProducto value) {
        return new JAXBElement<EditarProducto>(_EditarProducto_QNAME, EditarProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarProductosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "consultarProductosResponse")
    public JAXBElement<ConsultarProductosResponse> createConsultarProductosResponse(ConsultarProductosResponse value) {
        return new JAXBElement<ConsultarProductosResponse>(_ConsultarProductosResponse_QNAME, ConsultarProductosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarProductos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "consultarProductos")
    public JAXBElement<ConsultarProductos> createConsultarProductos(ConsultarProductos value) {
        return new JAXBElement<ConsultarProductos>(_ConsultarProductos_QNAME, ConsultarProductos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IngresarProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "ingresarProducto")
    public JAXBElement<IngresarProducto> createIngresarProducto(IngresarProducto value) {
        return new JAXBElement<IngresarProducto>(_IngresarProducto_QNAME, IngresarProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IngresarProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "ingresarProductoResponse")
    public JAXBElement<IngresarProductoResponse> createIngresarProductoResponse(IngresarProductoResponse value) {
        return new JAXBElement<IngresarProductoResponse>(_IngresarProductoResponse_QNAME, IngresarProductoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "buscarProducto")
    public JAXBElement<BuscarProducto> createBuscarProducto(BuscarProducto value) {
        return new JAXBElement<BuscarProducto>(_BuscarProducto_QNAME, BuscarProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarProductoCompletoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "buscarProductoCompletoResponse")
    public JAXBElement<BuscarProductoCompletoResponse> createBuscarProductoCompletoResponse(BuscarProductoCompletoResponse value) {
        return new JAXBElement<BuscarProductoCompletoResponse>(_BuscarProductoCompletoResponse_QNAME, BuscarProductoCompletoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarProductoCompleto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "buscarProductoCompleto")
    public JAXBElement<BuscarProductoCompleto> createBuscarProductoCompleto(BuscarProductoCompleto value) {
        return new JAXBElement<BuscarProductoCompleto>(_BuscarProductoCompleto_QNAME, BuscarProductoCompleto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "buscarProductoResponse")
    public JAXBElement<BuscarProductoResponse> createBuscarProductoResponse(BuscarProductoResponse value) {
        return new JAXBElement<BuscarProductoResponse>(_BuscarProductoResponse_QNAME, BuscarProductoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "eliminarProducto")
    public JAXBElement<EliminarProducto> createEliminarProducto(EliminarProducto value) {
        return new JAXBElement<EliminarProducto>(_EliminarProducto_QNAME, EliminarProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "eliminarProductoResponse")
    public JAXBElement<EliminarProductoResponse> createEliminarProductoResponse(EliminarProductoResponse value) {
        return new JAXBElement<EliminarProductoResponse>(_EliminarProductoResponse_QNAME, EliminarProductoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditarProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "editarProductoResponse")
    public JAXBElement<EditarProductoResponse> createEditarProductoResponse(EditarProductoResponse value) {
        return new JAXBElement<EditarProductoResponse>(_EditarProductoResponse_QNAME, EditarProductoResponse.class, null, value);
    }

}
