/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.io.xml;

import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.StreamException;
import com.thoughtworks.xstream.io.xml.AbstractPullReader;
import com.thoughtworks.xstream.io.xml.AbstractXmlDriver;
import com.thoughtworks.xstream.io.xml.QNameMap;
import com.thoughtworks.xstream.io.xml.StaxReader;
import com.thoughtworks.xstream.io.xml.StaxWriter;
import com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

public class StaxDriver
extends AbstractXmlDriver {
    private static boolean libraryPresent;
    private QNameMap qnameMap;
    private XMLInputFactory inputFactory;
    private XMLOutputFactory outputFactory;

    public StaxDriver() {
        this.qnameMap = new QNameMap();
    }

    public StaxDriver(QNameMap qnameMap) {
        this(qnameMap, false);
    }

    public StaxDriver(QNameMap qnameMap, boolean repairingNamespace) {
        this(qnameMap, new XmlFriendlyReplacer());
        this.setRepairingNamespace(repairingNamespace);
    }

    public StaxDriver(QNameMap qnameMap, XmlFriendlyReplacer replacer) {
        super(replacer);
        this.qnameMap = qnameMap;
    }

    public StaxDriver(XmlFriendlyReplacer replacer) {
        this(new QNameMap(), replacer);
    }

    public HierarchicalStreamReader createReader(Reader xml) {
        this.loadLibrary();
        try {
            return this.createStaxReader(this.createParser(xml));
        }
        catch (XMLStreamException e2) {
            throw new StreamException(e2);
        }
    }

    public HierarchicalStreamReader createReader(InputStream in) {
        this.loadLibrary();
        try {
            return this.createStaxReader(this.createParser(in));
        }
        catch (XMLStreamException e2) {
            throw new StreamException(e2);
        }
    }

    private void loadLibrary() {
        if (!libraryPresent) {
            try {
                Class.forName("javax.xml.stream.XMLStreamReader");
            }
            catch (ClassNotFoundException e2) {
                throw new IllegalArgumentException("StAX API is not present. Specify another driver. For example: new XStream(new DomDriver())");
            }
            libraryPresent = true;
        }
    }

    public HierarchicalStreamWriter createWriter(Writer out) {
        try {
            return this.createStaxWriter(this.getOutputFactory().createXMLStreamWriter(out));
        }
        catch (XMLStreamException e2) {
            throw new StreamException(e2);
        }
    }

    public HierarchicalStreamWriter createWriter(OutputStream out) {
        try {
            return this.createStaxWriter(this.getOutputFactory().createXMLStreamWriter(out));
        }
        catch (XMLStreamException e2) {
            throw new StreamException(e2);
        }
    }

    public AbstractPullReader createStaxReader(XMLStreamReader in) {
        return new StaxReader(this.qnameMap, in, this.xmlFriendlyReplacer());
    }

    public StaxWriter createStaxWriter(XMLStreamWriter out, boolean writeStartEndDocument) throws XMLStreamException {
        return new StaxWriter(this.qnameMap, out, writeStartEndDocument, this.isRepairingNamespace(), this.xmlFriendlyReplacer());
    }

    public StaxWriter createStaxWriter(XMLStreamWriter out) throws XMLStreamException {
        return this.createStaxWriter(out, true);
    }

    public QNameMap getQnameMap() {
        return this.qnameMap;
    }

    public void setQnameMap(QNameMap qnameMap) {
        this.qnameMap = qnameMap;
    }

    public XMLInputFactory getInputFactory() {
        if (this.inputFactory == null) {
            this.inputFactory = XMLInputFactory.newInstance();
        }
        return this.inputFactory;
    }

    public XMLOutputFactory getOutputFactory() {
        if (this.outputFactory == null) {
            this.outputFactory = XMLOutputFactory.newInstance();
        }
        return this.outputFactory;
    }

    public boolean isRepairingNamespace() {
        return Boolean.TRUE.equals(this.getOutputFactory().getProperty("javax.xml.stream.isRepairingNamespaces"));
    }

    public void setRepairingNamespace(boolean repairing) {
        this.getOutputFactory().setProperty("javax.xml.stream.isRepairingNamespaces", repairing ? Boolean.TRUE : Boolean.FALSE);
    }

    protected XMLStreamReader createParser(Reader xml) throws XMLStreamException {
        return this.getInputFactory().createXMLStreamReader(xml);
    }

    protected XMLStreamReader createParser(InputStream xml) throws XMLStreamException {
        return this.getInputFactory().createXMLStreamReader(xml);
    }
}

