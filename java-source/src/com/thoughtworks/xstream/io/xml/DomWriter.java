/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.io.xml;

import com.thoughtworks.xstream.io.xml.AbstractDocumentWriter;
import com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class DomWriter
extends AbstractDocumentWriter {
    private final Document document;
    private boolean hasRootElement;

    public DomWriter(Document document) {
        this(document, new XmlFriendlyReplacer());
    }

    public DomWriter(Element rootElement) {
        this(rootElement, new XmlFriendlyReplacer());
    }

    public DomWriter(Document document, XmlFriendlyReplacer replacer) {
        this(document.getDocumentElement(), document, replacer);
    }

    public DomWriter(Element element, Document document, XmlFriendlyReplacer replacer) {
        super(element, replacer);
        this.document = document;
        this.hasRootElement = document.getDocumentElement() != null;
    }

    public DomWriter(Element rootElement, XmlFriendlyReplacer replacer) {
        this(rootElement.getOwnerDocument(), replacer);
    }

    protected Object createNode(String name) {
        Element child = this.document.createElement(this.escapeXmlName(name));
        Element top = this.top();
        if (top != null) {
            this.top().appendChild(child);
        } else if (!this.hasRootElement) {
            this.document.appendChild(child);
            this.hasRootElement = true;
        }
        return child;
    }

    public void addAttribute(String name, String value) {
        this.top().setAttribute(this.escapeXmlName(name), value);
    }

    public void setValue(String text) {
        this.top().appendChild(this.document.createTextNode(text));
    }

    private Element top() {
        return (Element)this.getCurrent();
    }
}

