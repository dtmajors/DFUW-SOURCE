/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.converters.extended;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.util.Map;
import javax.swing.plaf.FontUIResource;

public class FontConverter
implements Converter {
    static /* synthetic */ Class class$java$util$Map;
    static /* synthetic */ Class class$javax$swing$plaf$FontUIResource;

    public boolean canConvert(Class type) {
        return type.getName().equals("java.awt.Font") || type.getName().equals("javax.swing.plaf.FontUIResource");
    }

    public void marshal(Object source, HierarchicalStreamWriter writer, MarshallingContext context) {
        Font font = (Font)source;
        Map<TextAttribute, ?> attributes = font.getAttributes();
        writer.startNode("attributes");
        context.convertAnother(attributes);
        writer.endNode();
    }

    public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
        reader.moveDown();
        Map attributes = (Map)context.convertAnother(null, class$java$util$Map == null ? (class$java$util$Map = FontConverter.class$("java.util.Map")) : class$java$util$Map);
        reader.moveUp();
        Font font = Font.getFont(attributes);
        if (context.getRequiredType() == (class$javax$swing$plaf$FontUIResource == null ? (class$javax$swing$plaf$FontUIResource = FontConverter.class$("javax.swing.plaf.FontUIResource")) : class$javax$swing$plaf$FontUIResource)) {
            return new FontUIResource(font);
        }
        return font;
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

