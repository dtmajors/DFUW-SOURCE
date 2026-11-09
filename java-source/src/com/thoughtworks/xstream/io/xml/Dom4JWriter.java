/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  org.dom4j.Branch
 *  org.dom4j.DocumentFactory
 *  org.dom4j.Element
 */
package com.thoughtworks.xstream.io.xml;

import com.thoughtworks.xstream.io.xml.AbstractDocumentWriter;
import com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer;
import org.dom4j.Branch;
import org.dom4j.DocumentFactory;
import org.dom4j.Element;

public class Dom4JWriter
extends AbstractDocumentWriter {
    private final DocumentFactory documentFactory;

    public Dom4JWriter(Branch root, DocumentFactory factory, XmlFriendlyReplacer replacer) {
        super(root, replacer);
        this.documentFactory = factory;
    }

    public Dom4JWriter(DocumentFactory factory, XmlFriendlyReplacer replacer) {
        this(null, factory, replacer);
    }

    public Dom4JWriter(DocumentFactory documentFactory) {
        this(documentFactory, new XmlFriendlyReplacer());
    }

    public Dom4JWriter(Branch root, XmlFriendlyReplacer replacer) {
        this(root, new DocumentFactory(), replacer);
    }

    public Dom4JWriter(Branch root) {
        this(root, new DocumentFactory(), new XmlFriendlyReplacer());
    }

    public Dom4JWriter() {
        this(new DocumentFactory(), new XmlFriendlyReplacer());
    }

    protected Object createNode(String name) {
        Element element = this.documentFactory.createElement(this.escapeXmlName(name));
        Branch top = this.top();
        if (top != null) {
            this.top().add(element);
        }
        return element;
    }

    public void setValue(String text) {
        this.top().setText(text);
    }

    public void addAttribute(String key, String value) {
        ((Element)this.top()).addAttribute(this.escapeXmlName(key), value);
    }

    private Branch top() {
        return (Branch)this.getCurrent();
    }
}

