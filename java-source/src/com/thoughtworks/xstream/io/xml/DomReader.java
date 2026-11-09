/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.io.xml;

import com.thoughtworks.xstream.io.xml.AbstractDocumentReader;
import com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer;
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

public class DomReader
extends AbstractDocumentReader {
    private Element currentElement;
    private StringBuffer textBuffer = new StringBuffer();
    private List childElements;

    public DomReader(Element rootElement) {
        this(rootElement, new XmlFriendlyReplacer());
    }

    public DomReader(Document document) {
        this(document.getDocumentElement());
    }

    public DomReader(Element rootElement, XmlFriendlyReplacer replacer) {
        super(rootElement, replacer);
    }

    public DomReader(Document document, XmlFriendlyReplacer replacer) {
        this(document.getDocumentElement(), replacer);
    }

    public String getNodeName() {
        return this.unescapeXmlName(this.currentElement.getTagName());
    }

    public String getValue() {
        NodeList childNodes = this.currentElement.getChildNodes();
        this.textBuffer.setLength(0);
        int length = childNodes.getLength();
        for (int i = 0; i < length; ++i) {
            Node childNode = childNodes.item(i);
            if (!(childNode instanceof Text)) continue;
            Text text = (Text)childNode;
            this.textBuffer.append(text.getData());
        }
        return this.textBuffer.toString();
    }

    public String getAttribute(String name) {
        Attr attribute = this.currentElement.getAttributeNode(name);
        return attribute == null ? null : attribute.getValue();
    }

    public String getAttribute(int index) {
        return ((Attr)this.currentElement.getAttributes().item(index)).getValue();
    }

    public int getAttributeCount() {
        return this.currentElement.getAttributes().getLength();
    }

    public String getAttributeName(int index) {
        return this.unescapeXmlName(((Attr)this.currentElement.getAttributes().item(index)).getName());
    }

    protected Object getParent() {
        return this.currentElement.getParentNode();
    }

    protected Object getChild(int index) {
        return this.childElements.get(index);
    }

    protected int getChildCount() {
        return this.childElements.size();
    }

    protected void reassignCurrentElement(Object current) {
        this.currentElement = (Element)current;
        NodeList childNodes = this.currentElement.getChildNodes();
        this.childElements = new ArrayList();
        for (int i = 0; i < childNodes.getLength(); ++i) {
            Node node = childNodes.item(i);
            if (!(node instanceof Element)) continue;
            this.childElements.add(node);
        }
    }
}

