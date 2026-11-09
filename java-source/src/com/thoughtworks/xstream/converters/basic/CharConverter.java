/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.converters.basic;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

public class CharConverter
implements Converter {
    static /* synthetic */ Class class$java$lang$Character;

    public boolean canConvert(Class type) {
        return type.equals(Character.TYPE) || type.equals(class$java$lang$Character == null ? (class$java$lang$Character = CharConverter.class$("java.lang.Character")) : class$java$lang$Character);
    }

    public void marshal(Object source, HierarchicalStreamWriter writer, MarshallingContext context) {
        if (source.toString().equals("\u0000")) {
            writer.addAttribute("null", "true");
        } else {
            writer.setValue(source.toString());
        }
    }

    public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
        String nullAttribute = reader.getAttribute("null");
        if (nullAttribute != null && nullAttribute.equals("true")) {
            return new Character('\u0000');
        }
        return new Character(reader.getValue().charAt(0));
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

