/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.core.util;

import java.util.HashMap;
import java.util.Map;

public final class Primitives {
    private static final Map BOX = new HashMap();
    private static final Map UNBOX = new HashMap();
    static /* synthetic */ Class class$java$lang$Byte;
    static /* synthetic */ Class class$java$lang$Character;
    static /* synthetic */ Class class$java$lang$Short;
    static /* synthetic */ Class class$java$lang$Integer;
    static /* synthetic */ Class class$java$lang$Long;
    static /* synthetic */ Class class$java$lang$Float;
    static /* synthetic */ Class class$java$lang$Double;
    static /* synthetic */ Class class$java$lang$Boolean;
    static /* synthetic */ Class class$java$lang$Void;

    public static Class box(Class type) {
        return (Class)BOX.get(type);
    }

    public static Class unbox(Class type) {
        return (Class)UNBOX.get(type);
    }

    static /* synthetic */ Class class$(String x0) {
        try {
            return Class.forName(x0);
        }
        catch (ClassNotFoundException x1) {
            throw new NoClassDefFoundError(x1.getMessage());
        }
    }

    static {
        Class[][] boxing = new Class[][]{{Byte.TYPE, class$java$lang$Byte == null ? (class$java$lang$Byte = Primitives.class$("java.lang.Byte")) : class$java$lang$Byte}, {Character.TYPE, class$java$lang$Character == null ? (class$java$lang$Character = Primitives.class$("java.lang.Character")) : class$java$lang$Character}, {Short.TYPE, class$java$lang$Short == null ? (class$java$lang$Short = Primitives.class$("java.lang.Short")) : class$java$lang$Short}, {Integer.TYPE, class$java$lang$Integer == null ? (class$java$lang$Integer = Primitives.class$("java.lang.Integer")) : class$java$lang$Integer}, {Long.TYPE, class$java$lang$Long == null ? (class$java$lang$Long = Primitives.class$("java.lang.Long")) : class$java$lang$Long}, {Float.TYPE, class$java$lang$Float == null ? (class$java$lang$Float = Primitives.class$("java.lang.Float")) : class$java$lang$Float}, {Double.TYPE, class$java$lang$Double == null ? (class$java$lang$Double = Primitives.class$("java.lang.Double")) : class$java$lang$Double}, {Boolean.TYPE, class$java$lang$Boolean == null ? (class$java$lang$Boolean = Primitives.class$("java.lang.Boolean")) : class$java$lang$Boolean}, {Void.TYPE, class$java$lang$Void == null ? (class$java$lang$Void = Primitives.class$("java.lang.Void")) : class$java$lang$Void}};
        for (int i = 0; i < boxing.length; ++i) {
            BOX.put(boxing[i][0], boxing[i][1]);
            UNBOX.put(boxing[i][1], boxing[i][0]);
        }
    }
}

