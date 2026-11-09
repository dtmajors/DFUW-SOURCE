/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.io.xml;

import com.thoughtworks.xstream.io.StreamException;
import com.thoughtworks.xstream.io.xml.AbstractXmlWriter;
import com.thoughtworks.xstream.io.xml.QNameMap;
import com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

public class StaxWriter
extends AbstractXmlWriter {
    private final QNameMap qnameMap;
    private final XMLStreamWriter out;
    private final boolean writeEnclosingDocument;
    private boolean namespaceRepairingMode;
    private int tagDepth;

    public StaxWriter(QNameMap qnameMap, XMLStreamWriter out) throws XMLStreamException {
        this(qnameMap, out, true, true);
    }

    public StaxWriter(QNameMap qnameMap, XMLStreamWriter out, boolean writeEnclosingDocument, boolean namespaceRepairingMode) throws XMLStreamException {
        this(qnameMap, out, writeEnclosingDocument, namespaceRepairingMode, new XmlFriendlyReplacer());
    }

    public StaxWriter(QNameMap qnameMap, XMLStreamWriter out, boolean writeEnclosingDocument, boolean namespaceRepairingMode, XmlFriendlyReplacer replacer) throws XMLStreamException {
        super(replacer);
        this.qnameMap = qnameMap;
        this.out = out;
        this.writeEnclosingDocument = writeEnclosingDocument;
        this.namespaceRepairingMode = namespaceRepairingMode;
        if (writeEnclosingDocument) {
            out.writeStartDocument();
        }
    }

    public void flush() {
        try {
            this.out.close();
        }
        catch (XMLStreamException e2) {
            throw new StreamException(e2);
        }
    }

    public void close() {
        try {
            this.out.close();
        }
        catch (XMLStreamException e2) {
            throw new StreamException(e2);
        }
    }

    public void addAttribute(String name, String value) {
        try {
            this.out.writeAttribute(this.escapeXmlName(name), value);
        }
        catch (XMLStreamException e2) {
            throw new StreamException(e2);
        }
    }

    public void endNode() {
        try {
            --this.tagDepth;
            this.out.writeEndElement();
            if (this.tagDepth == 0 && this.writeEnclosingDocument) {
                this.out.writeEndDocument();
            }
        }
        catch (XMLStreamException e2) {
            throw new StreamException(e2);
        }
    }

    public void setValue(String text) {
        try {
            this.out.writeCharacters(text);
        }
        catch (XMLStreamException e2) {
            throw new StreamException(e2);
        }
    }

    public void startNode(String name) {
        try {
            QName qname = this.qnameMap.getQName(this.escapeXmlName(name));
            String prefix = qname.getPrefix();
            String uri = qname.getNamespaceURI();
            boolean hasPrefix = prefix != null && prefix.length() > 0;
            boolean hasURI = uri != null && uri.length() > 0;
            boolean writeNamespace = false;
            if (hasURI) {
                if (hasPrefix) {
                    String currentNamespace = this.out.getNamespaceContext().getNamespaceURI(prefix);
                    if (currentNamespace == null || !currentNamespace.equals(uri)) {
                        writeNamespace = true;
                    }
                } else {
                    String defaultNamespace = this.out.getNamespaceContext().getNamespaceURI("");
                    if (defaultNamespace == null || !defaultNamespace.equals(uri)) {
                        writeNamespace = true;
                    }
                }
            }
            if (hasPrefix) {
                this.out.setPrefix(prefix, uri);
            } else if (hasURI && writeNamespace) {
                this.out.setDefaultNamespace(uri);
            }
            this.out.writeStartElement(prefix, qname.getLocalPart(), uri);
            if (hasURI && writeNamespace && !this.isNamespaceRepairingMode()) {
                if (hasPrefix) {
                    this.out.writeNamespace(prefix, uri);
                } else {
                    this.out.writeDefaultNamespace(uri);
                }
            }
            ++this.tagDepth;
        }
        catch (XMLStreamException e2) {
            throw new StreamException(e2);
        }
    }

    public boolean isNamespaceRepairingMode() {
        return this.namespaceRepairingMode;
    }
}

