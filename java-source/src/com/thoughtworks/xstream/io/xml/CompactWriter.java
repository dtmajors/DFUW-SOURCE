/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.io.xml;

import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;
import com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer;
import java.io.Writer;

public class CompactWriter
extends PrettyPrintWriter {
    public CompactWriter(Writer writer) {
        super(writer);
    }

    public CompactWriter(Writer writer, XmlFriendlyReplacer replacer) {
        super(writer, replacer);
    }

    protected void endOfLine() {
    }
}

