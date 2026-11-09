/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.converters.basic;

import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

public class StringConverter
extends AbstractSingleValueConverter {
    private final Map cache;
    static /* synthetic */ Class class$java$lang$String;

    public StringConverter(Map map) {
        this.cache = map;
    }

    public StringConverter() {
        this(Collections.synchronizedMap(new WeakHashMap()));
    }

    public boolean canConvert(Class type) {
        return type.equals(class$java$lang$String == null ? (class$java$lang$String = StringConverter.class$("java.lang.String")) : class$java$lang$String);
    }

    public Object fromString(String str) {
        String s = (String)this.cache.get(str);
        if (s == null) {
            this.cache.put(str, str);
            s = str;
        }
        return s;
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

