/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.converters.extended;

import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;
import java.io.File;

public class FileConverter
extends AbstractSingleValueConverter {
    static /* synthetic */ Class class$java$io$File;

    public boolean canConvert(Class type) {
        return type.equals(class$java$io$File == null ? (class$java$io$File = FileConverter.class$("java.io.File")) : class$java$io$File);
    }

    public Object fromString(String str) {
        return new File(str);
    }

    public String toString(Object obj) {
        return ((File)obj).getPath();
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

