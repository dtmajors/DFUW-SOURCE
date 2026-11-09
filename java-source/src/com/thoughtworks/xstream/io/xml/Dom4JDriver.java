/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  org.dom4j.Document
 *  org.dom4j.DocumentException
 *  org.dom4j.DocumentFactory
 *  org.dom4j.io.OutputFormat
 *  org.dom4j.io.SAXReader
 *  org.dom4j.io.XMLWriter
 */
package com.thoughtworks.xstream.io.xml;

import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.StreamException;
import com.thoughtworks.xstream.io.xml.AbstractXmlDriver;
import com.thoughtworks.xstream.io.xml.Dom4JReader;
import com.thoughtworks.xstream.io.xml.Dom4JXmlWriter;
import com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer;
import java.io.FilterWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentFactory;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class Dom4JDriver
extends AbstractXmlDriver {
    private DocumentFactory documentFactory;
    private OutputFormat outputFormat;

    public Dom4JDriver() {
        this(new DocumentFactory(), OutputFormat.createPrettyPrint());
        this.outputFormat.setTrimText(false);
    }

    public Dom4JDriver(DocumentFactory documentFactory, OutputFormat outputFormat) {
        this(documentFactory, outputFormat, new XmlFriendlyReplacer());
    }

    public Dom4JDriver(DocumentFactory documentFactory, OutputFormat outputFormat, XmlFriendlyReplacer replacer) {
        super(replacer);
        this.documentFactory = documentFactory;
        this.outputFormat = outputFormat;
    }

    public DocumentFactory getDocumentFactory() {
        return this.documentFactory;
    }

    public void setDocumentFactory(DocumentFactory documentFactory) {
        this.documentFactory = documentFactory;
    }

    public OutputFormat getOutputFormat() {
        return this.outputFormat;
    }

    public void setOutputFormat(OutputFormat outputFormat) {
        this.outputFormat = outputFormat;
    }

    public HierarchicalStreamReader createReader(Reader text) {
        try {
            SAXReader reader = new SAXReader();
            Document document = reader.read(text);
            return new Dom4JReader(document, this.xmlFriendlyReplacer());
        }
        catch (DocumentException e2) {
            throw new StreamException(e2);
        }
    }

    public HierarchicalStreamReader createReader(InputStream in) {
        try {
            SAXReader reader = new SAXReader();
            Document document = reader.read(in);
            return new Dom4JReader(document, this.xmlFriendlyReplacer());
        }
        catch (DocumentException e2) {
            throw new StreamException(e2);
        }
    }

    public HierarchicalStreamWriter createWriter(Writer out) {
        HierarchicalStreamWriter[] writer = new HierarchicalStreamWriter[1];
        FilterWriter filter = new FilterWriter(this, out, writer){
            private final /* synthetic */ HierarchicalStreamWriter[] val$writer;
            private final /* synthetic */ Dom4JDriver this$0;
            {
                this.this$0 = dom4JDriver;
                this.val$writer = hierarchicalStreamWriterArray;
            }

            public void close() {
                this.val$writer[0].close();
            }
        };
        writer[0] = new Dom4JXmlWriter(new XMLWriter((Writer)filter, this.outputFormat), this.xmlFriendlyReplacer());
        return writer[0];
    }

    public HierarchicalStreamWriter createWriter(OutputStream out) {
        OutputStreamWriter writer = new OutputStreamWriter(out);
        return this.createWriter(writer);
    }
}

