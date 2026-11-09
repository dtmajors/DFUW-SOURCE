/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.io.xml;

import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.xml.AbstractXmlDriver;
import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;
import com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer;
import com.thoughtworks.xstream.io.xml.XppReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class XppDriver
extends AbstractXmlDriver {
    private static boolean xppLibraryPresent;

    public XppDriver() {
        super(new XmlFriendlyReplacer());
    }

    public XppDriver(XmlFriendlyReplacer replacer) {
        super(replacer);
    }

    public HierarchicalStreamReader createReader(Reader xml) {
        this.loadLibrary();
        return new XppReader(xml, this.xmlFriendlyReplacer());
    }

    public HierarchicalStreamReader createReader(InputStream in) {
        return this.createReader(new InputStreamReader(in));
    }

    private void loadLibrary() {
        if (!xppLibraryPresent) {
            try {
                Class.forName("org.xmlpull.mxp1.MXParser");
            }
            catch (ClassNotFoundException e2) {
                throw new IllegalArgumentException("XPP3 pull parser library not present. Specify another driver. For example: new XStream(new DomDriver())");
            }
            xppLibraryPresent = true;
        }
    }

    public HierarchicalStreamWriter createWriter(Writer out) {
        return new PrettyPrintWriter(out, this.xmlFriendlyReplacer());
    }

    public HierarchicalStreamWriter createWriter(OutputStream out) {
        return this.createWriter(new OutputStreamWriter(out));
    }
}

