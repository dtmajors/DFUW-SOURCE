/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  org.jdom.Attribute
 *  org.jdom.Document
 *  org.jdom.Element
 */
package com.thoughtworks.xstream.io.xml;

import com.thoughtworks.xstream.io.xml.AbstractDocumentReader;
import com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer;
import org.jdom.Attribute;
import org.jdom.Document;
import org.jdom.Element;

public class JDomReader
extends AbstractDocumentReader {
    private Element currentElement;

    public JDomReader(Element root) {
        super(root);
    }

    public JDomReader(Document document) {
        super(document.getRootElement());
    }

    public JDomReader(Element root, XmlFriendlyReplacer replacer) {
        super(root, replacer);
    }

    public JDomReader(Document document, XmlFriendlyReplacer replacer) {
        super(document.getRootElement(), replacer);
    }

    protected void reassignCurrentElement(Object current) {
        this.currentElement = (Element)current;
    }

    protected Object getParent() {
        return this.currentElement.getParentElement();
    }

    protected Object getChild(int index) {
        return this.currentElement.getChildren().get(index);
    }

    protected int getChildCount() {
        return this.currentElement.getChildren().size();
    }

    public String getNodeName() {
        return this.unescapeXmlName(this.currentElement.getName());
    }

    public String getValue() {
        return this.currentElement.getText();
    }

    public String getAttribute(String name) {
        return this.currentElement.getAttributeValue(name);
    }

    public String getAttribute(int index) {
        return ((Attribute)this.currentElement.getAttributes().get(index)).getValue();
    }

    public int getAttributeCount() {
        return this.currentElement.getAttributes().size();
    }

    public String getAttributeName(int index) {
        return this.unescapeXmlName(((Attribute)this.currentElement.getAttributes().get(index)).getQualifiedName());
    }
}

