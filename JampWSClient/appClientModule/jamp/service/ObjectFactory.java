
package jamp.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the jamp.service package. 
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

    private final static QName _ReserveTicketResponse_QNAME = new QName("http://service.jamp/", "reserveTicketResponse");
    private final static QName _ReserveTicket_QNAME = new QName("http://service.jamp/", "reserveTicket");
    private final static QName _GetTicketInfoResponse_QNAME = new QName("http://service.jamp/", "getTicketInfoResponse");
    private final static QName _PayForTicket_QNAME = new QName("http://service.jamp/", "payForTicket");
    private final static QName _PayForTicketResponse_QNAME = new QName("http://service.jamp/", "payForTicketResponse");
    private final static QName _GetTicketInfo_QNAME = new QName("http://service.jamp/", "getTicketInfo");
    private final static QName _ReturnTicket_QNAME = new QName("http://service.jamp/", "returnTicket");
    private final static QName _ReturnTicketResponse_QNAME = new QName("http://service.jamp/", "returnTicketResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: jamp.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReserveTicketResponse }
     * 
     */
    public ReserveTicketResponse createReserveTicketResponse() {
        return new ReserveTicketResponse();
    }

    /**
     * Create an instance of {@link ReserveTicket }
     * 
     */
    public ReserveTicket createReserveTicket() {
        return new ReserveTicket();
    }

    /**
     * Create an instance of {@link PayForTicket }
     * 
     */
    public PayForTicket createPayForTicket() {
        return new PayForTicket();
    }

    /**
     * Create an instance of {@link GetTicketInfoResponse }
     * 
     */
    public GetTicketInfoResponse createGetTicketInfoResponse() {
        return new GetTicketInfoResponse();
    }

    /**
     * Create an instance of {@link PayForTicketResponse }
     * 
     */
    public PayForTicketResponse createPayForTicketResponse() {
        return new PayForTicketResponse();
    }

    /**
     * Create an instance of {@link GetTicketInfo }
     * 
     */
    public GetTicketInfo createGetTicketInfo() {
        return new GetTicketInfo();
    }

    /**
     * Create an instance of {@link ReturnTicketResponse }
     * 
     */
    public ReturnTicketResponse createReturnTicketResponse() {
        return new ReturnTicketResponse();
    }

    /**
     * Create an instance of {@link ReturnTicket }
     * 
     */
    public ReturnTicket createReturnTicket() {
        return new ReturnTicket();
    }

    /**
     * Create an instance of {@link TicketInfoRequest }
     * 
     */
    public TicketInfoRequest createTicketInfoRequest() {
        return new TicketInfoRequest();
    }

    /**
     * Create an instance of {@link TicketinfoResponse }
     * 
     */
    public TicketinfoResponse createTicketinfoResponse() {
        return new TicketinfoResponse();
    }

    /**
     * Create an instance of {@link TicketResponse }
     * 
     */
    public TicketResponse createTicketResponse() {
        return new TicketResponse();
    }

    /**
     * Create an instance of {@link PassangerInfo }
     * 
     */
    public PassangerInfo createPassangerInfo() {
        return new PassangerInfo();
    }

    /**
     * Create an instance of {@link ReserveRequest }
     * 
     */
    public ReserveRequest createReserveRequest() {
        return new ReserveRequest();
    }

    /**
     * Create an instance of {@link TicketInfo }
     * 
     */
    public TicketInfo createTicketInfo() {
        return new TicketInfo();
    }

    /**
     * Create an instance of {@link ReserveResponse }
     * 
     */
    public ReserveResponse createReserveResponse() {
        return new ReserveResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReserveTicketResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.jamp/", name = "reserveTicketResponse")
    public JAXBElement<ReserveTicketResponse> createReserveTicketResponse(ReserveTicketResponse value) {
        return new JAXBElement<ReserveTicketResponse>(_ReserveTicketResponse_QNAME, ReserveTicketResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReserveTicket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.jamp/", name = "reserveTicket")
    public JAXBElement<ReserveTicket> createReserveTicket(ReserveTicket value) {
        return new JAXBElement<ReserveTicket>(_ReserveTicket_QNAME, ReserveTicket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTicketInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.jamp/", name = "getTicketInfoResponse")
    public JAXBElement<GetTicketInfoResponse> createGetTicketInfoResponse(GetTicketInfoResponse value) {
        return new JAXBElement<GetTicketInfoResponse>(_GetTicketInfoResponse_QNAME, GetTicketInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayForTicket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.jamp/", name = "payForTicket")
    public JAXBElement<PayForTicket> createPayForTicket(PayForTicket value) {
        return new JAXBElement<PayForTicket>(_PayForTicket_QNAME, PayForTicket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayForTicketResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.jamp/", name = "payForTicketResponse")
    public JAXBElement<PayForTicketResponse> createPayForTicketResponse(PayForTicketResponse value) {
        return new JAXBElement<PayForTicketResponse>(_PayForTicketResponse_QNAME, PayForTicketResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTicketInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.jamp/", name = "getTicketInfo")
    public JAXBElement<GetTicketInfo> createGetTicketInfo(GetTicketInfo value) {
        return new JAXBElement<GetTicketInfo>(_GetTicketInfo_QNAME, GetTicketInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnTicket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.jamp/", name = "returnTicket")
    public JAXBElement<ReturnTicket> createReturnTicket(ReturnTicket value) {
        return new JAXBElement<ReturnTicket>(_ReturnTicket_QNAME, ReturnTicket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnTicketResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.jamp/", name = "returnTicketResponse")
    public JAXBElement<ReturnTicketResponse> createReturnTicketResponse(ReturnTicketResponse value) {
        return new JAXBElement<ReturnTicketResponse>(_ReturnTicketResponse_QNAME, ReturnTicketResponse.class, null, value);
    }

}
