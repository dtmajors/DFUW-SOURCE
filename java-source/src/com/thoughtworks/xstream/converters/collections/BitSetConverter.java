/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.converters.collections;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import java.util.BitSet;
import java.util.StringTokenizer;

public class BitSetConverter
implements Converter {
    static /* synthetic */ Class class$java$util$BitSet;

    public boolean canConvert(Class type) {
        return type.equals(class$java$util$BitSet == null ? (class$java$util$BitSet = BitSetConverter.class$("java.util.BitSet")) : class$java$util$BitSet);
    }

    public void marshal(Object source, HierarchicalStreamWriter writer, MarshallingContext context) {
        BitSet bitSet = (BitSet)source;
        StringBuffer buffer = new StringBuffer();
        boolean seenFirst = false;
        for (int i = 0; i < bitSet.length(); ++i) {
            if (!bitSet.get(i)) continue;
            if (seenFirst) {
                buffer.append(',');
            } else {
                seenFirst = true;
            }
            buffer.append(i);
        }
        writer.setValue(buffer.toString());
    }

    public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
        BitSet result = new BitSet();
        StringTokenizer tokenizer = new StringTokenizer(reader.getValue(), ",", false);
        while (tokenizer.hasMoreTokens()) {
            int index = Integer.parseInt(tokenizer.nextToken());
            result.set(index);
        }
        return result;
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

