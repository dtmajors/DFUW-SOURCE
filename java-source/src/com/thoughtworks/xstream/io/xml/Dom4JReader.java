/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  org.dom4j.Document
 *  org.dom4j.Element
 */
package com.thoughtworks.xstream.io.xml;

import com.thoughtworks.xstream.converters.ErrorWriter;
import com.thoughtworks.xstream.io.xml.AbstractDocumentReader;
import com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer;
import org.dom4j.Document;
import org.dom4j.Element;

public class Dom4JReader
extends AbstractDocumentReader {
    private Element currentElement;

    public Dom4JReader(Element rootElement) {
        this(rootElement, new XmlFriendlyReplacer());
    }

    public Dom4JReader(Document document) {
        this(document.getRootElement());
    }

    public Dom4JReader(Element rootElement, XmlFriendlyReplacer replacer) {
        super(rootElement, replacer);
    }

    public Dom4JReader(Document document, XmlFriendlyReplacer replacer) {
        this(document.getRootElement(), replacer);
    }

    public String getNodeName() {
        return this.unescapeXmlName(this.currentElement.getName());
    }

    public String getValue() {
        return this.currentElement.getText();
    }

    public String getAttribute(String name) {
        return this.currentElement.attributeValue(name);
    }

    public String getAttribute(int index) {
        return this.currentElement.attribute(index).getValue();
    }

    public int getAttributeCount() {
        return this.currentElement.attributeCount();
    }

    public String getAttributeName(int index) {
        return this.unescapeXmlName(this.currentElement.attribute(index).getQualifiedName());
    }

    protected Object getParent() {
        return this.currentElement.getParent();
    }

    protected Object getChild(int index) {
        return this.currentElement.elements().get(index);
    }

    protected int getChildCount() {
        return this.currentElement.elements().size();
    }

    protected void reassignCurrentElement(Object current) {
        this.currentElement = (Element)current;
    }

    public void appendErrors(ErrorWriter errorWriter) {
        errorWriter.add("xpath", this.currentElement.getPath());
    }
}

