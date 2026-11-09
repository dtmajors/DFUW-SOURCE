/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.io.xml;

import com.thoughtworks.xstream.core.util.FastStack;
import com.thoughtworks.xstream.core.util.QuickWriter;
import com.thoughtworks.xstream.io.xml.AbstractXmlWriter;
import com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer;
import java.io.Writer;

public class PrettyPrintWriter
extends AbstractXmlWriter {
    private final QuickWriter writer;
    private final FastStack elementStack = new FastStack(16);
    private final char[] lineIndenter;
    private boolean tagInProgress;
    private int depth;
    private boolean readyForNewLine;
    private boolean tagIsEmpty;
    private String newLine;
    private static final char[] NULL = "&#x0;".toCharArray();
    private static final char[] AMP = "&amp;".toCharArray();
    private static final char[] LT = "&lt;".toCharArray();
    private static final char[] GT = "&gt;".toCharArray();
    private static final char[] SLASH_R = "&#x0D;".toCharArray();
    private static final char[] QUOT = "&quot;".toCharArray();
    private static final char[] APOS = "&apos;".toCharArray();
    private static final char[] CLOSE = "</".toCharArray();

    public PrettyPrintWriter(Writer writer, char[] lineIndenter, String newLine, XmlFriendlyReplacer replacer) {
        super(replacer);
        this.writer = new QuickWriter(writer);
        this.lineIndenter = lineIndenter;
        this.newLine = newLine;
    }

    public PrettyPrintWriter(Writer writer, char[] lineIndenter, String newLine) {
        this(writer, lineIndenter, newLine, new XmlFriendlyReplacer());
    }

    public PrettyPrintWriter(Writer writer, char[] lineIndenter) {
        this(writer, lineIndenter, "\n");
    }

    public PrettyPrintWriter(Writer writer, String lineIndenter, String newLine) {
        this(writer, lineIndenter.toCharArray(), newLine);
    }

    public PrettyPrintWriter(Writer writer, String lineIndenter) {
        this(writer, lineIndenter.toCharArray());
    }

    public PrettyPrintWriter(Writer writer, XmlFriendlyReplacer replacer) {
        this(writer, new char[]{' ', ' '}, "\n", replacer);
    }

    public PrettyPrintWriter(Writer writer) {
        this(writer, new char[]{' ', ' '});
    }

    public void startNode(String name) {
        String escapedName = this.escapeXmlName(name);
        this.tagIsEmpty = false;
        this.finishTag();
        this.writer.write('<');
        this.writer.write(escapedName);
        this.elementStack.push(escapedName);
        this.tagInProgress = true;
        ++this.depth;
        this.readyForNewLine = true;
        this.tagIsEmpty = true;
    }

    public void startNode(String name, Class clazz) {
        this.startNode(name);
    }

    public void setValue(String text) {
        this.readyForNewLine = false;
        this.tagIsEmpty = false;
        this.finishTag();
        this.writeText(this.writer, text);
    }

    public void addAttribute(String key, String value) {
        this.writer.write(' ');
        this.writer.write(this.escapeXmlName(key));
        this.writer.write('=');
        this.writer.write('\"');
        this.writeAttributeValue(this.writer, value);
        this.writer.write('\"');
    }

    protected void writeAttributeValue(QuickWriter writer, String text) {
        this.writeText(text);
    }

    protected void writeText(QuickWriter writer, String text) {
        this.writeText(text);
    }

    private void writeText(String text) {
        int length = text.length();
        block9: for (int i = 0; i < length; ++i) {
            char c2 = text.charAt(i);
            switch (c2) {
                case '\u0000': {
                    this.writer.write(NULL);
                    continue block9;
                }
                case '&': {
                    this.writer.write(AMP);
                    continue block9;
                }
                case '<': {
                    this.writer.write(LT);
                    continue block9;
                }
                case '>': {
                    this.writer.write(GT);
                    continue block9;
                }
                case '\"': {
                    this.writer.write(QUOT);
                    continue block9;
                }
                case '\'': {
                    this.writer.write(APOS);
                    continue block9;
                }
                case '\r': {
                    this.writer.write(SLASH_R);
                    continue block9;
                }
                default: {
                    this.writer.write(c2);
                }
            }
        }
    }

    public void endNode() {
        --this.depth;
        if (this.tagIsEmpty) {
            this.writer.write('/');
            this.readyForNewLine = false;
            this.finishTag();
            this.elementStack.popSilently();
        } else {
            this.finishTag();
            this.writer.write(CLOSE);
            this.writer.write((String)this.elementStack.pop());
            this.writer.write('>');
        }
        this.readyForNewLine = true;
        if (this.depth == 0) {
            this.writer.flush();
        }
    }

    private void finishTag() {
        if (this.tagInProgress) {
            this.writer.write('>');
        }
        this.tagInProgress = false;
        if (this.readyForNewLine) {
            this.endOfLine();
        }
        this.readyForNewLine = false;
        this.tagIsEmpty = false;
    }

    protected void endOfLine() {
        this.writer.write(this.newLine);
        for (int i = 0; i < this.depth; ++i) {
            this.writer.write(this.lineIndenter);
        }
    }

    public void flush() {
        this.writer.flush();
    }

    public void close() {
        this.writer.close();
    }
}

