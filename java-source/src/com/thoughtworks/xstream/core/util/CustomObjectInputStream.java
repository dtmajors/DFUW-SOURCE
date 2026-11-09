/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.core.util;

import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.DataHolder;
import com.thoughtworks.xstream.core.util.CustomObjectInputStream;
import com.thoughtworks.xstream.core.util.FastStack;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.NotActiveException;
import java.io.ObjectInputStream;
import java.io.ObjectInputValidation;
import java.io.StreamCorruptedException;

public class CustomObjectInputStream
extends ObjectInputStream {
    private FastStack callbacks = new FastStack(1);
    private static final String DATA_HOLDER_KEY = (class$com$thoughtworks$xstream$core$util$CustomObjectInputStream == null ? (class$com$thoughtworks$xstream$core$util$CustomObjectInputStream = CustomObjectInputStream.class$("com.thoughtworks.xstream.core.util.CustomObjectInputStream")) : class$com$thoughtworks$xstream$core$util$CustomObjectInputStream).getName();
    static /* synthetic */ Class class$com$thoughtworks$xstream$core$util$CustomObjectInputStream;

    public static synchronized CustomObjectInputStream getInstance(DataHolder whereFrom, StreamCallback callback) {
        try {
            CustomObjectInputStream result = (CustomObjectInputStream)whereFrom.get(DATA_HOLDER_KEY);
            if (result == null) {
                result = new CustomObjectInputStream(callback);
                whereFrom.put(DATA_HOLDER_KEY, result);
            } else {
                result.pushCallback(callback);
            }
            return result;
        }
        catch (IOException e) {
            throw new ConversionException("Cannot create CustomObjectStream", e);
        }
    }

    public CustomObjectInputStream(StreamCallback callback) throws IOException, SecurityException {
        this.callbacks.push(callback);
    }

    public void pushCallback(StreamCallback callback) {
        this.callbacks.push(callback);
    }

    public StreamCallback popCallback() {
        return (StreamCallback)this.callbacks.pop();
    }

    public StreamCallback peekCallback() {
        return (StreamCallback)this.callbacks.peek();
    }

    public void defaultReadObject() throws IOException {
        this.peekCallback().defaultReadObject();
    }

    protected Object readObjectOverride() throws IOException {
        return this.peekCallback().readFromStream();
    }

    public Object readUnshared() throws IOException, ClassNotFoundException {
        return this.readObject();
    }

    public boolean readBoolean() throws IOException {
        return (Boolean)this.peekCallback().readFromStream();
    }

    public byte readByte() throws IOException {
        return (Byte)this.peekCallback().readFromStream();
    }

    public int readUnsignedByte() throws IOException {
        int b2 = ((Byte)this.peekCallback().readFromStream()).byteValue();
        if (b2 < 0) {
            b2 += 127;
        }
        return b2;
    }

    public int readInt() throws IOException {
        return (Integer)this.peekCallback().readFromStream();
    }

    public char readChar() throws IOException {
        return ((Character)this.peekCallback().readFromStream()).charValue();
    }

    public float readFloat() throws IOException {
        return ((Float)this.peekCallback().readFromStream()).floatValue();
    }

    public double readDouble() throws IOException {
        return (Double)this.peekCallback().readFromStream();
    }

    public long readLong() throws IOException {
        return (Long)this.peekCallback().readFromStream();
    }

    public short readShort() throws IOException {
        return (Short)this.peekCallback().readFromStream();
    }

    public int readUnsignedShort() throws IOException {
        int b2 = ((Short)this.peekCallback().readFromStream()).shortValue();
        if (b2 < 0) {
            b2 += Short.MAX_VALUE;
        }
        return b2;
    }

    public String readUTF() throws IOException {
        return (String)this.peekCallback().readFromStream();
    }

    public void readFully(byte[] buf) throws IOException {
        this.readFully(buf, 0, buf.length);
    }

    public void readFully(byte[] buf, int off, int len) throws IOException {
        byte[] b2 = (byte[])this.peekCallback().readFromStream();
        System.arraycopy(b2, 0, buf, off, len);
    }

    public int read() throws IOException {
        return this.readUnsignedByte();
    }

    public int read(byte[] buf, int off, int len) throws IOException {
        byte[] b2 = (byte[])this.peekCallback().readFromStream();
        if (b2.length != len) {
            throw new StreamCorruptedException("Expected " + len + " bytes from stream, got " + b2.length);
        }
        System.arraycopy(b2, 0, buf, off, len);
        return len;
    }

    public int read(byte[] b2) throws IOException {
        return this.read(b2, 0, b2.length);
    }

    public ObjectInputStream.GetField readFields() throws IOException {
        return new CustomGetField(this, this.peekCallback().readFieldsFromStream());
    }

    public void registerValidation(ObjectInputValidation validation, int priority) throws NotActiveException, InvalidObjectException {
        this.peekCallback().registerValidation(validation, priority);
    }

    public void close() throws IOException {
        this.peekCallback().close();
    }

    public int available() {
        throw new UnsupportedOperationException();
    }

    public String readLine() {
        throw new UnsupportedOperationException();
    }

    public int skipBytes(int len) {
        throw new UnsupportedOperationException();
    }

    public long skip(long n) {
        throw new UnsupportedOperationException();
    }

    public void mark(int readlimit) {
        throw new UnsupportedOperationException();
    }

    public void reset() {
        throw new UnsupportedOperationException();
    }

    public boolean markSupported() {
        return false;
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

