/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.io.xml;

import com.thoughtworks.xstream.io.xml.AbstractDocumentReader;
import com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer;
import com.thoughtworks.xstream.io.xml.xppdom.Xpp3Dom;

public class XppDomReader
extends AbstractDocumentReader {
    private Xpp3Dom currentElement;

    public XppDomReader(Xpp3Dom xpp3Dom) {
        super(xpp3Dom);
    }

    public XppDomReader(Xpp3Dom xpp3Dom, XmlFriendlyReplacer replacer) {
        super(xpp3Dom, replacer);
    }

    public String getNodeName() {
        return this.unescapeXmlName(this.currentElement.getName());
    }

    public String getValue() {
        String text = null;
        try {
            text = this.currentElement.getValue();
        }
        catch (Exception exception) {
            // empty catch block
        }
        return text == null ? "" : text;
    }

    public String getAttribute(String attributeName) {
        return this.currentElement.getAttribute(attributeName);
    }

    public String getAttribute(int index) {
        return this.currentElement.getAttribute(this.currentElement.getAttributeNames()[index]);
    }

    public int getAttributeCount() {
        return this.currentElement.getAttributeNames().length;
    }

    public String getAttributeName(int index) {
        return this.unescapeXmlName(this.currentElement.getAttributeNames()[index]);
    }

    protected Object getParent() {
        return this.currentElement.getParent();
    }

    protected Object getChild(int index) {
        return this.currentElement.getChild(index);
    }

    protected int getChildCount() {
        return this.currentElement.getChildCount();
    }

    protected void reassignCurrentElement(Object current) {
        this.currentElement = (Xpp3Dom)current;
    }
}

