/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.converters.collections;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.core.util.Fields;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

public class PropertiesConverter
implements Converter {
    private static final Field defaultsField = Fields.find(class$java$util$Properties == null ? (class$java$util$Properties = PropertiesConverter.class$("java.util.Properties")) : class$java$util$Properties, "defaults");
    static /* synthetic */ Class class$java$util$Properties;

    public boolean canConvert(Class type) {
        return (class$java$util$Properties == null ? (class$java$util$Properties = PropertiesConverter.class$("java.util.Properties")) : class$java$util$Properties) == type;
    }

    public void marshal(Object source, HierarchicalStreamWriter writer, MarshallingContext context) {
        Properties properties = (Properties)source;
        Iterator<Map.Entry<Object, Object>> iterator = properties.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Object, Object> entry = iterator.next();
            writer.startNode("property");
            writer.addAttribute("name", entry.getKey().toString());
            writer.addAttribute("value", entry.getValue().toString());
            writer.endNode();
        }
        Properties defaults = (Properties)Fields.read(defaultsField, properties);
        if (defaults != null) {
            writer.startNode("defaults");
            this.marshal(defaults, writer, context);
            writer.endNode();
        }
    }

    public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
        Properties properties = new Properties();
        while (reader.hasMoreChildren()) {
            reader.moveDown();
            if (reader.getNodeName().equals("defaults")) {
                Properties defaults = (Properties)this.unmarshal(reader, context);
                Fields.write(defaultsField, properties, defaults);
            } else {
                String name = reader.getAttribute("name");
                String value = reader.getAttribute("value");
                properties.setProperty(name, value);
            }
            reader.moveUp();
        }
        return properties;
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

