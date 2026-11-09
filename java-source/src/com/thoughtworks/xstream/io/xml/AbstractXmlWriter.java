/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.io.xml;

import com.thoughtworks.xstream.io.ExtendedHierarchicalStreamWriter;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer;

public abstract class AbstractXmlWriter
implements ExtendedHierarchicalStreamWriter {
    private XmlFriendlyReplacer replacer;

    protected AbstractXmlWriter() {
        this(new XmlFriendlyReplacer());
    }

    protected AbstractXmlWriter(XmlFriendlyReplacer replacer) {
        this.replacer = replacer;
    }

    public void startNode(String name, Class clazz) {
        this.startNode(name);
    }

    protected String escapeXmlName(String name) {
        return this.replacer.escapeName(name);
    }

    public HierarchicalStreamWriter underlyingWriter() {
        return this;
    }
}

