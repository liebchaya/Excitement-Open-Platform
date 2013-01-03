//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.03.27 at 11:49:39 PM EEST 
//


package ac.biu.nlp.nlp.datasets.trec.jaxb_generated.ft;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.BIU.NLP.corpora.trec_new.ft package. 
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

    private final static QName _DATELINE_QNAME = new QName("", "DATELINE");
    private final static QName _PUB_QNAME = new QName("", "PUB");
    private final static QName _BYLINE_QNAME = new QName("", "BYLINE");
    private final static QName _DOCNO_QNAME = new QName("", "DOCNO");
    private final static QName _PROFILE_QNAME = new QName("", "PROFILE");
    private final static QName _PAGE_QNAME = new QName("", "PAGE");
    private final static QName _DATE_QNAME = new QName("", "DATE");
    private final static QName _TEXT_QNAME = new QName("", "TEXT");
    private final static QName _HEADLINE_QNAME = new QName("", "HEADLINE");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.BIU.NLP.corpora.trec_new.ft
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FTFILE }
     * 
     */
    public FTFILE createFTFILE() {
        return new FTFILE();
    }

    /**
     * Create an instance of {@link DOC }
     * 
     */
    public DOC createDOC() {
        return new DOC();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DATELINE")
    public JAXBElement<String> createDATELINE(String value) {
        return new JAXBElement<String>(_DATELINE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PUB")
    public JAXBElement<String> createPUB(String value) {
        return new JAXBElement<String>(_PUB_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BYLINE")
    public JAXBElement<String> createBYLINE(String value) {
        return new JAXBElement<String>(_BYLINE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DOCNO")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDOCNO(String value) {
        return new JAXBElement<String>(_DOCNO_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PROFILE")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPROFILE(String value) {
        return new JAXBElement<String>(_PROFILE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PAGE")
    public JAXBElement<String> createPAGE(String value) {
        return new JAXBElement<String>(_PAGE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DATE")
    public JAXBElement<BigInteger> createDATE(BigInteger value) {
        return new JAXBElement<BigInteger>(_DATE_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TEXT")
    public JAXBElement<String> createTEXT(String value) {
        return new JAXBElement<String>(_TEXT_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HEADLINE")
    public JAXBElement<String> createHEADLINE(String value) {
        return new JAXBElement<String>(_HEADLINE_QNAME, String.class, null, value);
    }

}
