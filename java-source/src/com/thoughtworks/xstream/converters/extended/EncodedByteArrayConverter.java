/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.converters.extended;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.converters.basic.ByteConverter;
import com.thoughtworks.xstream.core.util.Base64Encoder;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;

public class EncodedByteArrayConverter
implements Converter {
    private static final Base64Encoder base64 = new Base64Encoder();
    private static final ByteConverter byteConverter = new ByteConverter();

    public boolean canConvert(Class type) {
        return type.isArray() && type.getComponentType().equals(Byte.TYPE);
    }

    public void marshal(Object source, HierarchicalStreamWriter writer, MarshallingContext context) {
        writer.setValue(base64.encode((byte[])source));
    }

    public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
        String data = reader.getValue();
        if (!reader.hasMoreChildren()) {
            return base64.decode(data);
        }
        return this.unmarshalIndividualByteElements(reader, context);
    }

    private Object unmarshalIndividualByteElements(HierarchicalStreamReader reader, UnmarshallingContext context) {
        ArrayList<Object> bytes = new ArrayList<Object>();
        boolean firstIteration = true;
        while (firstIteration || reader.hasMoreChildren()) {
            reader.moveDown();
            bytes.add(byteConverter.fromString(reader.getValue()));
            reader.moveUp();
            firstIteration = false;
        }
        byte[] result = new byte[bytes.size()];
        int i = 0;
        Iterator iterator = bytes.iterator();
        while (iterator.hasNext()) {
            Byte b2 = (Byte)iterator.next();
            result[i] = b2;
            ++i;
        }
        return result;
    }
}

