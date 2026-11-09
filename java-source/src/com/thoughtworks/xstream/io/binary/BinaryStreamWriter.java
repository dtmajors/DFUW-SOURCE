/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.io.binary;

import com.thoughtworks.xstream.io.ExtendedHierarchicalStreamWriter;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.StreamException;
import com.thoughtworks.xstream.io.binary.BinaryStreamWriter;
import com.thoughtworks.xstream.io.binary.Token;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class BinaryStreamWriter
implements ExtendedHierarchicalStreamWriter {
    private final IdRegistry idRegistry = new IdRegistry(this, null);
    private final DataOutputStream out;
    private final Token.Formatter tokenFormatter = new Token.Formatter();

    public BinaryStreamWriter(OutputStream outputStream) {
        this.out = new DataOutputStream(outputStream);
    }

    public void startNode(String name) {
        this.write(new Token.StartNode(this.idRegistry.getId(name)));
    }

    public void startNode(String name, Class clazz) {
        this.startNode(name);
    }

    public void addAttribute(String name, String value) {
        this.write(new Token.Attribute(this.idRegistry.getId(name), value));
    }

    public void setValue(String text) {
        this.write(new Token.Value(text));
    }

    public void endNode() {
        this.write(new Token.EndNode());
    }

    public void flush() {
        try {
            this.out.flush();
        }
        catch (IOException e2) {
            throw new StreamException(e2);
        }
    }

    public void close() {
        try {
            this.out.close();
        }
        catch (IOException e2) {
            throw new StreamException(e2);
        }
    }

    public HierarchicalStreamWriter underlyingWriter() {
        return this;
    }

    private void write(Token token) {
        try {
            this.tokenFormatter.write(this.out, token);
        }
        catch (IOException e2) {
            throw new StreamException(e2);
        }
    }

    static /* synthetic */ void access$100(BinaryStreamWriter x0, Token x1) {
        x0.write(x1);
    }
}

