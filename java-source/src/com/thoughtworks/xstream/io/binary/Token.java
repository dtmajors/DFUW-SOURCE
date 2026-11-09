/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.io.binary;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public abstract class Token {
    private static final byte TYPE_MASK = 7;
    public static final byte TYPE_VERSION = 1;
    public static final byte TYPE_MAP_ID_TO_VALUE = 2;
    public static final byte TYPE_START_NODE = 3;
    public static final byte TYPE_END_NODE = 4;
    public static final byte TYPE_ATTRIBUTE = 5;
    public static final byte TYPE_VALUE = 6;
    private static final byte ID_MASK = 56;
    private static final byte ID_ONE_BYTE = 8;
    private static final byte ID_TWO_BYTES = 16;
    private static final byte ID_FOUR_BYTES = 24;
    private static final byte ID_EIGHT_BYTES = 32;
    private final byte type;
    protected long id = -1L;
    protected String value;

    public Token(byte type) {
        this.type = type;
    }

    public byte getType() {
        return this.type;
    }

    public long getId() {
        return this.id;
    }

    public String getValue() {
        return this.value;
    }

    public String toString() {
        return this.getClass().getName() + " [id=" + this.id + ", value='" + this.value + "']";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Token token = (Token)o;
        if (this.id != token.id) {
            return false;
        }
        if (this.type != token.type) {
            return false;
        }
        return !(this.value == null ? token.value != null : !this.value.equals(token.value));
    }

    public int hashCode() {
        int result = this.type;
        result = 29 * result + (int)(this.id ^ this.id >>> 32);
        result = 29 * result + (this.value != null ? this.value.hashCode() : 0);
        return result;
    }

    public abstract void writeTo(DataOutput var1, byte var2) throws IOException;

    public abstract void readFrom(DataInput var1, byte var2) throws IOException;

    protected void writeId(DataOutput out, long id, byte idType) throws IOException {
        if (id < 0L) {
            throw new IOException("id must not be negative " + id);
        }
        switch (idType) {
            case 8: {
                out.writeByte((byte)id + -128);
                break;
            }
            case 16: {
                out.writeShort((short)id + Short.MIN_VALUE);
                break;
            }
            case 24: {
                out.writeInt((int)id + Integer.MIN_VALUE);
                break;
            }
            case 32: {
                out.writeLong(id + Long.MIN_VALUE);
                break;
            }
            default: {
                throw new Error("Unknown idType " + idType);
            }
        }
    }

    protected void writeString(DataOutput out, String string) throws IOException {
        out.writeUTF(string);
    }

    protected long readId(DataInput in, byte idType) throws IOException {
        switch (idType) {
            case 8: {
                return in.readByte() - -128;
            }
            case 16: {
                return in.readShort() - Short.MIN_VALUE;
            }
            case 24: {
                return in.readInt() - Integer.MIN_VALUE;
            }
            case 32: {
                return in.readLong() - Long.MIN_VALUE;
            }
        }
        throw new Error("Unknown idType " + idType);
    }

    protected String readString(DataInput in) throws IOException {
        return in.readUTF();
    }
}

