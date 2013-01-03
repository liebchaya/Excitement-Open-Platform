//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.03.28 at 10:33:28 AM GMT+02:00 
//


package ac.biu.nlp.nlp.datasets.trec.jaxb_generated.fr94;

import java.util.List;
import java.util.Vector;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import ac.biu.nlp.nlp.datasets.trec.Doc;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}DOCNO"/>
 *         &lt;element ref="{}PARENT"/>
 *         &lt;element ref="{}TEXT"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "docno",
    "parent",
    "text"
})
@XmlRootElement(name = "DOC")
public class DOC implements Doc {

    @XmlElement(name = "DOCNO", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String docno;
    @XmlElement(name = "PARENT", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String parent;
    @XmlElement(name = "TEXT", required = true)
    protected TEXT text;

    /**
     * Gets the value of the docno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOCNO() {
        return docno;
    }

    /**
     * Sets the value of the docno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOCNO(String value) {
        this.docno = value;
    }

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARENT() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARENT(String value) {
        this.parent = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link TEXT }
     *     
     */
    public TEXT getTEXT() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link TEXT }
     *     
     */
    public void setTEXT(TEXT value) {
        this.text = value;
    }

	/* (non-Javadoc)
	 * @see org.BIU.NLP.corpora.trec_new.Doc#getTexts()
	 */
	public List<String> getTexts() {
		StringBuilder buf = new StringBuilder();
		TEXT textObj = this.getTEXT();
		
		for (Object obj: textObj.getContent())
		{
			buf.append(obj);
			if (obj.toString().length() > 300)
				obj = null;
//			QName qName = obj.getName();
//			if (qName.toString().equals(TEXT))
//					buf.append(obj.getValue());
		}

		List<String> texts = new Vector<String>();
		texts.add(buf.toString());
		return texts;

	}

}
