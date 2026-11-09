/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.io.xml;

import com.thoughtworks.xstream.io.HierarchicalStreamDriver;
import com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer;

public abstract class AbstractXmlDriver
implements HierarchicalStreamDriver {
    private XmlFriendlyReplacer replacer;

    public AbstractXmlDriver() {
        this(new XmlFriendlyReplacer());
    }

    public AbstractXmlDriver(XmlFriendlyReplacer replacer) {
        this.replacer = replacer;
    }

    protected XmlFriendlyReplacer xmlFriendlyReplacer() {
        return this.replacer;
    }
}

