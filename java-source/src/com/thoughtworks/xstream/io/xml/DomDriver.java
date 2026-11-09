/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.io.xml;

import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.StreamException;
import com.thoughtworks.xstream.io.xml.AbstractXmlDriver;
import com.thoughtworks.xstream.io.xml.DomReader;
import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;
import com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class DomDriver
extends AbstractXmlDriver {
    private final String encoding;
    private final DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();

    public DomDriver() {
        this("UTF-8");
    }

    public DomDriver(String encoding) {
        this(encoding, new XmlFriendlyReplacer());
    }

    public DomDriver(String encoding, XmlFriendlyReplacer replacer) {
        super(replacer);
        this.encoding = encoding;
    }

    public HierarchicalStreamReader createReader(Reader xml) {
        return this.createReader(new InputSource(xml));
    }

    public HierarchicalStreamReader createReader(InputStream xml) {
        return this.createReader(new InputSource(xml));
    }

    private HierarchicalStreamReader createReader(InputSource source) {
        try {
            DocumentBuilder documentBuilder = this.documentBuilderFactory.newDocumentBuilder();
            source.setEncoding(this.encoding);
            Document document = documentBuilder.parse(source);
            return new DomReader(document, this.xmlFriendlyReplacer());
        }
        catch (FactoryConfigurationError e2) {
            throw new StreamException(e2);
        }
        catch (ParserConfigurationException e3) {
            throw new StreamException(e3);
        }
        catch (SAXException e4) {
            throw new StreamException(e4);
        }
        catch (IOException e5) {
            throw new StreamException(e5);
        }
    }

    public HierarchicalStreamWriter createWriter(Writer out) {
        return new PrettyPrintWriter(out, this.xmlFriendlyReplacer());
    }

    public HierarchicalStreamWriter createWriter(OutputStream out) {
        try {
            return this.createWriter(new OutputStreamWriter(out, this.encoding));
        }
        catch (UnsupportedEncodingException e2) {
            throw new StreamException(e2);
        }
    }
}

