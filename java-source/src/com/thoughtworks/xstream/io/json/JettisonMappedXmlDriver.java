/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  org.codehaus.jettison.mapped.MappedXMLInputFactory
 *  org.codehaus.jettison.mapped.MappedXMLOutputFactory
 */
package com.thoughtworks.xstream.io.json;

import com.thoughtworks.xstream.io.HierarchicalStreamDriver;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.StreamException;
import com.thoughtworks.xstream.io.xml.QNameMap;
import com.thoughtworks.xstream.io.xml.StaxReader;
import com.thoughtworks.xstream.io.xml.StaxWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.HashMap;
import javax.xml.stream.XMLStreamException;
import org.codehaus.jettison.mapped.MappedXMLInputFactory;
import org.codehaus.jettison.mapped.MappedXMLOutputFactory;

public class JettisonMappedXmlDriver
implements HierarchicalStreamDriver {
    private final MappedXMLOutputFactory mof;
    private final MappedXMLInputFactory mif;

    public JettisonMappedXmlDriver() {
        HashMap nstjsons = new HashMap();
        this.mof = new MappedXMLOutputFactory(nstjsons);
        this.mif = new MappedXMLInputFactory(nstjsons);
    }

    public HierarchicalStreamReader createReader(Reader reader) {
        try {
            return new StaxReader(new QNameMap(), this.mif.createXMLStreamReader(reader));
        }
        catch (XMLStreamException e2) {
            throw new StreamException(e2);
        }
    }

    public HierarchicalStreamReader createReader(InputStream input) {
        try {
            return new StaxReader(new QNameMap(), this.mif.createXMLStreamReader(input));
        }
        catch (XMLStreamException e2) {
            throw new StreamException(e2);
        }
    }

    public HierarchicalStreamWriter createWriter(Writer writer) {
        try {
            return new StaxWriter(new QNameMap(), this.mof.createXMLStreamWriter(writer));
        }
        catch (XMLStreamException e2) {
            throw new StreamException(e2);
        }
    }

    public HierarchicalStreamWriter createWriter(OutputStream output) {
        try {
            return new StaxWriter(new QNameMap(), this.mof.createXMLStreamWriter(output));
        }
        catch (XMLStreamException e2) {
            throw new StreamException(e2);
        }
    }
}

