/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  nu.xom.Attribute
 *  nu.xom.Element
 *  nu.xom.Node
 */
package com.thoughtworks.xstream.io.xml;

import com.thoughtworks.xstream.io.xml.AbstractDocumentWriter;
import com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer;
import nu.xom.Attribute;
import nu.xom.Element;
import nu.xom.Node;

public class XomWriter
extends AbstractDocumentWriter {
    public XomWriter() {
        this((Element)null);
    }

    public XomWriter(Element parentElement) {
        this(parentElement, new XmlFriendlyReplacer());
    }

    public XomWriter(Element parentElement, XmlFriendlyReplacer replacer) {
        super(parentElement, replacer);
    }

    protected Object createNode(String name) {
        Element newNode = new Element(this.escapeXmlName(name));
        Element top = this.top();
        if (top != null) {
            this.top().appendChild((Node)newNode);
        }
        return newNode;
    }

    public void addAttribute(String name, String value) {
        this.top().addAttribute(new Attribute(this.escapeXmlName(name), value));
    }

    public void setValue(String text) {
        this.top().appendChild(text);
    }

    private Element top() {
        return (Element)this.getCurrent();
    }
}

