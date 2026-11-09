/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.io.xml;

import com.thoughtworks.xstream.converters.ErrorWriter;
import com.thoughtworks.xstream.io.StreamException;
import com.thoughtworks.xstream.io.xml.AbstractPullReader;
import com.thoughtworks.xstream.io.xml.QNameMap;
import com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

public class StaxReader
extends AbstractPullReader {
    private final QNameMap qnameMap;
    private final XMLStreamReader in;

    public StaxReader(QNameMap qnameMap, XMLStreamReader in) {
        this(qnameMap, in, new XmlFriendlyReplacer());
    }

    public StaxReader(QNameMap qnameMap, XMLStreamReader in, XmlFriendlyReplacer replacer) {
        super(replacer);
        this.qnameMap = qnameMap;
        this.in = in;
        this.moveDown();
    }

    protected int pullNextEvent() {
        try {
            switch (this.in.next()) {
                case 1: 
                case 7: {
                    return 1;
                }
                case 2: 
                case 8: {
                    return 2;
                }
                case 4: {
                    return 3;
                }
                case 5: {
                    return 4;
                }
            }
            return 0;
        }
        catch (XMLStreamException e2) {
            throw new StreamException(e2);
        }
    }

    protected String pullElementName() {
        QName qname = this.in.getName();
        return this.qnameMap.getJavaClassName(qname);
    }

    protected String pullText() {
        return this.in.getText();
    }

    public String getAttribute(String name) {
        return this.in.getAttributeValue(null, name);
    }

    public String getAttribute(int index) {
        return this.in.getAttributeValue(index);
    }

    public int getAttributeCount() {
        return this.in.getAttributeCount();
    }

    public String getAttributeName(int index) {
        return this.unescapeXmlName(this.in.getAttributeLocalName(index));
    }

    public void appendErrors(ErrorWriter errorWriter) {
        errorWriter.add("line number", String.valueOf(this.in.getLocation().getLineNumber()));
    }

    public void close() {
        try {
            this.in.close();
        }
        catch (XMLStreamException e2) {
            throw new StreamException(e2);
        }
    }
}

