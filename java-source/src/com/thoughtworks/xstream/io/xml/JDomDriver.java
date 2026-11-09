/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  org.jdom.Document
 *  org.jdom.JDOMException
 *  org.jdom.input.SAXBuilder
 */
package com.thoughtworks.xstream.io.xml;

import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.StreamException;
import com.thoughtworks.xstream.io.xml.AbstractXmlDriver;
import com.thoughtworks.xstream.io.xml.JDomReader;
import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;
import com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import org.jdom.Document;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

public class JDomDriver
extends AbstractXmlDriver {
    public JDomDriver() {
        super(new XmlFriendlyReplacer());
    }

    public JDomDriver(XmlFriendlyReplacer replacer) {
        super(replacer);
    }

    public HierarchicalStreamReader createReader(Reader reader) {
        try {
            SAXBuilder builder = new SAXBuilder();
            Document document = builder.build(reader);
            return new JDomReader(document, this.xmlFriendlyReplacer());
        }
        catch (IOException e2) {
            throw new StreamException(e2);
        }
        catch (JDOMException e3) {
            throw new StreamException(e3);
        }
    }

    public HierarchicalStreamReader createReader(InputStream in) {
        try {
            SAXBuilder builder = new SAXBuilder();
            Document document = builder.build(in);
            return new JDomReader(document, this.xmlFriendlyReplacer());
        }
        catch (IOException e2) {
            throw new StreamException(e2);
        }
        catch (JDOMException e3) {
            throw new StreamException(e3);
        }
    }

    public HierarchicalStreamWriter createWriter(Writer out) {
        return new PrettyPrintWriter(out, this.xmlFriendlyReplacer());
    }

    public HierarchicalStreamWriter createWriter(OutputStream out) {
        return new PrettyPrintWriter(new OutputStreamWriter(out));
    }
}

