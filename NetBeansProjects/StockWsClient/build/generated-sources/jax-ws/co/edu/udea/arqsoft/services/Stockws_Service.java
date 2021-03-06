
package co.edu.udea.arqsoft.services;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Stockws", targetNamespace = "http://soap/", wsdlLocation = "http://localhost:8080/Stockws/Stockws?wsdl")
public class Stockws_Service
    extends Service
{

    private final static URL STOCKWS_WSDL_LOCATION;
    private final static WebServiceException STOCKWS_EXCEPTION;
    private final static QName STOCKWS_QNAME = new QName("http://soap/", "Stockws");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Stockws/Stockws?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        STOCKWS_WSDL_LOCATION = url;
        STOCKWS_EXCEPTION = e;
    }

    public Stockws_Service() {
        super(__getWsdlLocation(), STOCKWS_QNAME);
    }

    public Stockws_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), STOCKWS_QNAME, features);
    }

    public Stockws_Service(URL wsdlLocation) {
        super(wsdlLocation, STOCKWS_QNAME);
    }

    public Stockws_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, STOCKWS_QNAME, features);
    }

    public Stockws_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Stockws_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Stockws
     */
    @WebEndpoint(name = "StockwsPort")
    public Stockws getStockwsPort() {
        return super.getPort(new QName("http://soap/", "StockwsPort"), Stockws.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Stockws
     */
    @WebEndpoint(name = "StockwsPort")
    public Stockws getStockwsPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://soap/", "StockwsPort"), Stockws.class, features);
    }

    private static URL __getWsdlLocation() {
        if (STOCKWS_EXCEPTION!= null) {
            throw STOCKWS_EXCEPTION;
        }
        return STOCKWS_WSDL_LOCATION;
    }

}
