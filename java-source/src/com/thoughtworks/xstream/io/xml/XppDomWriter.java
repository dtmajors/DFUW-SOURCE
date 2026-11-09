/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.io.xml;

import com.thoughtworks.xstream.io.xml.AbstractDocumentWriter;
import com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer;
import com.thoughtworks.xstream.io.xml.xppdom.Xpp3Dom;

public class XppDomWriter
extends AbstractDocumentWriter {
    public XppDomWriter() {
        this(null, new XmlFriendlyReplacer());
    }

    public XppDomWriter(Xpp3Dom parent) {
        this(parent, new XmlFriendlyReplacer());
    }

    public XppDomWriter(XmlFriendlyReplacer replacer) {
        this(null, replacer);
    }

    public XppDomWriter(Xpp3Dom parent, XmlFriendlyReplacer replacer) {
        super(parent, replacer);
    }

    public Xpp3Dom getConfiguration() {
        return (Xpp3Dom)this.getTopLevelNodes().get(0);
    }

    protected Object createNode(String name) {
        Xpp3Dom newNode = new Xpp3Dom(this.escapeXmlName(name));
        Xpp3Dom top = this.top();
        if (top != null) {
            this.top().addChild(newNode);
        }
        return newNode;
    }

    public void setValue(String text) {
        this.top().setValue(text);
    }

    public void addAttribute(String key, String value) {
        this.top().setAttribute(this.escapeXmlName(key), value);
    }

    private Xpp3Dom top() {
        return (Xpp3Dom)this.getCurrent();
    }
}

