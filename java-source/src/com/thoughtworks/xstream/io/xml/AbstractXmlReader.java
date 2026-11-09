/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.io.xml;

import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer;

public abstract class AbstractXmlReader
implements HierarchicalStreamReader {
    private XmlFriendlyReplacer replacer;

    protected AbstractXmlReader() {
        this(new XmlFriendlyReplacer());
    }

    protected AbstractXmlReader(XmlFriendlyReplacer replacer) {
        this.replacer = replacer;
    }

    protected String unescapeXmlName(String name) {
        return this.replacer.unescapeName(name);
    }
}

