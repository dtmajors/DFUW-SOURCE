/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.core;

import com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider;
import com.thoughtworks.xstream.converters.reflection.ReflectionProvider;
import java.lang.reflect.Field;
import java.security.AccessControlException;
import java.util.HashMap;
import java.util.Map;

public class JVM {
    private ReflectionProvider reflectionProvider;
    private Map loaderCache = new HashMap();
    private final boolean supportsAWT = this.loadClass("java.awt.Color") != null;
    private final boolean supportsSQL = this.loadClass("java.sql.Date") != null;
    private static final boolean reverseFieldOrder;
    private static final float majorJavaVersion;
    static final float DEFAULT_JAVA_VERSION = 1.3f;
    static /* synthetic */ Class class$java$text$AttributedString;

    private static final float getMajorJavaVersion() {
        try {
            return Float.parseFloat(System.getProperty("java.specification.version"));
        }
        catch (NumberFormatException e) {
            return 1.3f;
        }
    }

    public static boolean is14() {
        return majorJavaVersion >= 1.4f;
    }

    public static boolean is15() {
        return majorJavaVersion >= 1.5f;
    }

    public static boolean is16() {
        return majorJavaVersion >= 1.6f;
    }

    private static boolean isSun() {
        return System.getProperty("java.vm.vendor").indexOf("Sun") != -1;
    }

    private static boolean isApple() {
        return System.getProperty("java.vm.vendor").indexOf("Apple") != -1;
    }

    private static boolean isHPUX() {
        return System.getProperty("java.vm.vendor").indexOf("Hewlett-Packard Company") != -1;
    }

    private static boolean isIBM() {
        return System.getProperty("java.vm.vendor").indexOf("IBM") != -1;
    }

    private static boolean isBlackdown() {
        return System.getProperty("java.vm.vendor").indexOf("Blackdown") != -1;
    }

    private static boolean isBEAWithUnsafeSupport() {
        if (System.getProperty("java.vm.vendor").indexOf("BEA") != -1) {
            String vmVersion = System.getProperty("java.vm.version");
            if (vmVersion.startsWith("R")) {
                return true;
            }
            String vmInfo = System.getProperty("java.vm.info");
            if (vmInfo != null) {
                return vmInfo.startsWith("R25.1") || vmInfo.startsWith("R25.2");
            }
        }
        return false;
    }

    private static boolean isHitachi() {
        return System.getProperty("java.vm.vendor").indexOf("Hitachi") != -1;
    }

    public Class loadClass(String name) {
        try {
            Class<?> clazz = (Class<?>)this.loaderCache.get(name);
            if (clazz == null) {
                clazz = Class.forName(name, false, this.getClass().getClassLoader());
                this.loaderCache.put(name, clazz);
            }
            return clazz;
        }
        catch (ClassNotFoundException e) {
            return null;
        }
    }

    public synchronized ReflectionProvider bestReflectionProvider() {
        if (this.reflectionProvider == null) {
            try {
                if (this.canUseSun14ReflectionProvider()) {
                    String cls2 = "com.thoughtworks.xstream.converters.reflection.Sun14ReflectionProvider";
                    this.reflectionProvider = (ReflectionProvider)this.loadClass(cls2).newInstance();
                } else {
                    this.reflectionProvider = new PureJavaReflectionProvider();
                }
            }
            catch (InstantiationException e) {
                this.reflectionProvider = new PureJavaReflectionProvider();
            }
            catch (IllegalAccessException e) {
                this.reflectionProvider = new PureJavaReflectionProvider();
            }
            catch (AccessControlException e) {
                this.reflectionProvider = new PureJavaReflectionProvider();
            }
        }
        return this.reflectionProvider;
    }

    private boolean canUseSun14ReflectionProvider() {
        return (JVM.isSun() || JVM.isApple() || JVM.isHPUX() || JVM.isIBM() || JVM.isBlackdown() || JVM.isBEAWithUnsafeSupport() || JVM.isHitachi()) && JVM.is14() && this.loadClass("sun.misc.Unsafe") != null;
    }

    public static boolean reverseFieldDefinition() {
        return reverseFieldOrder;
    }

    public boolean supportsAWT() {
        return this.supportsAWT;
    }

    public boolean supportsSQL() {
        return this.supportsSQL;
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
        majorJavaVersion = JVM.getMajorJavaVersion();
        boolean reverse = false;
        Field[] fields = (class$java$text$AttributedString == null ? (class$java$text$AttributedString = JVM.class$("java.text.AttributedString")) : class$java$text$AttributedString).getDeclaredFields();
        for (int i = 0; i < fields.length; ++i) {
            if (!fields[i].getName().equals("text")) continue;
            reverse = i > 3;
        }
        reverseFieldOrder = reverse;
    }
}

