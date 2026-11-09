/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  org.jdom.Content
 *  org.jdom.DefaultJDOMFactory
 *  org.jdom.Element
 *  org.jdom.JDOMFactory
 */
package com.thoughtworks.xstream.io.xml;

import com.thoughtworks.xstream.io.xml.AbstractDocumentWriter;
import com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer;
import java.util.List;
import org.jdom.Content;
import org.jdom.DefaultJDOMFactory;
import org.jdom.Element;
import org.jdom.JDOMFactory;

public class JDomWriter
extends AbstractDocumentWriter {
    private final JDOMFactory documentFactory;

    public JDomWriter(Element container, JDOMFactory factory, XmlFriendlyReplacer replacer) {
        super(container, replacer);
        this.documentFactory = factory;
    }

    public JDomWriter(Element container, JDOMFactory factory) {
        this(container, factory, new XmlFriendlyReplacer());
    }

    public JDomWriter(JDOMFactory factory, XmlFriendlyReplacer replacer) {
        this(null, factory, replacer);
    }

    public JDomWriter(JDOMFactory factory) {
        this(null, factory);
    }

    public JDomWriter(Element container, XmlFriendlyReplacer replacer) {
        this(container, (JDOMFactory)new DefaultJDOMFactory(), replacer);
    }

    public JDomWriter(Element container) {
        this(container, (JDOMFactory)new DefaultJDOMFactory());
    }

    public JDomWriter() {
        this((JDOMFactory)new DefaultJDOMFactory());
    }

    protected Object createNode(String name) {
        Element element = this.documentFactory.element(this.escapeXmlName(name));
        Element parent = this.top();
        if (parent != null) {
            parent.addContent((Content)element);
        }
        return element;
    }

    public void setValue(String text) {
        this.top().addContent((Content)this.documentFactory.text(text));
    }

    public void addAttribute(String key, String value) {
        this.top().setAttribute(this.documentFactory.attribute(this.escapeXmlName(key), value));
    }

    private Element top() {
        return (Element)this.getCurrent();
    }

    public List getResult() {
        return this.getTopLevelNodes();
    }
}

