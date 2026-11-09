/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.io.json;

import com.thoughtworks.xstream.core.util.FastStack;
import com.thoughtworks.xstream.core.util.QuickWriter;
import com.thoughtworks.xstream.io.ExtendedHierarchicalStreamWriter;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.json.JsonHierarchicalStreamWriter;
import java.io.Writer;

public class JsonHierarchicalStreamWriter
implements ExtendedHierarchicalStreamWriter {
    private final QuickWriter writer;
    private final FastStack elementStack = new FastStack(16);
    private final char[] lineIndenter;
    private int depth;
    private boolean readyForNewLine;
    private boolean tagIsEmpty;
    private String newLine;
    static /* synthetic */ Class class$java$util$Collection;
    static /* synthetic */ Class class$java$lang$Integer;
    static /* synthetic */ Class class$java$lang$Boolean;
    static /* synthetic */ Class class$java$lang$String;

    public JsonHierarchicalStreamWriter(Writer writer, char[] lineIndenter, String newLine) {
        this.writer = new QuickWriter(writer);
        this.lineIndenter = lineIndenter;
        this.newLine = newLine;
    }

    public JsonHierarchicalStreamWriter(Writer writer, char[] lineIndenter) {
        this(writer, lineIndenter, "\n");
    }

    public JsonHierarchicalStreamWriter(Writer writer, String lineIndenter, String newLine) {
        this(writer, lineIndenter.toCharArray(), newLine);
    }

    public JsonHierarchicalStreamWriter(Writer writer, String lineIndenter) {
        this(writer, lineIndenter.toCharArray());
    }

    public JsonHierarchicalStreamWriter(Writer writer) {
        this(writer, new char[]{' ', ' '});
    }

    public void startNode(String name) {
        this.startNode(name, null);
    }

    public void startNode(String name, Class clazz) {
        Node currNode = (Node)this.elementStack.peek();
        if (currNode == null) {
            this.writer.write("{");
        }
        if (currNode != null && currNode.fieldAlready) {
            this.writer.write(",");
        }
        this.tagIsEmpty = false;
        this.finishTag();
        if (currNode == null || currNode.clazz != null && !(class$java$util$Collection == null ? (class$java$util$Collection = JsonHierarchicalStreamWriter.class$("java.util.Collection")) : class$java$util$Collection).isAssignableFrom(currNode.clazz) && !currNode.clazz.isArray()) {
            this.writer.write("\"");
            this.writer.write(name);
            this.writer.write("\": ");
        }
        if (clazz != null && ((class$java$util$Collection == null ? (class$java$util$Collection = JsonHierarchicalStreamWriter.class$("java.util.Collection")) : class$java$util$Collection).isAssignableFrom(clazz) || clazz.isArray())) {
            this.writer.write("[");
        } else if (this.hasChildren(clazz)) {
            this.writer.write("{");
        }
        if (currNode != null) {
            currNode.fieldAlready = true;
        }
        this.elementStack.push(new Node(this, name, clazz));
        ++this.depth;
        this.readyForNewLine = true;
        this.tagIsEmpty = true;
    }

    public void setValue(String text) {
        this.readyForNewLine = false;
        this.tagIsEmpty = false;
        this.finishTag();
        this.writeText(this.writer, text);
    }

    public void addAttribute(String key, String value) {
        this.writer.write(" \"");
        this.writer.write(key);
        this.writer.write("\" :");
        this.writeAttributeValue(this.writer, value);
        this.writer.write('\"');
    }

    protected void writeAttributeValue(QuickWriter writer, String text) {
        this.writeText(text, null);
    }

    protected void writeText(QuickWriter writer, String text) {
        Node foo = (Node)this.elementStack.peek();
        this.writeText(text, foo.clazz);
    }

    private void writeText(String text, Class clazz) {
        int idxSlash;
        int idxQuote;
        int idx;
        if (this.needsQuotes(clazz)) {
            this.writer.write("\"");
        }
        int i = 0;
        while ((idx = Math.min((idxQuote = text.indexOf(34, i)) < 0 ? Integer.MAX_VALUE : idxQuote, (idxSlash = text.indexOf(92, i)) < 0 ? Integer.MAX_VALUE : idxSlash)) != Integer.MAX_VALUE) {
            if (idx != 0) {
                this.writer.write(text.substring(i, idx));
            }
            if (idx == idxQuote) {
                this.writer.write("\\\"");
            } else {
                this.writer.write("\\\\");
            }
            i = idx + 1;
        }
        this.writer.write(text.substring(i));
        if (this.needsQuotes(clazz)) {
            this.writer.write("\"");
        }
    }

    private boolean needsQuotes(Class clazz) {
        if (clazz == Integer.TYPE || clazz == (class$java$lang$Integer == null ? (class$java$lang$Integer = JsonHierarchicalStreamWriter.class$("java.lang.Integer")) : class$java$lang$Integer)) {
            return false;
        }
        return clazz != Boolean.TYPE && clazz != (class$java$lang$Boolean == null ? (class$java$lang$Boolean = JsonHierarchicalStreamWriter.class$("java.lang.Boolean")) : class$java$lang$Boolean);
    }

    public void endNode() {
        --this.depth;
        Node node = (Node)this.elementStack.pop();
        if (this.tagIsEmpty && !this.hasChildren(node.clazz)) {
            this.readyForNewLine = false;
            this.finishTag();
        } else {
            this.finishTag();
            if (node.clazz != null && ((class$java$util$Collection == null ? (class$java$util$Collection = JsonHierarchicalStreamWriter.class$("java.util.Collection")) : class$java$util$Collection).isAssignableFrom(node.clazz) || node.clazz.isArray())) {
                this.writer.write("]");
            } else if (this.hasChildren(node.clazz)) {
                this.writer.write("}");
            }
        }
        this.readyForNewLine = true;
        if (this.depth == 0) {
            this.writer.write("}");
            this.writer.flush();
        }
    }

    private boolean hasChildren(Class clazz) {
        if (clazz == (class$java$lang$String == null ? (class$java$lang$String = JsonHierarchicalStreamWriter.class$("java.lang.String")) : class$java$lang$String)) {
            return false;
        }
        return this.needsQuotes(clazz);
    }

    private void finishTag() {
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

    public HierarchicalStreamWriter underlyingWriter() {
        return this;
    }

    static /* synthetic */ Class class$(String x0) {
        try {
            return Class.forName(x0);
        }
        catch (ClassNotFoundException x1) {
            throw new NoClassDefFoundError(x1.getMessage());
        }
    }
}

