/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.core.util;

import com.thoughtworks.xstream.io.StreamException;
import java.io.IOException;
import java.io.Writer;

public class QuickWriter {
    private final Writer writer;
    private char[] buffer;
    private int pointer;

    public QuickWriter(Writer writer) {
        this(writer, 1024);
    }

    public QuickWriter(Writer writer, int bufferSize) {
        this.writer = writer;
        this.buffer = new char[bufferSize];
    }

    public void write(String str) {
        int len = str.length();
        if (this.pointer + len >= this.buffer.length) {
            this.flush();
            if (len > this.buffer.length) {
                this.raw(str.toCharArray());
                return;
            }
        }
        str.getChars(0, len, this.buffer, this.pointer);
        this.pointer += len;
    }

    public void write(char c2) {
        if (this.pointer + 1 >= this.buffer.length) {
            this.flush();
        }
        this.buffer[this.pointer++] = c2;
    }

    public void write(char[] c2) {
        int len = c2.length;
        if (this.pointer + len >= this.buffer.length) {
            this.flush();
            if (len > this.buffer.length) {
                this.raw(c2);
                return;
            }
        }
        System.arraycopy(c2, 0, this.buffer, this.pointer, len);
        this.pointer += len;
    }

    public void flush() {
        try {
            this.writer.write(this.buffer, 0, this.pointer);
            this.pointer = 0;
            this.writer.flush();
        }
        catch (IOException e2) {
            throw new StreamException(e2);
        }
    }

    public void close() {
        try {
            this.writer.write(this.buffer, 0, this.pointer);
            this.pointer = 0;
            this.writer.close();
        }
        catch (IOException e2) {
            throw new StreamException(e2);
        }
    }

    private void raw(char[] c2) {
        try {
            this.writer.write(c2);
            this.writer.flush();
        }
        catch (IOException e2) {
            throw new StreamException(e2);
        }
    }
}

