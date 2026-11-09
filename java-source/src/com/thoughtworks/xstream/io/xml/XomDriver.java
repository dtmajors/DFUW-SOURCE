/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  nu.xom.Builder
 *  nu.xom.Document
 *  nu.xom.ParsingException
 *  nu.xom.ValidityException
 */
package com.thoughtworks.xstream.io.xml;

import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.StreamException;
import com.thoughtworks.xstream.io.xml.AbstractXmlDriver;
import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;
import com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer;
import com.thoughtworks.xstream.io.xml.XomReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.ParsingException;
import nu.xom.ValidityException;

public class XomDriver
extends AbstractXmlDriver {
    private final Builder builder;

    public XomDriver() {
        this(new Builder());
    }

    public XomDriver(Builder builder) {
        this(builder, new XmlFriendlyReplacer());
    }

    public XomDriver(XmlFriendlyReplacer replacer) {
        this(new Builder(), replacer);
    }

    public XomDriver(Builder builder, XmlFriendlyReplacer replacer) {
        super(replacer);
        this.builder = builder;
    }

    protected Builder getBuilder() {
        return this.builder;
    }

    public HierarchicalStreamReader createReader(Reader text) {
        try {
            Document document = this.builder.build(text);
            return new XomReader(document, this.xmlFriendlyReplacer());
        }
        catch (ValidityException e2) {
            throw new StreamException(e2);
        }
        catch (ParsingException e3) {
            throw new StreamException(e3);
        }
        catch (IOException e4) {
            throw new StreamException(e4);
        }
    }

    public HierarchicalStreamReader createReader(InputStream in) {
        try {
            Document document = this.builder.build(in);
            return new XomReader(document, this.xmlFriendlyReplacer());
        }
        catch (ValidityException e2) {
            throw new StreamException(e2);
        }
        catch (ParsingException e3) {
            throw new StreamException(e3);
        }
        catch (IOException e4) {
            throw new StreamException(e4);
        }
    }

    public HierarchicalStreamWriter createWriter(Writer out) {
        return new PrettyPrintWriter(out, this.xmlFriendlyReplacer());
    }

    public HierarchicalStreamWriter createWriter(OutputStream out) {
        return new PrettyPrintWriter((Writer)new OutputStreamWriter(out), this.xmlFriendlyReplacer());
    }
}

