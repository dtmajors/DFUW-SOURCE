/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.core.util;

import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.DataHolder;
import com.thoughtworks.xstream.core.util.CustomObjectOutputStream;
import com.thoughtworks.xstream.core.util.FastStack;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CustomObjectOutputStream
extends ObjectOutputStream {
    private FastStack callbacks = new FastStack(1);
    private FastStack customFields = new FastStack(1);
    private static final String DATA_HOLDER_KEY = (class$com$thoughtworks$xstream$core$util$CustomObjectOutputStream == null ? (class$com$thoughtworks$xstream$core$util$CustomObjectOutputStream = CustomObjectOutputStream.class$("com.thoughtworks.xstream.core.util.CustomObjectOutputStream")) : class$com$thoughtworks$xstream$core$util$CustomObjectOutputStream).getName();
    static /* synthetic */ Class class$com$thoughtworks$xstream$core$util$CustomObjectOutputStream;

    public static synchronized CustomObjectOutputStream getInstance(DataHolder whereFrom, StreamCallback callback) {
        try {
            CustomObjectOutputStream result = (CustomObjectOutputStream)whereFrom.get(DATA_HOLDER_KEY);
            if (result == null) {
                result = new CustomObjectOutputStream(callback);
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

    public CustomObjectOutputStream(StreamCallback callback) throws IOException, SecurityException {
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

    public void defaultWriteObject() throws IOException {
        this.peekCallback().defaultWriteObject();
    }

    protected void writeObjectOverride(Object obj) throws IOException {
        this.peekCallback().writeToStream(obj);
    }

    public void writeBoolean(boolean val) throws IOException {
        this.peekCallback().writeToStream(val ? Boolean.TRUE : Boolean.FALSE);
    }

    public void writeByte(int val) throws IOException {
        this.peekCallback().writeToStream(new Byte((byte)val));
    }

    public void writeInt(int val) throws IOException {
        this.peekCallback().writeToStream(new Integer(val));
    }

    public void writeChar(int val) throws IOException {
        this.peekCallback().writeToStream(new Character((char)val));
    }

    public void writeDouble(double val) throws IOException {
        this.peekCallback().writeToStream(new Double(val));
    }

    public void writeFloat(float val) throws IOException {
        this.peekCallback().writeToStream(new Float(val));
    }

    public void writeLong(long val) throws IOException {
        this.peekCallback().writeToStream(new Long(val));
    }

    public void writeShort(int val) throws IOException {
        this.peekCallback().writeToStream(new Short((short)val));
    }

    public void write(byte[] buf) throws IOException {
        this.peekCallback().writeToStream(buf);
    }

    public void writeChars(String str) throws IOException {
        this.peekCallback().writeToStream(str.toCharArray());
    }

    public void writeUTF(String str) throws IOException {
        this.peekCallback().writeToStream(str);
    }

    public void write(int val) throws IOException {
        this.peekCallback().writeToStream(new Byte((byte)val));
    }

    public void write(byte[] buf, int off, int len) throws IOException {
        byte[] b2 = new byte[len];
        System.arraycopy(buf, off, b2, 0, len);
        this.peekCallback().writeToStream(b2);
    }

    public void flush() throws IOException {
        this.peekCallback().flush();
    }

    public void close() throws IOException {
        this.peekCallback().close();
    }

    public ObjectOutputStream.PutField putFields() {
        CustomPutField result = new CustomPutField(this, null);
        this.customFields.push(result);
        return result;
    }

    public void writeFields() throws IOException {
        CustomPutField customPutField = (CustomPutField)this.customFields.pop();
        this.peekCallback().writeFieldsToStream(customPutField.asMap());
    }

    public void reset() {
        throw new UnsupportedOperationException();
    }

    public void useProtocolVersion(int version) {
        throw new UnsupportedOperationException();
    }

    public void writeBytes(String str) {
        throw new UnsupportedOperationException();
    }

    public void writeUnshared(Object obj) {
        throw new UnsupportedOperationException();
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

