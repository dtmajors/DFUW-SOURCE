/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.converters.extended;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import java.util.regex.Pattern;

public class RegexPatternConverter
implements Converter {
    private Converter defaultConverter;
    static /* synthetic */ Class class$java$util$regex$Pattern;

    public RegexPatternConverter(Converter defaultConverter) {
        this.defaultConverter = defaultConverter;
    }

    public boolean canConvert(Class type) {
        return type.equals(class$java$util$regex$Pattern == null ? (class$java$util$regex$Pattern = RegexPatternConverter.class$("java.util.regex.Pattern")) : class$java$util$regex$Pattern);
    }

    public void marshal(Object source, HierarchicalStreamWriter writer, MarshallingContext context) {
        this.defaultConverter.marshal(source, writer, context);
    }

    public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
        Pattern notCompiled = (Pattern)this.defaultConverter.unmarshal(reader, context);
        return Pattern.compile(notCompiled.pattern(), notCompiled.flags());
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

